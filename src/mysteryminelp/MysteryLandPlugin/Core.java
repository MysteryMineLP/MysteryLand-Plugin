package mysteryminelp.MysteryLandPlugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("MysteryLand Plugin aktiviert!");
	}
	
	@Override
	public void onDisable() {
		System.out.println("MysteryLand Plugin deaktiviert!");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandlabel,String[] args) {
		Player player = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("ping"))
		{
			player.sendMessage("Pong!");
			return true;
		}
		else if(cmd.getName().equalsIgnoreCase("heilen"))
		{
			if(player.isOp())
			{
				player.setHealth(20);
				player.sendMessage("Geheilt!");
				return true;
			}
			else;
			{
				player.sendMessage("§4Keine Berechtigung!");
				return true;
			}
		}
		return false;
	}
}
