package de.c0d3x94.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.c0d3x94.listeners.PlayerJoinQuit;
import de.c0d3x94.listeners.PlayerJumpPad;

public class Main extends JavaPlugin{
	@Override
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage("§f[§6C0D3X94§f] §f===> Plugin §2aktiviert");
		registerListeners();
		registerCommands();
	}
	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage("§f[§6C0D3X94§f] §f===> Plugin §4deaktiviert");
	}
	public static String getPrefix() {
		return "§f[§6C0D3X94§f]";
	}
	public void registerListeners() {
		PluginManager manager = Bukkit.getPluginManager();
		manager.registerEvents(new PlayerJoinQuit(), this);
		manager.registerEvents(new PlayerJumpPad(), this);
	}
	public void registerCommands() {
		//comming soon
	}

}
