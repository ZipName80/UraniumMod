
package net.mcreator.uraniummod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.uraniummod.itemgroup.UraniumTabItemGroup;
import net.mcreator.uraniummod.UraniummodModElements;

@UraniummodModElements.ModElement.Tag
public class UraniumHoeItem extends UraniummodModElements.ModElement {
	@ObjectHolder("uraniummod:uranium_hoe")
	public static final Item block = null;
	public UraniumHoeItem(UraniummodModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 42;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, -3f, new Item.Properties().group(UraniumTabItemGroup.tab)) {
		}.setRegistryName("uranium_hoe"));
	}
}
