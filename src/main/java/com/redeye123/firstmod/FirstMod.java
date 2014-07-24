package com.redeye123.firstmod;

import com.redeye123.firstmod.blocks.BlockFirstOre;
import com.redeye123.firstmod.blocks.worldgeneration.FirstOreWorld;
import com.redeye123.firstmod.help.Reference;
import com.redeye123.firstmod.help.RegisterHelper;
import com.redeye123.firstmod.items.*;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = Reference.MODID,name = Reference.NAME , version =  Reference.VERSION)
public class FirstMod
{
    @Mod.Instance("FirstMod")
    public static FirstMod instance;

    public static Block FirstOre;
    public static Item FirstOreGem;

    //WorldGen

    public static FirstOreWorld worldgenore = new FirstOreWorld();

    //Tools
    public static Item firstore_pickaxe;
    public static Item firstore_axe;
    public static Item firstore_shovel;
    public static Item firstore_sword;
    public static Item firstore_hoe;

    //Materials
    static Item.ToolMaterial firstoreMaterial = EnumHelper.addToolMaterial("firstoreMaterial" ,3 ,3250 ,10.0F ,3.5F ,15);
    static ItemArmor.ArmorMaterial firstoreArmorMaterial = EnumHelper.addArmorMaterial("firstoreArmorMaterial",45,new int[]{4, 9, 7, 4}, 8);

    //Armor
    public static Item firstore_boots;
    public static Item firstore_chestplate;
    public static Item firstore_helmet;
    public static Item firstore_leggings;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        FirstOre = new BlockFirstOre();
        FirstOreGem = new ItemFirstOreGem();
        RegisterHelper.registerItem(FirstOreGem);
        RegisterHelper.registerBlock(FirstOre);

        //Tools

        firstore_pickaxe = new ItemFirstOrePickaxe(firstoreMaterial);
        RegisterHelper.registerItem(firstore_pickaxe);
        GameRegistry.addRecipe(new ItemStack(firstore_pickaxe) , new Object[]
                {
                        "XXX",
                        " Y ",
                        " Z ",
                        'X', FirstOreGem, 'Y', Items.diamond_pickaxe, 'Z', Items.stick
                });

        firstore_axe = new ItemFirstOreAxe(firstoreMaterial);
        RegisterHelper.registerItem(firstore_axe);
        GameRegistry.addRecipe(new ItemStack(firstore_axe) , new Object[]
                {
                        "XX",
                        "XY",
                        " Z",
                        'X', FirstOreGem, 'Y', Items.diamond_axe, 'Z', Items.stick
                });
        GameRegistry.addRecipe(new ItemStack(firstore_axe) , new Object[]
                {
                        "XX",
                        "YX",
                        "Z ",
                        'X', FirstOreGem, 'Y', Items.diamond_axe, 'Z', Items.stick
                });

        firstore_shovel = new ItemFirstOreShovel(firstoreMaterial);
        RegisterHelper.registerItem(firstore_shovel);
        GameRegistry.addRecipe(new ItemStack(firstore_shovel) , new Object[]
                {
                        " X ",
                        " Y ",
                        " Z ",
                        'X', FirstOreGem, 'Y', Items.diamond_shovel, 'Z', Items.stick
                });

        firstore_hoe = new ItemFirstOrehoe(firstoreMaterial);
        RegisterHelper.registerItem(firstore_hoe);
        GameRegistry.addRecipe(new ItemStack(firstore_hoe) , new Object[]
                {
                        "XX ",
                        " Y ",
                        " Z ",
                        'X', FirstOreGem, 'Y', Items.diamond_hoe, 'Z', Items.stick
                });

        firstore_sword = new ItemFirstOreSword(firstoreMaterial);
        RegisterHelper.registerItem(firstore_sword);
        GameRegistry.addRecipe(new ItemStack(firstore_sword) , new Object[]
                {
                        " X ",
                        " X ",
                        " Y ",
                        'X', FirstOreGem, 'Y', Items.diamond_sword
                });

        //armor
        firstore_helmet = new ItemFirstOreArmor(firstoreArmorMaterial, 0, "firstore_helmet");
        RegisterHelper.registerItem(firstore_helmet);
        GameRegistry.addRecipe(new ItemStack(firstore_helmet) , new Object[]
                {
                        "XXX",
                        "XYX",
                        'X', FirstOreGem, 'Y', Items.diamond_helmet
                });

        firstore_chestplate = new ItemFirstOreArmor(firstoreArmorMaterial, 1, "firstore_chestplate");
        RegisterHelper.registerItem(firstore_chestplate);
        GameRegistry.addRecipe(new ItemStack(firstore_chestplate) , new Object[]
                {
                        "XYX",
                        "XXX",
                        "XXX",
                        'X', FirstOreGem, 'Y', Items.diamond_chestplate
                });

        firstore_leggings = new ItemFirstOreArmor(firstoreArmorMaterial, 2, "firstore_leggings");
        RegisterHelper.registerItem(firstore_leggings);
        GameRegistry.addRecipe(new ItemStack(firstore_leggings) , new Object[]
                {
                        "XXX",
                        "XYX",
                        "X X",
                        'X', FirstOreGem, 'Y', Items.diamond_leggings
                });

        firstore_boots = new ItemFirstOreArmor(firstoreArmorMaterial, 3, "firstore_boots");
        RegisterHelper.registerItem(firstore_boots);
        GameRegistry.addRecipe(new ItemStack(firstore_boots) , new Object[]
                {
                        "XYX",
                        "X X",
                        'X', FirstOreGem, 'Y', Items.diamond_boots
                });

        GameRegistry.registerWorldGenerator(worldgenore, 1);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
