package org.usfirst.frc.team3695.robot.commands;

import edu.wpi.first.wpilibj.DigitalInput;
import org.usfirst.frc.team3695.robot.Robot;
import org.usfirst.frc.team3695.robot.enumeration.Direction;

import edu.wpi.first.wpilibj.command.Command;

/**
 * toggles the state of the clamp
 */
public class ButtonCommandClamp extends Command {
	
	Direction direction;
    DigitalInput lowerPinionLimit;
    DigitalInput upperPinionLimit;
    DigitalInput lowerScrewLimit;
    DigitalInput upperScrewLimit;
	
    public ButtonCommandClamp() {
        requires(Robot.SUB_CLAMP);
    }

    protected void initialize() {
    	//Robot.SUB_CLAMP.openArms();
        lowerPinionLimit = new DigitalInput(1);
        upperPinionLimit = new DigitalInput(2);
        lowerScrewLimit = new DigitalInput(3);
        upperScrewLimit = new DigitalInput(4);
    }

    protected void execute() {}

    protected boolean isFinished() {
        return lowerPinionLimit.get() ||
                upperPinionLimit.get() ||
                lowerScrewLimit.get() ||
                upperScrewLimit.get();
    }

    protected void end() {
    	///Robot.SUB_CLAMP.closeArms();
    }

    protected void interrupted() {
    	end();
    }
}
