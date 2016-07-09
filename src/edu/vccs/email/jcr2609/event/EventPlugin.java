package edu.vccs.email.jcr2609.event;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class EventPlugin extends JavaPlugin {
	
	@Override
	public void onLoad() {}
	
	@Override
	public void onEnable() {
		Bukkit.broadcastMessage("Is this going to work?");
	}
	
	@Override
	public void onDisable() {}
	
}
