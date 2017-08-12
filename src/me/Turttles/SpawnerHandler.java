package me.Turttles;

import org.bukkit.Material;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import net.minecraft.server.v1_11_R1.Enchantment;

public class SpawnerHandler implements Listener {
	
	@EventHandler
	public void spawnerBreak(BlockBreakEvent e) {
		Player p = e.getPlayer();
		
		
		if(!p.hasPermission("tpvp.spawners.override")) {
		if(p.getWorld().equals(Main.config.getConfig().getString("nether_world"))) {
			if(e.getBlock().equals(Material.MOB_SPAWNER)) {
				
				ItemStack pick = new ItemStack(Material.DIAMOND_PICKAXE, 1);

			if(e.getPlayer().getInventory().getItemInHand() == pick) {
				e.setCancelled(true);
			}
			
			
			
		} else {
			
			//world check | do nothing
		}
		} else {
			
			//perm check | do nothing
		}
		
		
	}
	}
	
	
	
	
	
	
	

}
