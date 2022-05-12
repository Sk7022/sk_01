package crm.crm.campaignsTest;

import org.testng.annotations.Test;

public class CampainsTest 
{
	@Test(groups="smokeTest")
	public void createCampaign()
	{
		System.out.println("execute createCampaign");
	}

	@Test(groups="regressionTest")
	public void modifyCampaign()
	{
		System.out.println("execute modifyCampaign");
		System.out.println("execute modifyCampaign2");
	}

	@Test(groups="regressionTest")
	public void deleteCampaign()
	{
		System.out.println("execute deleteCampaign");
	}
}
