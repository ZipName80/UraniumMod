
package net.mcreator.uraniummod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.uraniummod.itemgroup.UraniumTabItemGroup;
import net.mcreator.uraniummod.UraniummodModElements;

@UraniummodModElements.ModElement.Tag
public class UraniumSwordItem extends UraniummodModElements.ModElement {
	@ObjectHolder("uraniummod:uranium_sword")
	public static final Item block = null;
	public UraniumSwordItem(UraniummodModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
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
		}, 3, -3f, new Item.Properties().group(UraniumTabItemGroup.tab)) {
		}.setRegistryName("uranium_sword"));
	}
}
