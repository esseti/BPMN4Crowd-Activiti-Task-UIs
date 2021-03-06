package org.crowdcomputer.ui.tactic;

import org.activiti.designer.integration.servicetask.AbstractCustomServiceTask;
import org.activiti.designer.integration.servicetask.PropertyType;
import org.activiti.designer.integration.servicetask.annotation.Help;
import org.activiti.designer.integration.servicetask.annotation.Property;
import org.activiti.designer.integration.servicetask.annotation.PropertyItems;
import org.activiti.designer.integration.servicetask.annotation.Runtime;

@Runtime(javaDelegateClass = "org.crowdcomputer.impl.task.CreateTask")
@Help(displayHelpShort = "Creates a Task", displayHelpLong = "Creates a new Task")
public class CreateTask extends AbstractCustomServiceTask {

	// Long process: taken from variable
	// String title: taken from task def
	
	@Property(type = PropertyType.MULTILINE_TEXT, displayName = "Description of the Task", required = true)
	@Help(displayHelpShort = "Description", displayHelpLong = "Describe what peopel should do")
	private String description;	
	
	// Date deadline,
	@Property(type = PropertyType.PERIOD, displayName = "Task duration", required = true)
	@Help(displayHelpShort = "Select the duration of the task", displayHelpLong = "Duration of the task, if 0 is set to 7 days")
	private String deadline;

	
	// String page_url,
	@Property(type = PropertyType.TEXT, displayName = "Page URL", required = true)
	@Help(displayHelpShort = "Page URL", displayHelpLong = "Page URL")
	private String page_url;


    @Property(type = PropertyType.TEXT, displayName = "Tactic Process")
    @Help(displayHelpShort = "Tactic Process", displayHelpLong = "Filenanme")
    private String tactic_process;

    @Property(type = PropertyType.TEXT, displayName = "Reward", required = true)
    @Help(displayHelpShort = "Reward", displayHelpLong = "Reward")
    private String reward;
    // String reward_platform

    @Property(type = PropertyType.RADIO_CHOICE, displayName = "Reward Platform", required = true)
    @Help(displayHelpShort = "The maximum daily withdrawl amount ", displayHelpLong = "Choose the maximum daily amount that can be withdrawn from the account.")
    @PropertyItems({ "CROWDCOMPUTER", "CCM", "DOLLARS", "USD", "EURO", "EUR","COFFEES","COF" })
    private String platform;

    @Property(type = PropertyType.TEXT, displayName = "Input data name", required =  true, defaultValue="data")
    @Help(displayHelpShort = "Input data name", displayHelpLong = "Input data name")
    private String input;

    @Property(type = PropertyType.TEXT, displayName = "Output data name", required =  true, defaultValue="data")
    @Help(displayHelpShort = "Output data name", displayHelpLong = "Output data name")
    private String output;

	@Override
	public String getName() {
		return "Custom Task tactic";
	}
	
	@Override
	public String getSmallIconPath() {
		// This is the icon of the component
		// remember that it is mandatory to provide one.
		return "icons/crowd.png";
	}

	@Override
	  public String contributeToPaletteDrawer() {
	    return "BPMN4Crowd Crowd Tasks";
	  }


}
