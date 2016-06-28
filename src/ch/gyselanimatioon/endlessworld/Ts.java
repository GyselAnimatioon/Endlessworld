package ch.gyselanimatioon.endlessworld;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.libs.jline.internal.Log;
import org.bukkit.entity.Player;

public class Ts implements CommandExecutor {

	public Ts() {

	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = null;
		if (sender instanceof Player) {
			player = (Player) sender;
		}
		if (player != null) {
			player.sendMessage("§8[§eTeamspeak§8] §6IP: 89.163.209.252:9989");
		} else {
			Log.info("89.163.209.252:9989");
		}
		return true;
	}

}