package de.me.tutorial.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class fill implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command command, String lable, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(args.length == 0) {
				
				Inventory inv = Bukkit.createInventory(null, 3*9, "§a§lHier ist alles, was du brauchst!");
				
				ItemStack sand = new ItemStack(Material.CUT_SANDSTONE);
				ItemMeta itemMetaSand = sand.getItemMeta();
				itemMetaSand.setDisplayName("§e§lDer heilige Sandstone!");
				itemMetaSand.addEnchant(Enchantment.DAMAGE_ALL, 500, false);
				sand.setItemMeta(itemMetaSand);
				sand.setAmount(64);
				
				ItemStack waterBukket = new ItemStack(Material.WATER_BUCKET);
				ItemMeta itemMetaBukket = waterBukket.getItemMeta();
				itemMetaBukket.setDisplayName("§e§lDer heilige Eimer!");
				itemMetaBukket.addEnchant(Enchantment.DAMAGE_ALL, 500, false);
				waterBukket.setItemMeta(itemMetaBukket);
				
				ItemStack bow = new ItemStack(Material.BOW);
				ItemMeta itemMetaBow = sand.getItemMeta();
				itemMetaBow.setDisplayName("§e§lDer heilige Sandstone!");
				itemMetaBow.addEnchant(Enchantment.ARROW_DAMAGE, 500, false);
				itemMetaBow.addEnchant(Enchantment.ARROW_KNOCKBACK, 500, false);
				itemMetaBow.addEnchant(Enchantment.ARROW_INFINITE, 500, false);
				itemMetaBow.addEnchant(Enchantment.ARROW_FIRE, 500, false);
				sand.setItemMeta(itemMetaSand);
				sand.setAmount(64);
				
				inv.setItem(9, sand);
				inv.setItem(1, waterBukket);
				inv.setItem(2, bow);
				
				player.openInventory(inv);
			} else {
				sender.sendMessage("§cBitte benutze §5/fill§c!");
			}
		} else {
			sender.sendMessage("$cDu bist kein Spieler!");
		}
		return false;
	}
}
