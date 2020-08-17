
package net.mcreator.uraniummod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.uraniummod.itemgroup.UraniumTabItemGroup;
import net.mcreator.uraniummod.UraniummodModElements;

@UraniummodModElements.ModElement.Tag
public class UraniumAxeItem extends UraniummodModElements.ModElement {
	@ObjectHolder("uraniummod:uranium_axe")
	public static final Item block = null;
	public UraniumAxeItem(UraniummodModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 16f;
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
		}, 1, -3f, new Item.Properties().group(UraniumTabItemGroup.tab)) {
		}.setRegistryName("uranium_axe"));
	}
}
