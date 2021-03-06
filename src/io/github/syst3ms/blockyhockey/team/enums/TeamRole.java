package io.github.syst3ms.blockyhockey.team.enums;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public enum TeamRole {
	OFFENSE("Offense", Material.DIAMOND_HOE),
	DEFENSE("Defense", Material.DIAMOND_HOE),
	GOALIE("Goalie", Material.GOLD_HOE),
	NONE("None", Material.STICK);

	private final ItemStack stickItem;
	private final String name;
    private final Material stickType;

    TeamRole(String name, Material material) {
		this.name = name;
        stickType = material;
        ItemStack item = new ItemStack(material);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(name + " Stick");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		item.setItemMeta(meta);
		this.stickItem = item;
	}

	public String getName() {
		return name;
	}

	public ItemStack getStickItem() {
		return stickItem;
	}

    public Material getStickType() {
        return stickType;
    }
}
