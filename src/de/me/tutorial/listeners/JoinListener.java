package de.me.tutorial.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener{

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent join) {
		join.setJoinMessage("§aDer Spieler §6" + join.getPlayer().getName() + " §ahat den Server betreten!");
	}
}
