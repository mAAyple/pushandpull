package lab3;
public class RabbitModel4 {
	  private int Population;
	  private int Year;
	  private int yearBefore;
	  public RabbitModel4()
	  {
		  Population = 0;
		  Year = 1;
		  yearBefore = 0;
	  }
	  
	  public int getPopulation()
	  {
	    return Population;
	  }
	  
	  public void simulateYear()
	  {
		  Population = Year + yearBefore;
		  Year++;
		  yearBefore += 1;
	  }
	  
	  public void reset()
	  {
		  Population = 0;
		  Year = 1;
	  }
}
