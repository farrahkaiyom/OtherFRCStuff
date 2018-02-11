package team3647pistons;

public class IntakeTilt 
{
	//Double Pistons
	
	public static DoubleSolenoid piston = new DoubleSolenoid(1,2);
	
	public static void intakeTitled()
	{
		piston.set(DoubleSolenoid.Value.kForward);
	}
	
	public static void intakeNotTitled()
	{
		piston.set(DoubleSolenoid.Value.kReverse);
	}
	
	public static void runPiston(boolean joyValue)
	{
		if(joyValue)
		{
			intakeTilted();
		}
		else
		{
			intakeNotTilted();
		}
	}
}
