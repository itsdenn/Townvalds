package com.linuxmasterrace.townvalds;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class Townvalds extends JavaPlugin {
	@Override
	public void onEnable() {
		// TODO Insert logic to be performed when the plugin is enabled
		getLogger().info("onEnable has been invoked!");
	}
	
	public void onDisable() {
		// TODO Insert logic to be performed when the plugin is disabled
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("townvalds")) {
			if (args.length == 0) {
				sender.sendMessage("Usage: /townvalds <argument>\nYou're missing an argument!");
			}
			else {			
				if (args[0].equalsIgnoreCase("version")) {
					getLogger().info("Townvalds version " + this.getDescription().getVersion());
				}
				else {
					sender.sendMessage("Invalid argument");
				}
			}
			
			return true;
		}
		
		return false;
	}
}
