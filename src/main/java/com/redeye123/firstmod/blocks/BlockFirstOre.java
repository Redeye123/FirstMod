package com.redeye123.firstmod.blocks;

import com.redeye123.firstmod.FirstMod;
import com.redeye123.firstmod.help.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by RedeyeNatsu on 7/24/2014.
 */
public class BlockFirstOre extends Block
{
    public BlockFirstOre()
    {
        //Ervoor zorgen dat je met een pickaxe het snel kan breken .
        super(Material.rock);
        //Naam van de Block Moet hetzelfde zijn als de texture
        setBlockName("FirstOre");
        setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        //In welke Creative Tab
        setCreativeTab(CreativeTabs.tabBlock);
        //Hoe lang duurt het om deze block te minen
        setHardness(15.0f);
        //Wat voor explosie kan deze block aan
        setResistance(1000.0f);
        //Welke sound als je er overheen loopt
        setStepSound(soundTypePiston);
        //Geeft het licht af ?
        setLightLevel(0.5f);
        //Met welke Pickaxe kanje hem harvesten
        setHarvestLevel("pickaxe",3);
    }

    @Override
    public Item getItemDropped(int metadata, Random rand, int fortune)
    {
        return FirstMod.FirstOreGem;
    }




}
