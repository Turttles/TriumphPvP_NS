package me.Turttles;

import java.io.File;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	
	public static Config data;
	public static Config config;
	
	public void onEnable() {
		data = new Config("plugins/TriumphSpawners", "data.yml", this);
		data = new Config("plugins/TriumphSpawners", "config.yml", this);
		
	}
	
	public void onDisable() {
		
		data.saveConfig();
		config.saveConfig();
	}
	
	
	public void setup(){
		
		
		
	}
	

	
	
	

}
