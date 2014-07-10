package com.bwfcwalshy.plmsg;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Plugin implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("plugin") || cmd.getName().equalsIgnoreCase("plugins") || cmd.getName().equalsIgnoreCase("pl") || cmd.getName().equalsIgnoreCase("version")){
			player.sendMessage(Main.pl.getConfig().getString("Message").replaceAll("&", "§"));
		}
		return false;
	}
}
