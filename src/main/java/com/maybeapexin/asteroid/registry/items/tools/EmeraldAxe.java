package com.maybeapexin.asteroid.registry.items.tools;

import com.maybeapexin.asteroid.registry.AsteroidItemGroups;
import com.maybeapexin.asteroid.registry.items.resources.RubyGem;
import com.maybeapexin.asteroid.registry.toolReg.AxeTool;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EmeraldAxe {
    public static final AxeTool EMERALD_AXE = new AxeTool(new ToolMaterial() {
        @Override
        public int getDurability() {
            return 750;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 13;
        }

        @Override
        public float getAttackDamage() {
            return 6.7f;
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
    }, 7.5f, -1.2f, new Item.Settings().group(AsteroidItemGroups.ITEM_GROUP));
}
