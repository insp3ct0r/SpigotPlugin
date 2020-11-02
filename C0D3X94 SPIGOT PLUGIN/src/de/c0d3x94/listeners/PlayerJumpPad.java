package de.c0d3x94.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerJumpPad implements Listener{
	@EventHandler
	public void playerJump(PlayerMoveEvent e) {
		Player player = e.getPlayer();
		if(player.getLocation().getBlock().getType() == Material.IRON_TRAPDOOR) {
			if(player.getLocation().subtract(0,1,0).getBlock().getType() == Material.BEACON) {
				org.bukkit.util.Vector v = player.getLocation().getDirection().multiply(1).setY(2);
				player.setVelocity(v);
			}
		}
	}
}
