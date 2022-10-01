package com.robcholz.RubyCrafts.items;

import com.robcholz.RubyCrafts.RubyCrafts;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class RubyCraftsItems {

    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static final Block RUBY_BLOCK=new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f));

    public static final Block RUBY_ORE = new Block(FabricBlockSettings.of(Material.METAL).hardness(3.0f));

    public static final Item CORUNDUM = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static void registerItems() {
        Registry.register(Registry.ITEM,new Identifier(RubyCrafts.MOD_ID,"ruby"),RUBY);

        Registry.register(Registry.BLOCK,new Identifier(RubyCrafts.MOD_ID,"ruby_block"),RUBY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(RubyCrafts.MOD_ID, "ruby_block"), new BlockItem(RUBY_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.BLOCK,new Identifier(RubyCrafts.MOD_ID,"ruby_ore"),RUBY_ORE);
        Registry.register(Registry.ITEM, new Identifier(RubyCrafts.MOD_ID, "ruby_ore"), new BlockItem(RUBY_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));


        Registry.register(Registry.ITEM,new Identifier(RubyCrafts.MOD_ID,"corundum"),CORUNDUM);


    }

}
