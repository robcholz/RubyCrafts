package com.robcholz.RubyCrafts;

import com.robcholz.RubyCrafts.items.RubyCraftsItems;
import net.fabricmc.api.ModInitializer;

public class RubyCrafts implements ModInitializer {

    public static final String MOD_ID="ruby_crafts";

    @Override
    public void onInitialize() {
        RubyCraftsItems.registerItems();





    }

}
