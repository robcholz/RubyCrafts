package com.robcholz.RubyCrafts.tools;

import com.robcholz.RubyCrafts.items.RubyCraftsItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class RubyToolMaterial implements ToolMaterial {

    private final int itemDurability=40;
    private final float miningSpeed=13F;
    private final float attackDamage=0.6F;
    private final int miningLevel=2;
    private final int enchantability=33;

    public static final RubyToolMaterial INSTANCE = new RubyToolMaterial();

    @Override
    public int getDurability() {
        return itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return miningLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(RubyCraftsItems.CORUNDUM);
    }
}
