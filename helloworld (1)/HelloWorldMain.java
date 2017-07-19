package com.mcwow.helloworld;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class HelloWorldMain extends JavaPlugin{
	
	@Override
	public void onEnable() {
		
		getLogger().info("HelloWorld has been enabled");
		PluginManager pm = getServer().getPluginManager();
		HelloWorldListener listener = new HelloWorldListener(this);
		pm.registerEvents(listener, this);
		
	}

	@Override
	public void onDisable() {
		
		getLogger().info("HelloWorld has been disabled");
		
	}
}
