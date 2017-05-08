package Utilities;

import Helpers.InterpolatingDouble;
import Helpers.InterpolatingTreeMap;

/**
 *
 * @author Rohi Zacharia
 */
public class Constants {
    public static double kBlueSideHopperX = -156.0;
    public static double kBlueSideHopperY = 8.0;
    
    public static final boolean LOW_GEAR  = true; //Drivetrain low gear
    public static final double MIN_DT_POWER = 0.2;
    public static final double STARTING_ANGLE_OFFSET = 0;
    
    public static final int GYRO_INIT = 0;
    public static final int GYRO_READY  = 1;
    
    public static final double WHEELBASE_LENGTH = 22.181;
    public static final double WHEELBASE_WIDTH  = 15.681;
    public static final double SWERVE_R = 27.16;
	public static final double ANGLE_FRONT_MODULE_CENTER = Math.atan(WHEELBASE_LENGTH/WHEELBASE_WIDTH);
	
    // 2017-03-05 Added little adjustments to the offsets
    public static final double FRONT_RIGHT_TURN_OFFSET = 136.4;//344;//pbot 283.0+1.3; //281.2							//comp bot 189.7
    public static final double FRONT_LEFT_TURN_OFFSET  = 255.9375;//191.5-6.5 + 128.2 + 269.6;//pbot 170.5-0.5; //171.2	//comp bot 189.4
    public static final double REAR_LEFT_TURN_OFFSET   = 311.1328;//263.1-6.0;//pbot 138.1+1.5; //289.3						//comp bot 85
    public static final double REAR_RIGHT_TURN_OFFSET  = 164.8828;//45.5-0.5;//pbot 131.6+3.4; //140.0; //172.6			//comp bot 7.38
    
    public static final int FOLLOWER_WHEEL_MODULE_ID = 1;
    public static final int SWERVE_ENCODER_MODULE_ID = 4;
    
    public static final double DRIVE_TICKS_PER_INCH =  790;//(13.0*5760.0)/(16.0*Math.PI)/2.0*.957;//36/25542; //0.00200635031508792675265469178699;//0.00163990667972621570986118595697; //0.00150603674668734095803578302171;//60.0/40462.0; //
    public static final double FOLLOWER_WHEEL_TICKS_PER_INCH = 10155/71.25;
    public static final double TURN_KP = 0.02; //0.020
    public static final double TURN_KI = 0.00;
    public static final double TURN_KD = 0.02;//0.02
    public static final double TURN_KFV = 0.0000; //0.0001
    public static final double TURN_KFA = 0.0000; //0.0001
    public static final double TURN_ON_TARGET_DEG = 1;
    public static final double TURN_MAX_ACCEL = 15.0; //25
    public static final double TURN_MAX_VEL = 600.0; //900
    public static final double MAX_ROTATION_ANGLE_PER_SEC = 2;
    // Turn, KP, turn!
    public static final double TURN_KP_TURN = 0.08;
    
    public static final double SWEEPER_JAM_CURRENT = 75;
    public static final double SWEEPER_FORWARD = 0.8;
    public static final double SWEEPER_REDUCED_FORWARD = .75;
    public static final double SWEEPER_REVERSE = -1;
    public static final double SWEEPER_ROLLER_FORWARD = 1.0;//65.0;//1.0;
    public static final double SWEEPER_ROLLER_REVERSE = -65.0;
    
	//Swerve Rotation Controller - Actual
	public static final double SWERVE_TURNING_GAIN_P = 0.008; // 0.02 percent throttle per degree of error 0.02
	public static final double SWERVE_TURNING_GAIN_D = 0.003; // 0.00425percent throttle per angular velocity dps 0.00425
	public static final double SWERVE_TURNING_GAIN_FF = 0.2;
	public static final double SWERVE_ROTATION_INPUT_CAP = 0.7; //0.75
	public static final int MIN_CYCLES_HEADING_ON_TARGET = 5;
	
	//Swerve Head Controller - Actual
	public static final double SWERVE_HEADING_BIG_P = 0.008;//0.012
	public static final double SWERVE_HEADING_BIG_D = 0.0;
	public static final double SWERVE_HEADING_GAIN_FF = 0.02;
	public static final double SWERVE_HEADING_BIG_MAX_CORRECTION_HEADING = 0.12;
	
	//Swerve Distance Controller - Actual
	public static final double DIST_CONTROLLER_Y_LONG_P =  0.01;  //.01
	public static final double DIST_CONTROLLER_Y_LONG_D =  0.01;   //.02
	public final static double DIST_CONTROLLER_Y_LONG_FF = 0.0;    //.0
	
