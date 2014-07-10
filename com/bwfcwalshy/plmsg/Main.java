package com.bwfcwalshy.plmsg;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static Main pl;

	public void onEnable(){
		pl = this;
		initialiseConfig();
		
		getCommand("plugin").setExecutor(new Plugin());
		getCommand("pl").setExecutor(new Plugin());
		getCommand("plugins").setExecutor(new Plugin());
		getCommand("version").setExecutor(new Plugin());
	}
	
	public void onDisable(){
		
	}
	
	public void initialiseConfig(){
		FileConfiguration config = getConfig();
		
		config.addDefault("Message", "&a&lHow about no?");
		
		config.options().copyDefaults(true);
		saveConfig();
	}
}
