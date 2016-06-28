package ch.gyselanimatioon.endlessworld;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		getCommand("cc").setExecutor(new Cc());
		getCommand("ts").setExecutor(new Ts());
	}
}
