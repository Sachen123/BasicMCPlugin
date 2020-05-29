package de.me.tutorial.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

//import de.me.tutorial.commands.GmCommand;
import de.me.tutorial.commands.HealCommand;
import de.me.tutorial.commands.PartyCommand;
import de.me.tutorial.commands.SetspawnCommand;
import de.me.tutorial.commands.SpawnCommand;
import de.me.tutorial.commands.fill;
import de.me.tutorial.listeners.JoinListener;

public class Main extends JavaPlugin {
	
	private static Main plugin;

	public void onEnable() {
		plugin = this;
		
		getCommand("heal").setExecutor(new HealCommand());
		getCommand("about").setExecutor(new fill());
		getCommand("setspawn").setExecutor(new SetspawnCommand());
		getCommand("spawn").setExecutor(new SpawnCommand());
		getCommand("hub").setExecutor(new SpawnCommand());
		getCommand("lobby").setExecutor(new SpawnCommand());
		getCommand("party").setExecutor(new PartyCommand());
//		getCommand("gm").setExecutor(new GmCommand());
		
		PluginManager plugMan = Bukkit.getPluginManager();
		plugMan.registerEvents(new JoinListener(), this);
	}
	public static Main getPlugin() {
		return plugin;
	}
}