	public static final double DIST_CONTROLLER_Y_SHORT_P =  0.0225;  //.01
	public static final double DIST_CONTROLLER_Y_SHORT_D =  0.1;   //.0375
	public final static double DIST_CONTROLLER_Y_SHORT_FF = 0.25;    //.2
	
	public static final double DIST_CONTROLLER_X_P =  0.04;  //.008
	public static final double DIST_CONTROLLER_X_D =  0.0;   //.08
	public final static double DIST_CONTROLLER_X_FF = 0.0;    //.2
	
	public static final int DIST_CONTROLLER_CYCLE_THRESH = 30;

	
	//Remove Unwanted Variables Below
	public static final double SWERVE_SMALL_TURNING_GAIN_P = 0.1; //0.03; // 0.009; 0.015
	public static final double SWERVE_SMALL_TURNING_GAIN_D = 0.01; //0.02
	public static final double SWERVE_ROTATION_SMALL_MAX_CORRECTION_RATIO = 0.2; //0.18
	public static final double SWERVE_ROTATION_SCALE_FACTOR_SMALL = 0.225; //.225
	public static final double SWERVE_ROTATION_SCALE_FACTOR_BIG = 0.35;  
	public static final double SWERVE_HEADING_GAIN_P = 0.001; // 0.003; 0.002
	public static final double SWERVE_HEADING_GAIN_D = 0.0007; // 0.001
	public static final double SWERVE_HEADING_MAX_CORRECTION_HEADING = 0.2; 
	
	
    
    public static final double TURNING_ADD_POWER_THRESHOLD = 15; //10
    public static final double TURNING_DETECT_THRESHOLD = TURNING_ADD_POWER_THRESHOLD;//1; //10// 3
    public static final int DRIVING_DETECT_THRESHOLD = 1; // clicks
    public static final double ROBOT_ROTATING_DETECT_THRESHOLD = 15;
	
	public static final double HEADING_MAX_ERROR = 2.0;
	public static final double SWERVE_ROTATION_HEADING_ON_TARGET_THRESHOLD = /**/HEADING_MAX_ERROR/*/10/**/;
	public static final double SWERVE_IMPACT_CURRENT_THRESHOLD = 20;
    
    public static final double CAMERA_PIXEL_WIDTH = 320.0;
	public static final double CAMERA_FOV = 60; //45.3
	public static final double GRIP_X_OFFSET = -0.5; // negative to go left, positive to go right. 1.75
	public static final double CAM_CALIBRATION = 1.0;
	
	public static final double TURRET_CLICKS_TO_ANGLE = 66.2252;
	public static final int    TURRET_TICKS_PER_90    = 22;
	public static final double TURRET_MAX_ANGLE = 110;
	public static final double TURRET_DEFAULT_P = 1.75;//1.75
	public static final double TURRET_DEFAULT_D = 10;//25
	public static final int TURRET_I_ZONE = (int) (1023.0 / TURRET_DEFAULT_P);
	
	public static final double TURRET_SMALL_P = 10.0;
	public static final double TURRET_SMALL_D = 5.0;
	public static final double TURRET_SMALL_PID_THRESH = 5;
	public static final int    TURRET_ONTARGET_THRESH  = 5;
	public static final double STICK_DEAD_BAND = 0.0;
	
	public static final double SHOOTING_SPEED = 2700;
	public static final double SHOOTING_SPEED_AUTO_MIDDLE = 3550;
	public static final double SHOOTER_ERROR  = 200;

	public static final double GEAR_INTAKE_POWER = 0.75;
	public static final double GEAR_INTAKE_POWER_REVERSE = 12;
	public static final double GEAR_INTAKE_CURR_DETECT = 23;//24;
	public static final double GEAR_INTAKE_REVERSE_CURR_DETECT = 40;
	public static final double GEAR_INTAKE_HOLDING_POWER = -0.27;
	public static final double GEAR_PRESENT = 3.0;
	public static final double GEAR_HANG_CURRENT = 70;  
	public static final double GEAR_HANG_CURRENT_THRESHOLD = 55;
	public static final double GEAR_HANG_HOLD_CURRENT = 10;
	public static final int GEAR_HANG_THRESHOLD = 0;
	
/** Distance from the robot's center to each wheel module. */
	public static final double RADIUS_CENTER_TO_MODULE = Math.sqrt(Math.pow(WHEELBASE_LENGTH/2, 2)+Math.pow(WHEELBASE_WIDTH/2, 2))*DRIVE_TICKS_PER_INCH;
	public static final double DIST_MAX_POWER = 0.5;
	
