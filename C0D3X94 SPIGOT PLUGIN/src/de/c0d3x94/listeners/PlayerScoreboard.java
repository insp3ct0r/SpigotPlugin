package de.c0d3x94.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

public class PlayerScoreboard implements Listener{
	public static void createScoreboard(Player player) {
		Scoreboard board = Bukkit.getScoreboardManager().getNewScoreboard();
		Objective obj = board.registerNewObjective("Scoreboard","dummy");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		obj.getScore("    ").setScore(6);
		obj.getScore("§6Name: " + player.getName()).setScore(4);
		obj.getScore("").setScore(2);
		player.setScoreboard(board);
	}
}
