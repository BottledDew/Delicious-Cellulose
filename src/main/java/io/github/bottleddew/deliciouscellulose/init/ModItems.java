package io.github.bottleddew.deliciouscellulose.init;

import io.github.bottleddew.deliciouscellulose.DeliciousCellulose;
import io.github.bottleddew.deliciouscellulose.init.data.ModItemsFoodTemplates;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //Basic ingredients
    public static final Item TREE_FLOUR = new Item(new Item.Settings().group(DeliciousCellulose.ITEM_GROUP));
    public static final Item MYSTERY_MEAT = new Item(new Item.Settings().group(DeliciousCellulose.ITEM_GROUP).food(ModItemsFoodTemplates.MYSTERY_MEAT));

    //Foods
    public static final Item BREAD_SUBSTITUTE = new Item(new Item.Settings().group(DeliciousCellulose.ITEM_GROUP).food(ModItemsFoodTemplates.BREAD_SUBSTITUTE));
    public static final Item MYSTERY_MEAT_STEW = new Item(new Item.Settings().group(DeliciousCellulose.ITEM_GROUP).food(ModItemsFoodTemplates.MYSTERY_MEAT_STEW));

    //Tools
    public static final Item RASP_TOOL = new Item(new Item.Settings().group(DeliciousCellulose.ITEM_GROUP));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(DeliciousCellulose.MOD_ID, "tree_flour"), TREE_FLOUR);
        Registry.register(Registry.ITEM, new Identifier(DeliciousCellulose.MOD_ID, "bread_substitute"), BREAD_SUBSTITUTE);
        Registry.register(Registry.ITEM, new Identifier(DeliciousCellulose.MOD_ID, "mystery_meat"), MYSTERY_MEAT);
        Registry.register(Registry.ITEM, new Identifier(DeliciousCellulose.MOD_ID, "mystery_meat_stew"), MYSTERY_MEAT_STEW);
        Registry.register(Registry.ITEM, new Identifier(DeliciousCellulose.MOD_ID, "rasp_tool"), RASP_TOOL);
    }
}
