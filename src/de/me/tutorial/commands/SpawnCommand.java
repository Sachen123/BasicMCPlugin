package de.me.tutorial.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import de.me.tutorial.main.Main;

public class SpawnCommand implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command command, String lable, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(args.length == 0) {
				
				FileConfiguration config = Main.getPlugin().getConfig();
				
				World world = Bukkit.getWorld(config.getString("Spawn.World"));
				double x = config.getDouble("Spawn.X");
				double y = config.getDouble("Spawn.Y");
				double z = config.getDouble("Spawn.Z");
				float yaw = (float) config.getDouble("Spawn.Yaw");
				float pitch = (float) config.getDouble("Spawn.Pitch");
				Location location = new Location(world, x, y, z, yaw, pitch);
				player.teleport(location);
				player.closeInventory();
				
			} else {
				player.sendMessage("�cBitte benutze �6/spawn�c!");
			}
		} else {
			sender.sendMessage("�cDiesen Befehl, d�rfen nur Spieler benutzen!");
		}
		
		return false;
	}

}
