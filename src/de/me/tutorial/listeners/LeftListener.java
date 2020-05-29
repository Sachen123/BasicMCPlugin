package de.me.tutorial.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class LeftListener implements Listener{
	@EventHandler
	public void onPlayerJoin(PlayerQuitEvent quit) {
		quit.setQuitMessage("§cDer Spieler §6" + quit.getPlayer().getName() + "§chat den Server verlassen!");
	}
	
}
