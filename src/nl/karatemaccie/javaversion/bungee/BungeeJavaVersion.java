package nl.karatemaccie.javaversion.bungee;


import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.Plugin;
import nl.karatemaccie.javaversion.api.JavaVersionAPI;

public class BungeeJavaVersion extends Plugin {

	@Override
	public void onEnable() {
		this.getProxy().getPluginManager().registerCommand(this, new Command("javaversion", "karatemaccie.javaversion", new String[0]) {
			
			@Override
			public void execute(CommandSender sender, String[] args) {
				sender.sendMessage(new TextComponent(JavaVersionAPI.getVersionString()));
			}
		});
		super.onEnable();
	}
}
