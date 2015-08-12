package example;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractButton;
import javax.swing.DefaultButtonModel;

public class SwitchButton extends AbstractButton {

	private static final long serialVersionUID = 1L;
	private Color colorBright = new Color(220, 220, 220);
	private Color colorDark = new Color(150, 150, 150);
	private Color black = new Color(0, 0, 0, 100);
	private Color white = new Color(255, 255, 255, 100);
	private Color light = new Color(220, 220, 220, 100);
	private Color red = new Color(255, 0, 0);
	private Color green = new Color(0, 153, 0);
	private Font font;
	private int gap = 5;

	private int windowHeight = 0;
	private int windowWidth = 0;

	private int globalWitdh = 0;
	private String trueLabel;
	private String falseLabel;
	private final String trueLabelText;
	private final String falseLabelText;
	private Dimension thumbBounds;
	private int max;

	public SwitchButton(String trueLabel, String falseLabel) {
		this.trueLabelText=trueLabel;
		this.falseLabelText=falseLabel;
		this.trueLabel = this.trueLabelText;
		this.falseLabel =this.falseLabelText;
		setModel(new DefaultButtonModel());
		setSelected(false);

		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (new Rectangle(getPreferredSize()).contains(e.getPoint())) {
					setSelected(!isSelected());
				}
			}
		});
	}

	@Override
	public Dimension getPreferredSize() {

		return new Dimension(globalWitdh, thumbBounds.height);
	}

	@Override
	public void setFont(Font font) {
		this.font=font;
		this.trueLabel = this.trueLabelText;
		this.falseLabel =this.falseLabelText;
		double trueLenth = getFontMetrics(font).getStringBounds(trueLabel, getGraphics()).getWidth();
		double falseLenght = getFontMetrics(font).getStringBounds(falseLabel, getGraphics()).getWidth();
		double minHeigth = getFontMetrics(font).getStringBounds(trueLabel, getGraphics()).getHeight();
		max = (int) Math.max(trueLenth, falseLenght) + 5;
		gap = Math.max(5, 5 + (int) Math.abs(trueLenth - falseLenght));
		int minWidth = max + gap * 2;
		System.out.println("setFont 1:"+trueLenth + " : " + falseLenght+" :  "+getFont().getSize());
		System.out.println("setFont 1:"+minWidth + " : " + minHeigth);

		if ((minWidth > getWindowWidth() / 2) || (minHeigth > getWindowHeight())) {
			this.trueLabel = "!";
			this.falseLabel = "!";
			System.out.println("setFont 12:"+minWidth + " : " + minHeigth);
		}
		minWidth = getWindowWidth() / 2;
		minHeigth = getWindowHeight();
		thumbBounds = new Dimension(minWidth, (int) minHeigth);
		globalWitdh = minWidth * 2;

		System.out.println("setFont " + globalWitdh + " : " + minHeigth);
		setModel(new DefaultButtonModel());
		setSelected(false);
		repaint();
		
	}

	@Override
	public void setBounds(int x, int y, int width, int height) {
		setWindowHeight(height);
		setWindowWidth(width);
		this.trueLabel = this.trueLabelText;
		this.falseLabel =this.falseLabelText;
		
		int fontHeight = (getWindowHeight() * 4) / 15;
		font = new Font("Serif", Font.PLAIN, fontHeight);

		double trueLenth = getFontMetrics(getFont()).getStringBounds(trueLabel, getGraphics()).getWidth();
		double falseLenght = getFontMetrics(getFont()).getStringBounds(falseLabel, getGraphics()).getWidth();
		double minHeigth = getFontMetrics(getFont()).getStringBounds(trueLabel, getGraphics()).getHeight();
		System.out.println("setBounds 1:"+trueLenth + " : " + falseLenght);
		max = (int) Math.max(trueLenth, falseLenght) + 5;
		gap = Math.max(5, 5 + (int) Math.abs(trueLenth - falseLenght));
		int minWidth = max + gap * 2;
		System.out.println("setBounds 1:"+minWidth + " : " + minHeigth);
		if (minWidth > getWindowWidth() / 2) {
			this.trueLabel = "!";
			this.falseLabel = "!";
		}
		minWidth = getWindowWidth() / 2;
		minHeigth = getWindowHeight();
		thumbBounds = new Dimension(minWidth, (int) minHeigth);
		globalWitdh = minWidth * 2;

		System.out.println("setBounds "+globalWitdh + " : " + minHeigth);
		setModel(new DefaultButtonModel());
		setSelected(false);
		repaint();
		super.setBounds(x, y, width, height);
	}

	@Override
	public void setSelected(boolean b) {
		if (b) {
			setText(trueLabel);
			setBackground(green);

		} else {
			setBackground(red);
			setText(falseLabel);
		}
		super.setSelected(b);
	}

	@Override
	public void setText(String text) {
		super.setText(text);
	}

	@Override
	public int getHeight() {
		return getPreferredSize().height;
	}

	@Override
	public int getWidth() {
		return getPreferredSize().width;
	}

	@Override
	public Font getFont() {
		return font;
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.setColor(getBackground());
		g.fillRoundRect(1, 1, getWidth() - 2 - 1, getHeight() - 2, 2, 2);
		Graphics2D g2 = (Graphics2D) g;

		g2.setColor(black);
		g2.drawRoundRect(1, 1, getWidth() - 2 - 1, getHeight() - 2 - 1, 2, 2);
		g2.setColor(white);
		g2.drawRoundRect(1 + 1, 1 + 1, getWidth() - 2 - 3, getHeight() - 2 - 3, 2, 2);

		int x = 0;
		int lx = 0;
		if (isSelected()) {
			lx = thumbBounds.width;
		} else {
			x = thumbBounds.width;
		}
		int y = 0;

		int w = thumbBounds.width;
		int h = thumbBounds.height;

		g2.setPaint(new GradientPaint(x, (int) (y - 0.1 * h), colorDark, x, (int) (y + 1.2 * h), light));
		g2.fillRect(x, y, w, h);
		g2.setPaint(new GradientPaint(x, (int) (y + .65 * h), light, x, (int) (y + 1.3 * h), colorDark));
		g2.fillRect(x, (int) (y + .65 * h), w, (int) (h - .65 * h));

		if (w > 14) {
			int size = 10;
			g2.setColor(colorBright);
			g2.fillRect(x + w / 2 - size / 2, y + h / 2 - size / 2, size, size);
			g2.setColor(new Color(120, 120, 120));
			g2.fillRect(x + w / 2 - 4, h / 2 - 4, 2, 2);
			g2.fillRect(x + w / 2 - 1, h / 2 - 4, 2, 2);
			g2.fillRect(x + w / 2 + 2, h / 2 - 4, 2, 2);
			g2.setColor(colorDark);
			g2.fillRect(x + w / 2 - 4, h / 2 - 2, 2, 6);
			g2.fillRect(x + w / 2 - 1, h / 2 - 2, 2, 6);
			g2.fillRect(x + w / 2 + 2, h / 2 - 2, 2, 6);
			g2.setColor(new Color(170, 170, 170));
			g2.fillRect(x + w / 2 - 4, h / 2 + 2, 2, 2);
			g2.fillRect(x + w / 2 - 1, h / 2 + 2, 2, 2);
			g2.fillRect(x + w / 2 + 2, h / 2 + 2, 2, 2);
		}

		g2.setColor(black);
		g2.drawRoundRect(x, y, w - 1, h - 1, 2, 2);
		g2.setColor(white);
		g2.drawRoundRect(x + 1, y + 1, w - 3, h - 3, 2, 2);

		g2.setColor(black.darker());
		g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g2.setFont(getFont());
		g2.drawString(getText(), lx + gap, y + h / 2 + h / 4);
	}

	public int getWindowHeight() {
		return windowHeight;
	}

	public void setWindowHeight(int windowHeight) {
		this.windowHeight = windowHeight;
		this.repaint();
	}

	public int getWindowWidth() {
		return windowWidth;
	}

	public void setWindowWidth(int windowWidth) {
		this.windowWidth = windowWidth;
	}

}