	// Pose of the camera frame w.r.t. the turret frame
    public static double kCameraXOffset = 0;
    public static double kCameraYOffset = 0.0;
    public static double kCameraZOffset = 16;
    public static double kCameraPitchAngleDegrees = 34; // calibrated 4/22  35.75
    public static double kCameraYawAngleDegrees = 4;  //2.5 //positive moves the turret to the left
    public static double kCameraDeadband = 0.0;
    
    public static double kCenterOfTargetHeight = 86.0; // inches       

    public static final double VISION_CENTER_TO_CAMERA_RADIUS = 9.0;
    
    public static int kAndroidAppTcpPort = 8254;

    public static double kLooperDt = 0.01;
    
    public static double kAutoAimMinRange = 10.0;
    public static double kAutoAimMaxRange = 220.0;
    
    public static int kDriveBaseLockAllowableError = 10;
    public static int kDriveVelocityAllowableError = 0;
    
    public static final double NEAR_HOPPER_Y = 70.0;
    public static final double SIDE_PEG_SHOOTING_SPEED = 2775;

    public static InterpolatingTreeMap<InterpolatingDouble, InterpolatingDouble> kShooterMap = new InterpolatingTreeMap<>();

    static {        
    	
    	kShooterMap.put(new InterpolatingDouble(0.0), new InterpolatingDouble(SHOOTING_SPEED - 200));
    	kShooterMap.put(new InterpolatingDouble(NEAR_HOPPER_Y - 12), new InterpolatingDouble(SHOOTING_SPEED - 100));
    	kShooterMap.put(new InterpolatingDouble(NEAR_HOPPER_Y), new InterpolatingDouble(SHOOTING_SPEED));
    	kShooterMap.put(new InterpolatingDouble(NEAR_HOPPER_Y + 12), new InterpolatingDouble(SHOOTING_SPEED + 100));
    }
    public static InterpolatingTreeMap<InterpolatingDouble, InterpolatingDouble> kTurretDistanceMap = new InterpolatingTreeMap<>();

    static {        
    	kTurretDistanceMap.put(new InterpolatingDouble(-6.0), new InterpolatingDouble(4.0));
    	kTurretDistanceMap.put(new InterpolatingDouble(0.0), new InterpolatingDouble(0.0));
    	kTurretDistanceMap.put(new InterpolatingDouble(6.0), new InterpolatingDouble(-4.0));
    	kTurretDistanceMap.put(new InterpolatingDouble(12.0), new InterpolatingDouble(-8.0));
    }
    public static InterpolatingTreeMap<InterpolatingDouble, InterpolatingDouble> kHeadingMap = new InterpolatingTreeMap<>();

    static {  
    	kHeadingMap.put(new InterpolatingDouble(-6.0), new InterpolatingDouble(67.0));
    	kHeadingMap.put(new InterpolatingDouble(0.0), new InterpolatingDouble(60.0));
    	kHeadingMap.put(new InterpolatingDouble(6.0), new InterpolatingDouble(52.0));
    }
    public static InterpolatingTreeMap<InterpolatingDouble, InterpolatingDouble> kDistanceToWallMap = new InterpolatingTreeMap<>();

    static {  
    	kDistanceToWallMap.put(new InterpolatingDouble(-10.0), new InterpolatingDouble(-6.0));
    	kDistanceToWallMap.put(new InterpolatingDouble(-5.0), new InterpolatingDouble(-3.0));
    	kDistanceToWallMap.put(new InterpolatingDouble(0.0), new InterpolatingDouble(0.0));
    	kDistanceToWallMap.put(new InterpolatingDouble(5.0), new InterpolatingDouble(4.0));
    	kDistanceToWallMap.put(new InterpolatingDouble(10.0), new InterpolatingDouble(8.0));
    }
    public static InterpolatingTreeMap<InterpolatingDouble, InterpolatingDouble> kDistanceToWallUltraMap = new InterpolatingTreeMap<>();

    static {      	    	
    	kDistanceToWallUltraMap.put(new InterpolatingDouble(-297.0), new InterpolatingDouble(29.0));
    	kDistanceToWallUltraMap.put(new InterpolatingDouble(-303.0), new InterpolatingDouble(28.0));
    	kDistanceToWallUltraMap.put(new InterpolatingDouble(-306.20), new InterpolatingDouble(29.91));
    }
}