package com.robcholz.items;

import com.robcholz.RubyCrafts;
import com.robcholz.armor.RubyCraftsArmorMaterial;
import com.robcholz.tools.RubyAxeItem;
import com.robcholz.tools.RubyCraftsToolMaterial;
import com.robcholz.tools.RubyHoeItem;
import com.robcholz.tools.RubyPickaxeItem;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;


public class RubyCraftsItems {


    // Ruby blocks
    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F)
            .breakByTool(FabricToolTags.PICKAXES, 2).requiresTool());

    public static final Block RUBY_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0F)
            .breakByTool(FabricToolTags.PICKAXES, 2).requiresTool());


    // Ruby armor
    public static final Item RUBY_HELMET = registerRubyCraftsItems("ruby_helmet",
            new ArmorItem(RubyCraftsArmorMaterial.RUBY, EquipmentSlot.HEAD,
                    new Item.Settings().group(ItemGroup.COMBAT)));

    public static final Item RUBY_CHESTPLATE = registerRubyCraftsItems("ruby_chestplate",
            new ArmorItem(RubyCraftsArmorMaterial.RUBY, EquipmentSlot.CHEST,
                    new Item.Settings().group(ItemGroup.COMBAT)));

    public static final Item RUBY_LEGGINGS = registerRubyCraftsItems("ruby_leggings",
            new ArmorItem(RubyCraftsArmorMaterial.RUBY, EquipmentSlot.LEGS,
                    new Item.Settings().group(ItemGroup.COMBAT)));

    public static final Item RUBY_BOOTS = registerRubyCraftsItems("ruby_boots",
            new ArmorItem(RubyCraftsArmorMaterial.RUBY, EquipmentSlot.FEET,
                    new Item.Settings().group(ItemGroup.COMBAT)));


    // Ruby tools
    public static ToolItem RUBY_SHOVEL = new ShovelItem(RubyCraftsToolMaterial.INSTANCE, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));

    public static ToolItem RUBY_SWORD = new SwordItem(RubyCraftsToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));

    public static ToolItem RUBY_PICKAXE = new RubyPickaxeItem(RubyCraftsToolMaterial.INSTANCE, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));

    public static ToolItem RUBY_AXE = new RubyAxeItem(RubyCraftsToolMaterial.INSTANCE, 7, -3.2F, new Item.Settings().group(ItemGroup.TOOLS));

    public static ToolItem RUBY_HOE = new RubyHoeItem(RubyCraftsToolMaterial.INSTANCE, 7, -3.2F, new Item.Settings().group(ItemGroup.TOOLS));


    private static Item registerRubyCraftsItems(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(RubyCrafts.MOD_ID, name), item);
    }

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(RubyCrafts.MOD_ID, "ruby"), RUBY);

        Registry.register(Registry.BLOCK, new Identifier(RubyCrafts.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(RubyCrafts.MOD_ID, "ruby_block"), new BlockItem(RUBY_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier(RubyCrafts.MOD_ID, "ruby_ore"), RUBY_ORE);
        Registry.register(Registry.ITEM, new Identifier(RubyCrafts.MOD_ID, "ruby_ore"), new BlockItem(RUBY_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.ITEM, new Identifier(RubyCrafts.MOD_ID, "ruby_shovel"), RUBY_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(RubyCrafts.MOD_ID, "ruby_sword"), RUBY_SWORD);
        Registry.register(Registry.ITEM, new Identifier(RubyCrafts.MOD_ID, "ruby_pickaxe"), RUBY_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(RubyCrafts.MOD_ID, "ruby_axe"), RUBY_AXE);
        Registry.register(Registry.ITEM, new Identifier(RubyCrafts.MOD_ID, "ruby_hoe"), RUBY_HOE);


    }

}
