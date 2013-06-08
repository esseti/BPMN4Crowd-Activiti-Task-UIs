import java.util.Date;

import org.activiti.designer.integration.servicetask.AbstractCustomServiceTask;
import org.activiti.designer.integration.servicetask.PropertyType;
import org.activiti.designer.integration.servicetask.annotation.*;
import org.activiti.designer.integration.servicetask.annotation.Runtime;

@Runtime(javaDelegateClass = "org.crowdcomputer.CrowdTask")
@Help(displayHelpShort = "Creates a new Crowd Task", displayHelpLong = "Creates a new Crowd Task")
public class CrowdTask extends AbstractCustomServiceTask {

	// Long process: taken from variable
	// String title: taken from task def
	
	@Property(type = PropertyType.MULTILINE_TEXT, displayName = "Description of the Task", required = true)
	@Help(displayHelpShort = "Description", displayHelpLong = "Describe what peopel should do")
	private String description;	
	
	// Date deadline,
	@Property(type = PropertyType.PERIOD, displayName = "Task duration", required = false)
	@Help(displayHelpShort = "Select the duration of the task", displayHelpLong = "Duration of the task, if 0 is set to 7 days")
	private String deadline;
	


	// Integer number_of_instances,
	@Property(type = PropertyType.TEXT, displayName = "Number of instances", required = true)
	@Help(displayHelpShort = "Number of instances", displayHelpLong = "How many instances should be created?")
	private String number_of_instances;
	
	// String page_url,
	@Property(type = PropertyType.TEXT, displayName = "Page URL", required = true)
	@Help(displayHelpShort = "Page URL", displayHelpLong = "Page URL")
	private String page_url;
	// Double reward,
	@Property(type = PropertyType.TEXT, displayName = "Reward", required = true)
	@Help(displayHelpShort = "Reward", displayHelpLong = "Reward")
	private String reward;
	// String reward_platform
	@Property(type = PropertyType.RADIO_CHOICE, displayName = "Withdrawl limit", required = true)
	@Help(displayHelpShort = "The maximum daily withdrawl amount ", displayHelpLong = "Choose the maximum daily amount that can be withdrawn from the account.")
	@PropertyItems({ "CROWDCOMPUTER", "CCM", "DOLLARS", "USD", "EURO", "EUR","COFFIES","COF" })
	private String platform;

	@Override
	public String getName() {
		return "CrowdComputer Human Task";
	}
	
	@Override
	public String getSmallIconPath() {
		// This is the icon of the component
		// remember that it is mandatory to provide one.
		return "icons/crowd.png";
	}

}