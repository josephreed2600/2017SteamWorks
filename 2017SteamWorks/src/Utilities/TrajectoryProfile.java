/**
*	This class should create trajectory profiles as interpolating tree maps. It will rely on the following constants that do not yet exist:
*	double SWERVE_DRIVE_VELOCITY_MAX;
*	double SWERVE_DRIVE_ACCEL_MAX;
*	double SWERVE_DRIVE_TIME_TO_VELOCITY_MAX = SWERVE_DRIVE_VELOCITY_MAX / SWERVE_DRIVE_ACCEL_MAX;
*	
*	TODO: Turn this into a class named TrajectoryProfile. The class will have members to set and get information and properties of the profile,
*		including setting the distance and getting velocities from the profile.
*/
package Utilities;

import Helpers.InterpolatingDouble;
import Helpers.InterpolatingTreeMap;

	/**
	*	@author Joseph Reed
	*/

public class MP {
	public static InterpolatingTreeMap<InterpolatingDouble, InterpolatingDouble> createTrajectoryProfile(double distance) {
	/** the time at which we should start decelerating */
		double decelStart = distance/Constants.SWERVE_DRIVE_VELOCITY_MAX;
		InterpolatingTreeMap<InterpolatingDouble, InterpolatingDouble> TrajectoryProfile = new InterpolatingTreeMap<>();
		static {
			TrajectoryProfile.put(new InterpolatingDouble(0.0), new InterpolatingDouble(0.0));
			TrajectoryProfile.put(new InterpolatingDouble(Constants.SWERVE_DRIVE_TIME_TO_VELOCITY_MAX), new InterpolatingDouble(Constants.SWERVE_DRIVE_VELOCITY_MAX));
			TrajectoryProfile.put(new InterpolatingDouble(decelStart), new InterpolatingDouble(Constants.SWERVE_DRIVE_VELOCITY_MAX));
			TrajectoryProfile.put(new InterpolatingDouble(decelStart+Constants.SWERVE_DRIVE_TIME_TO_VELOCITY_MAX), new InterpolatingDouble(0.0));
		}
	}
}
