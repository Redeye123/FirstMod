package com.redeye123.firstmod.items;

import com.redeye123.firstmod.FirstMod;
import com.redeye123.firstmod.help.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

/**
 * Created by RedeyeNatsu on 7/24/2014.
 */
public class ItemFirstOreArmor extends ItemArmor {

    public ItemFirstOreArmor(ArmorMaterial material, int armorType, String name)
    {
        super(material, 0 , armorType);
        setUnlocalizedName(name);
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CreativeTabs.tabCombat);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == FirstMod.firstore_helmet || stack.getItem() == FirstMod.firstore_boots || stack.getItem() == FirstMod.firstore_chestplate)
        {
            return Reference.MODID + ":models/armor/FirstOreArmor_layer_1.png";
        }
        else if(stack.getItem() == FirstMod.firstore_leggings)
        {
            return Reference.MODID + ":models/armor/FirstOreArmor_layer_2.png";
        }
        else
        {
            System.out.println("Wrong Armor Item !!! Srry xD");
            return null;
        }

    }
}
