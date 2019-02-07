package lab3;

public class RabbitModel2 {
	  private int Population;
	  private int Year = 1;
	  public RabbitModel2()
	  {
		  Population = 0;
	  }
	  
	  public int getPopulation()
	  {
	    return Population;
	  }
	  
	  public void simulateYear()
	  {
		  Population += 1;
		  Population = Population % 5;
	  }
	  
	  public void reset()
	  {
		  Population = 0;
		  Year = 1;
	      return;
	  }
}
