package nl.karatemaccie.javaversion.bukkit;

import nl.karatemaccie.javaversion.api.JavaVersionAPI;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class BukkitJavaVersion extends JavaPlugin {
	
	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		if(label.equalsIgnoreCase("javaversion")){
			sender.sendMessage(JavaVersionAPI.getVersionString());
			return true;
		}
		return super.onCommand(sender, command, label, args);
	}

}
