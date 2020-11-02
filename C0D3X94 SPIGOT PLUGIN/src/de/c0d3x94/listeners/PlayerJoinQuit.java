package de.c0d3x94.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import de.c0d3x94.main.Main;

public class PlayerJoinQuit implements Listener{
	@EventHandler
	public void playerJoin(PlayerJoinEvent e) {
		e.setJoinMessage(Main.getPrefix() + " " + "Der Spieler " + "§6" + e.getPlayer().getName() + " §fhat den Server betreten");
		PlayerScoreboard.createScoreboard(e.getPlayer());
	}
	@EventHandler
	public void playerQuit(PlayerQuitEvent e) {
		e.setQuitMessage(Main.getPrefix() + " " + "Der Spieler " + "§6" + e.getPlayer().getName() + " §fhat den Server verlassen");
	}
}
