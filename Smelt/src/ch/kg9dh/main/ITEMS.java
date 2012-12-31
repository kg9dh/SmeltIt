package ch.kg9dh.main;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public enum ITEMS {

	/////ARMOUR//////////////

	DIAMOND_HELMET(new ItemStack(Material.DIAMOND_HELMET, 1), (short)364, 5, new ItemStack(Material.DIAMOND, 1)),
	DIAMOND_CHESTPLATE(new ItemStack(Material.DIAMOND_CHESTPLATE, 1), (short)529, 8, new ItemStack(Material.DIAMOND, 1)),
	DIAMOND_LEGGINGS(new ItemStack(Material.DIAMOND_LEGGINGS, 1), (short)496, 7, new ItemStack(Material.DIAMOND, 1)),
	DIAMOND_BOOTS(new ItemStack(Material.DIAMOND_BOOTS, 1), (short)430, 4, new ItemStack(Material.DIAMOND, 1)),

	IRON_HELMET(new ItemStack(Material.IRON_HELMET, 1), (short)166, 5, new ItemStack(Material.IRON_INGOT, 1)),
	IRON_CHESTPLATE(new ItemStack(Material.IRON_CHESTPLATE, 1), (short)241, 8, new ItemStack(Material.IRON_INGOT, 1)),
	IRON_LEGGINGS(new ItemStack(Material.IRON_LEGGINGS, 1), (short)226, 7, new ItemStack(Material.IRON_INGOT, 1)),
	IRON_BOOTS(new ItemStack(Material.IRON_BOOTS, 1), (short)196, 4, new ItemStack(Material.IRON_INGOT, 1)),

	CHAINMAIL_HELMET(new ItemStack(Material.CHAINMAIL_BOOTS, 1), (short)166, 5, new ItemStack(Material.FIRE, 1)),
	CHAINMAIL_CHESTPLATE(new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1), (short)241, 8, new ItemStack(Material.FIRE, 1)),
	CHAINMAIL_LEGGINGS(new ItemStack(Material.CHAINMAIL_LEGGINGS, 1), (short)226, 7, new ItemStack(Material.FIRE, 1)),
	CHAINMAIL_BOOTS(new ItemStack(Material.CHAINMAIL_BOOTS, 1), (short)196, 4, new ItemStack(Material.FIRE, 1)),

	GOLD_HELMET(new ItemStack(Material.GOLD_HELMET, 1), (short)78, 5, new ItemStack(Material.GOLD_INGOT, 1)),
	GOLD_CHESTPLATE(new ItemStack(Material.GOLD_CHESTPLATE, 1), (short)113, 8, new ItemStack(Material.GOLD_INGOT, 1)),
	GOLD_LEGGINGS(new ItemStack(Material.GOLD_LEGGINGS, 1), (short)106, 7, new ItemStack(Material.GOLD_INGOT, 1)),
	GOLD_BOOTS(new ItemStack(Material.GOLD_BOOTS, 1), (short)92, 4, new ItemStack(Material.GOLD_INGOT, 1)),

	LEATHER_HELMET(new ItemStack(Material.LEATHER_HELMET, 1), (short)56, 5, new ItemStack(Material.LEATHER, 1)),
	LEATHER_CHESTPLATE(new ItemStack(Material.LEATHER_CHESTPLATE, 1), (short)81, 8, new ItemStack(Material.LEATHER, 1)),
	LEATHER_LEGGINGS(new ItemStack(Material.LEATHER_LEGGINGS, 1), (short)76, 7, new ItemStack(Material.LEATHER, 1)),
	LEATHER_BOOTS(new ItemStack(Material.LEATHER_BOOTS, 1), (short)66, 4, new ItemStack(Material.LEATHER, 1)), 

	/////TOOLS//////////////

	DIAMOND_AXE(new ItemStack(Material.DIAMOND_AXE, 1), (short)364, 3, new ItemStack(Material.DIAMOND, 1)),
	DIAMOND_HOE(new ItemStack(Material.DIAMOND_HOE, 1), (short)529, 2, new ItemStack(Material.DIAMOND, 1)),
	DIAMOND_PICKAXE(new ItemStack(Material.DIAMOND_PICKAXE, 1), (short)496, 3, new ItemStack(Material.DIAMOND, 1)),
	DIAMOND_SWORD(new ItemStack(Material.DIAMOND_SWORD, 1), (short)430, 2, new ItemStack(Material.DIAMOND, 1)),

	IRON_AXE(new ItemStack(Material.IRON_AXE, 1), (short)364, 3, new ItemStack(Material.IRON_INGOT, 1)),
	IRON_HOE(new ItemStack(Material.IRON_HOE, 1), (short)529, 2, new ItemStack(Material.IRON_INGOT, 1)),
	IRON_PICKAXE(new ItemStack(Material.IRON_PICKAXE, 1), (short)496, 3, new ItemStack(Material.IRON_INGOT, 1)),
	IRON_SWORD(new ItemStack(Material.IRON_SWORD, 1), (short)430, 2, new ItemStack(Material.IRON_INGOT, 1)),

	STONE_AXE(new ItemStack(Material.STONE_AXE, 1), (short)364, 3, new ItemStack(Material.STONE, 1)),
	STONE_HOE(new ItemStack(Material.STONE_HOE, 1), (short)529, 2, new ItemStack(Material.STONE, 1)),
	STONE_PICKAXE(new ItemStack(Material.STONE_PICKAXE, 1), (short)496, 3, new ItemStack(Material.STONE, 1)),
	STONE_SWORD(new ItemStack(Material.STONE_SWORD, 1), (short)430, 2, new ItemStack(Material.STONE, 1)),

	GOLD_AXE(new ItemStack(Material.GOLD_AXE, 1), (short)364, 3, new ItemStack(Material.GOLD_INGOT, 1)),
	GOLD_HOE(new ItemStack(Material.GOLD_HOE, 1), (short)529, 2, new ItemStack(Material.GOLD_INGOT, 1)),
	GOLD_PICKAXE(new ItemStack(Material.GOLD_PICKAXE, 1), (short)496, 3, new ItemStack(Material.GOLD_INGOT, 1)),
	GOLD_SWORD(new ItemStack(Material.GOLD_SWORD, 1), (short)430, 2, new ItemStack(Material.GOLD_INGOT, 1)),

	WOOD_AXE(new ItemStack(Material.WOOD_AXE, 1), (short)364, 3, new ItemStack(Material.WOOD, 1)),
	WOOD_HOE(new ItemStack(Material.WOOD_HOE, 1), (short)529, 2, new ItemStack(Material.WOOD, 1)),
	WOOD_PICKAXE(new ItemStack(Material.WOOD_PICKAXE, 1), (short)496, 3, new ItemStack(Material.WOOD, 1)),
	WOOD_SWORD(new ItemStack(Material.WOOD_SWORD, 1), (short)430, 2, new ItemStack(Material.WOOD, 1));

	//Some fields
	private ItemStack itemstack;
	private short durability;
	private int ingots;
	private ItemStack the_ingot;

	/////ENUM CONSTRUCTOR//////////////
	//Itemstack to be burned, it's full durability, ammount of ingots to craft item, the item/ingot it returns
	ITEMS(final ItemStack itemstack, final short durability, final int ingots, final ItemStack the_ingot){
		this.itemstack = itemstack;
		this.durability = durability;
		this.ingots = ingots;
		this.the_ingot = the_ingot;
	}

	/////GETTERS & SETTERS//////////////
	//to get data from the enum in the other class

	public ItemStack getItemstack() {
		return itemstack;
	}

	public void setItemstack(ItemStack itemstack) {
		this.itemstack = itemstack;
	}

	public short getDurability() {
		return durability;
	}

	public void setDurability(short durability) {
		this.durability = durability;
	}

	public int getIngots() {
		return ingots;
	}

	public void setIngots(int ingots) {
		this.ingots = ingots;
	}

	public ItemStack getThe_ingot() {
		return the_ingot;
	}

	public void setThe_ingot(ItemStack the_ingot) {
		this.the_ingot = the_ingot;
	}

}