package com.teamabnormals.buzzier_bees.core.data.server.tags;

import com.teamabnormals.buzzier_bees.core.BuzzierBees;
import com.teamabnormals.buzzier_bees.core.other.tags.BBBlockTags;
import com.teamabnormals.buzzier_bees.core.other.tags.BBItemTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BBItemTagsGenerator extends ItemTagsProvider {

	public BBItemTagsGenerator(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper fileHelper) {
		super(generator, blockTags, BuzzierBees.MOD_ID, fileHelper);
	}

	@Override
	public void addTags() {
		this.copy(BlockTags.SMALL_FLOWERS, ItemTags.SMALL_FLOWERS);
		this.copy(BlockTags.SLABS, ItemTags.SLABS);
		this.copy(BlockTags.STAIRS, ItemTags.STAIRS);
		this.copy(BlockTags.WALLS, ItemTags.WALLS);
		this.copy(BBBlockTags.VERTICAL_SLABS, BBItemTags.VERTICAL_SLABS);

		this.copy(BlockTags.DOORS, ItemTags.DOORS);
		this.copy(BlockTags.TRAPDOORS, ItemTags.TRAPDOORS);
		this.copy(BlockTags.PIGLIN_REPELLENTS, ItemTags.PIGLIN_REPELLENTS);

		this.tag(BBItemTags.GRIZZLY_BEAR_FOOD).add(Items.SALMON, Items.COOKED_SALMON, Items.SALMON_BUCKET);
	}
}