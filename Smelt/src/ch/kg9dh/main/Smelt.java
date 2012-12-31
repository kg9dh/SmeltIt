package ch.kg9dh.main;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class Smelt extends JavaPlugin{

	@Override
	public void onEnable() {
		//on enable, nothing to do
 	}

 	@Override
    public void onDisable() {
 		//on disable, nothing to do
	}
 	
 	@Override
 	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){		
 		 		
 		if(cmd.getName().equalsIgnoreCase("smelt")){
 			
 			Player p = (Player) sender;				//player who run the command
 			ItemStack item = p.getItemInHand();		//item in the players hand
 		
 		//permission to smelt
 		if(p.hasPermission("smelt.smelt")){
 			
 			//for the values of the enum
 			for(ITEMS is : ITEMS.values()){
 				
 				//if the item in the hand matches to a value
 				if(item.getTypeId()==is.getItemstack().getTypeId()){
 					
 					//Some maths to get how much worth the armour is
 					float ingotsback = is.getDurability()-item.getDurability();
 					ingotsback = (is.getIngots()*ingotsback)/is.getDurability();
 					 			
 					//if it's near to 0, give the player still an ingot
 					if(ingotsback<1){
 						ingotsback=1;
 					}
 					
 					//remove the item
 					p.getInventory().remove(item);
 					
 					//cast it to an int (pulls it down -> 7.9 >> 7)
 					int ib = (int)ingotsback;
 					
 					//for the "worth" give items related to the smelted object
 					for(int x = 1; x<=ib; x++){
 						p.getInventory().addItem(is.getThe_ingot());
 					}
 					
 				}else{
 					//if item is not in the enum or air
 					p.sendMessage(ChatColor.DARK_RED+"[SmeltIt] "+ChatColor.RED+"You can't smelt this item!");
 				}
 			}
 		}
 			//returns that command was successfull
 			return true;
 		}
 		
 		//no command done, nothing to succeed
 		return false;
 	}

}
