import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 533978213108324308L;
	Painter brush;
	Window()
	{
		brush = new Painter();
		brush.setSize(new Dimension(800, 600));
		this.setSize(new Dimension(807, 629));
		this.setTitle("Storage");
		this.setResizable(false);
		init();
		attach();
	}
	
	public void init()
	{
		
	}
	
	public void attach()
	{
		
	}
}
