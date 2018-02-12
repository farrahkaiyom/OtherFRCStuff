package team3647pistons;
import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Intake 
{
	//Double Pistons
	public static DoubleSolenoid intakePiston = new DoubleSolenoid(1,2);
	
	public static void openIntake()
	{
		intakePiston.set(DoubleSolenoid.Value.kForward);
	}
	
	public static void closeIntake()
	{
		intakePiston.set(DoubleSolenoid.Value.kReverse);
	}
	
	public static void runIntake(boolean joyValue)
	{
		if(joyValue)
		{
			openIntake();
		}
		else
		{
			closeIntake();
		}
	}
}
