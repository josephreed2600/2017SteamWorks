
package ControlSystem;

import SubSystems.GearIntake;
import SubSystems.Hanger;
import SubSystems.Intake;
import SubSystems.Shooter;
import SubSystems.Sweeper;
import SubSystems.Swerve;
import SubSystems.Turret;
import Utilities.Ports;
import edu.wpi.cscore.MjpegServer;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.cscore.VideoMode.PixelFormat;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Solenoid;

public class RoboSystem{
    private static RoboSystem instance = null;
	public Intake intake;
    public Swerve dt;
	public Shooter shooter;
	public Sweeper sweeper;
	public Turret turret;
	public GearIntake gearIntake;
	public Hanger hanger;
	public Solenoid ballFlap;
	public CameraServer cam;
	public AnalogInput ultrasonic;
	public static final int BLUE = 1;
	public static final int RED = -1;
	public int TeamColor = RED;
	public void setColor(int color){
		TeamColor = color;
	}
    public static RoboSystem getInstance()
    {
        if( instance == null )
            instance = new RoboSystem();
        return instance;
    }
    
    public RoboSystem(){
    	
    	intake = Intake.getInstance();
//    	intake._pidgey.SetFusedHeading(-90);							// OVER HERE wasn't commented // that was a while ago
    	dt = Swerve.getInstance();
    	shooter = Shooter.getInstance();
    	sweeper = Sweeper.getInstance();
    	turret = Turret.getInstance();
    	gearIntake = new GearIntake(Ports.GEAR_INTAKE, Ports.INTAKE_ARM);
    	hanger = Hanger.getInstance();
    	ballFlap = new Solenoid(20, Ports.BALL_FLAP);
    	ultrasonic = new AnalogInput(0);
    } 
    public void deployBallFlap(){
    	ballFlap.set(true);
    }
    public void retractBallFlap(){
    	ballFlap.set(false);
    }
    public double getDistance(){
    	return ultrasonic.getVoltage()*097.7;
    }
    public void initCamera(){
    	cam = CameraServer.getInstance();
    	UsbCamera usbCamera = new UsbCamera("USB Camera 0", 0);
    	usbCamera.setVideoMode(PixelFormat.kMJPEG, 640, 480, 30);
    	MjpegServer mjpegServer2 = new MjpegServer("serve_Blur", 1182);
    	mjpegServer2.setSource(usbCamera);
    }
}
