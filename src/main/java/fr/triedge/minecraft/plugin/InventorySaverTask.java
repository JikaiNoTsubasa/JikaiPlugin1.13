package fr.triedge.minecraft.plugin;

public class InventorySaverTask implements Runnable{

private final JikaiPlugin1_13 plugin;
	
	public InventorySaverTask(JikaiPlugin1_13 plugin) {
		this.plugin = plugin;
	}

	@Override
	public void run() {
		if (plugin.inventoryManager != null) {
			plugin.inventoryManager.storeAllInventories();
			plugin.getLogger().info("SCHEDULER: Inventories saved.");
		}
	}
}
