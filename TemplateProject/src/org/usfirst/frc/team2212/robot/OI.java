/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2212.robot;

import com.spikes2212.utils.XboXUID;

import edu.wpi.first.wpilibj.Joystick;

public class OI /*GEVALD*/ {
	
	private Joystick driverLeft = new Joystick(0);
	private Joystick driverRight = new Joystick(1);

	private XboXUID navigator = new XboXUID(2);
	
	public OI(){
		
	}

}
