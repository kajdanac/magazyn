
public class Program
{
	Program()
	{
		
	}
	public void run()
	{
		init();
		EventQueue.invokeLater(new Runnable()
		{
			
			@Override
			public void run()
			{
				window = new Window();
				window.setVisible(true);
			}
		});
	}
	public void init()
	{
		
	}
}
