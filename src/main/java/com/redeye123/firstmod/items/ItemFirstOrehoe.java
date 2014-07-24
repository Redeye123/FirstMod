package com.redeye123.firstmod.items;

import com.redeye123.firstmod.help.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

/**
 * Created by RedeyeNatsu on 7/24/2014.
 */
public class ItemFirstOrehoe extends ItemHoe
{
    public ItemFirstOrehoe(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName("firstore_hoe");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CreativeTabs.tabTools);
    }
}
