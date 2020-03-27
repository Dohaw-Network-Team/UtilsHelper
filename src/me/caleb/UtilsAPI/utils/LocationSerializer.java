package me.caleb.UtilsAPI.utils;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;

/*
 * Created by c10coding. Plugin SpongeX
 * 
 * Description: A plugin used to claim areas via sponge.
 */

public class LocationSerializer {

	private FileConfiguration config;
	private Location loc;
	private String path;
	
	public LocationSerializer(FileConfiguration config, Location loc, String path) {
		this.config = config;
		this.loc = loc;
		this.path = path;
	}
	
	public LocationSerializer(FileConfiguration config, String path) {
		this.config = config;
		this.path = path;
	}
	
	public void storeLocation() {
		config.set(path, "World: " + loc.getWorld() + ";X: " + loc.getX() + ";Y: " + loc.getY() + ";Z: " + loc.getZ());
	}
	
	public Location toLocation() {
		
		World w;
		double x,y,z;
		
		String line = config.getString(path);
		String[] arrLine = line.split(";");
		w =  Bukkit.getWorld(arrLine[0].substring(7));
		x = Double.parseDouble(arrLine[1].substring(3));
		y = Double.parseDouble(arrLine[2].substring(3));
		z = Double.parseDouble(arrLine[3].substring(3));
		
		return new Location(w, x, y, z);
	}
	
}
