package com.therandomlabs.randomtweaks.client;

import java.lang.reflect.Field;
import org.lwjgl.input.Keyboard;
import com.therandomlabs.randomtweaks.common.CommonProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.audio.SoundManager;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;

public final class ClientProxy extends CommonProxy {
	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		final SoundSystemReloadHandler soundSystemReloadHandler = new SoundSystemReloadHandler();
		soundSystemReloadHandler.registerKeyBinding();
		MinecraftForge.EVENT_BUS.register(soundSystemReloadHandler);
	}
}
