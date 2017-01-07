package Utilities;

/**
 *
 * @author Rohi Zacharia
 */
public class Constants {
    
    public static final boolean LOW_GEAR  = true; // Drivetrain low gear
    public static final double MIN_DT_POWER = 0.2;
    public static final double STARTING_ANGLE_OFFSET = 0;
    
    public static final int GYRO_INIT = 0;
    public static final int GYRO_READY  = 1;
    
    public static final double WHEELBASE_LENGTH = 33.1625;
    public static final double WHEELBASE_WIDTH  = 21.5;
    
    
    
    
    public static final double TURN_KP = 0.02; //0.020
    public static final double TURN_KI = 0.00;
    public static final double TURN_KD = 0.02;//0.02
    public static final double TURN_KFV = 0.0000; //0.0001
    public static final double TURN_KFA = 0.0000; //0.0001
    public static final double TURN_ON_TARGET_DEG = 1;
    public static final double TURN_MAX_ACCEL = 15.0; //25
    public static final double TURN_MAX_VEL = 600.0; //900
    public static final double MAX_ROTATION_ANGLE_PER_SEC = 2;
    public static final double TURN_KP_TURN = 0.08;
    
    public static final double CAMERA_PIXEL_WIDTH = 320.0;
	public static final double CAMERA_FOV = 60; //45.3
	public static final double GRIP_X_OFFSET = -0.5; // negative to go left, positive to go right. 1.75
	public static final double CAM_CALIBRATION = 1.0;
}