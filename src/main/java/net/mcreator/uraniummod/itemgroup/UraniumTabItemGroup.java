
package net.mcreator.uraniummod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.uraniummod.item.UraniumDustItem;
import net.mcreator.uraniummod.UraniummodModElements;

@UraniummodModElements.ModElement.Tag
public class UraniumTabItemGroup extends UraniummodModElements.ModElement {
	public UraniumTabItemGroup(UraniummodModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("taburanium_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(UraniumDustItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
