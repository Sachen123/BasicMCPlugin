package de.me.tutorial.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.me.tutorial.main.Main;

public class PartyCommand implements CommandExecutor{
	
	private int taskID;

	public boolean onCommand(CommandSender sender, Command command, String lable, String[] args) {
		if(sender instanceof Player) {
			
			
			
			taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(), new Runnable() {
				
				int countdown = 5;
				
				public void run() {
					if(countdown <= 0) {
						Bukkit.broadcastMessage("§a§lDIE PARTY BEGINNT!");
						Bukkit.getScheduler().cancelTask(taskID);
						return;
					}
					Bukkit.broadcastMessage("§aDie Party beginnt in §6" + countdown + " sekunden§a!");
					countdown--;
				}
			}, 0, 20);
		}
		return false;
	}

}
