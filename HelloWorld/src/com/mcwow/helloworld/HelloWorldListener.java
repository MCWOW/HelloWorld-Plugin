package com.mcwow.helloworld;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class HelloWorldListener implements Listener{

	//Constructor
	public HelloWorldListener(HelloWorldMain plugin) {
		
	}
	
	//EventHandler
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		
		event.getPlayer().sendMessage("Welcome!");
		
	}
	
}
