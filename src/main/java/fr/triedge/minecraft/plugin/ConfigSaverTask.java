package fr.triedge.minecraft.plugin;


public class ConfigSaverTask implements Runnable{
	
	private final JikaiPlugin1_13 plugin;
	
	public ConfigSaverTask(JikaiPlugin1_13 plugin) {
		this.plugin = plugin;
	}

	@Override
	public void run() {
		if (plugin.magic.getConfig() != null) {
			plugin.magic.saveConfig();
			plugin.getLogger().info("SCHEDULER: Config Magic saved.");
		}
	}

}
