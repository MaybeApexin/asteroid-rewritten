package com.maybeapexin.asteroid.registry;

import com.maybeapexin.asteroid.registry.blocks.GemOre;
import com.maybeapexin.asteroid.registry.items.resources.RubyGem;
import com.maybeapexin.asteroid.registry.items.food.BowlOfRice;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class AsteroidItemGroups {

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier("asteroid", "library"),

            () -> new ItemStack(RubyGem.RUBY));

        public static final ItemGroup MISC_GROUP = FabricItemGroupBuilder.create(
                new Identifier("asteroid","miscellaneous"))

                .icon(() -> new ItemStack(BowlOfRice.BOWL_O_RICE))
                .build();

   /* public static final ItemGroup BLOCK_GROUP = FabricItemGroupBuilder.create(
            new Identifier("asteroid", "blocks"))

            .icon(() -> new ItemStack(ModRegistry.GEMSTONE_ORE))
            .build();

    /*/
}