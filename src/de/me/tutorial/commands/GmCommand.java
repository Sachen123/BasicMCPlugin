package de.me.tutorial.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GmCommand implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args) {
		
		if(sender.hasPermission("tutorial.gamemode")) {
			Player p = (Player) sender;
			Player target = Bukkit.getPlayer(args[1]);
			if(args.length == 0) {
				
				String Gamemode = args[0];
				
				Integer.parseInt(Gamemode);
				
				if(Gamemode == "1" ) {
					p.setGameMode(GameMode.CREATIVE);
				}
				if(Gamemode == "0") {
					p.setGameMode(GameMode.SURVIVAL);
				}
				if(Gamemode == "3") {
					p.setGameMode(GameMode.SPECTATOR);
				}
				if(Gamemode == "2") {
					p.setGameMode(GameMode.ADVENTURE);
				}
				
			} else if(target != null) {
				String Gamemode = args[0];
				
				if(Gamemode == "c") {
					target.setGameMode(GameMode.CREATIVE);
				}
				if(Gamemode == "s") {
					target.setGameMode(GameMode.SURVIVAL);
				}
				if(Gamemode == "z") {
					target.setGameMode(GameMode.SPECTATOR);
				}
				if(Gamemode == "a") {
					target.setGameMode(GameMode.ADVENTURE);
				}
			} else {
				p.sendMessage("§cDer Spieler §6 " + args[1] + " §cist nicht §bonline§c!");
			}
				
		} else {
			sender.sendMessage("§cDazu hast du keine Rechte!");
		}
		return false;
	}

}
