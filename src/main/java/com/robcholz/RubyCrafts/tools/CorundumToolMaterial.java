package com.robcholz.RubyCrafts.tools;

import com.robcholz.RubyCrafts.items.RubyCraftsItems;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CorundumToolMaterial implements ToolMaterial {
    private final int itemDurability=1841;
    private final float miningSpeed=8.5F;
    private final float attackDamage=3.5F;
    private final int miningLevel=4;
    private final int enchantability=13;

    public static final CorundumToolMaterial INSTANCE = new CorundumToolMaterial();

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
