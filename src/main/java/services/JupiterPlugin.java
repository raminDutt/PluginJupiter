package services;

import framework.IPlugin;

public class JupiterPlugin implements IPlugin {

	public JupiterPlugin() {
		System.out.println("Default Constructor for "
				+ this.getClass().getCanonicalName());
	}

	@Override
	public String getName() {
		String result = "JupiterPlugin";
		return result;
	}

}
