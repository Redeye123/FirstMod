package com.redeye123.firstmod.items;

import com.redeye123.firstmod.help.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by RedeyeNatsu on 7/24/2014.
 */
public class ItemFirstOreGem extends Item
{
    public ItemFirstOreGem()
    {
        super();
        setUnlocalizedName("FirstOreGem");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CreativeTabs.tabMaterials);
    }
}
