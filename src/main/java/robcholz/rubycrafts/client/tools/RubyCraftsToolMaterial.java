package robcholz.rubycrafts.client.tools;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import robcholz.rubycrafts.client.items.RubyCraftsItems;

public class RubyCraftsToolMaterial implements ToolMaterial {

    public static final RubyCraftsToolMaterial INSTANCE = new RubyCraftsToolMaterial();
    private final int itemDurability = 40;
    private final float miningSpeed = 13F;
    private final float attackDamage = 0.6F;
    private final int miningLevel = 2;
    private final int enchantability = 33;

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
        return Ingredient.ofItems(RubyCraftsItems.RUBY);
    }
}
