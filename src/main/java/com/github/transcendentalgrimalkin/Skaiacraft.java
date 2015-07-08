package com.github.transcendentalgrimalkin;

import net.minecraftforge.fml.common.Mod;

import com.github.transcendentalgrimalkin.help.Reference;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Skaiacraft {


@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
{
	
}
@Mod.EventHandler
public void init(FMLInitializationEvent event)
{
	
}
@Mod.EventHandler
public void postInit(FMLPostInitializationEvent event){}}

@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
public static CommonProxy proxy

@Instance(Reference.MODID)
public static Skaiacraft instance;

