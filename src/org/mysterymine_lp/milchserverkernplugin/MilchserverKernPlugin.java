package org.mysterymine_lp.milchserverkernplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class MilchserverKernPlugin extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("Milchserver Kernplugin aktiviert!");
	}
	
	@Override
	public void onDisable() {
		System.out.println("Milchserver Kernplugin deaktiviert!");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandlabel,String[] args) {
		Player player = (Player) sender;
		boolean kern = true;
		if(cmd.getName().equalsIgnoreCase("ping"))
		{
			player.sendMessage("Pong!");
			kern = false;
		}
		if(cmd.getName().equalsIgnoreCase("heilen"))
		{
			if(player.isOp())
			{
				player.setHealth(20);
				player.sendMessage("Geheilt!");
				kern = false;
			}
			else;
			{
				player.sendMessage("§4Keine Berechtigung!");
				kern = false;
			}
		}
		return kern;
	}

}
