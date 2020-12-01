package com.maybeapexin.asteroid.registry.items.tools;

import com.maybeapexin.asteroid.registry.AsteroidItemGroups;
import com.maybeapexin.asteroid.registry.items.resources.RubyGem;
import com.maybeapexin.asteroid.registry.toolReg.PickaxeTool;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EmeraldPickaxe {
    public static final PickaxeTool EMERALD_PICKAXE = new PickaxeTool(new ToolMaterial() {
        @Override
        public int getDurability() {

            return 1000;
        }

        @Override
        public float getMiningSpeedMultiplier() {

            return 45;
        }

        @Override
        public float getAttackDamage() {

            return 1.2f;
        }

        @Override
        public int getMiningLevel() {

            return 3;
        }

        @Override
        public int getEnchantability() {

            return 22;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(RubyGem.RUBY);
        }
    }, 1, -2.6f, new Item.Settings().group(AsteroidItemGroups.ITEM_GROUP).maxCount(1));
}
