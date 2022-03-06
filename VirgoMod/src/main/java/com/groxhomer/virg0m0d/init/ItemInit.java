package com.groxhomer.virg0m0d.init;

import com.google.common.base.Supplier;
import com.groxhomer.virg0m0d.virg0m0d;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, virg0m0d.MOD_ID);
	
	public static final RegistryObject <Item> MATE = register ("mate" , 
				() -> new Item (new Item.Properties().tab(virg0m0d.MATE_TAB )));
	
	private static <T extends Item> RegistryObject<T> register (final String name, final Supplier<T>  Item){
		return ITEMS.register(name, Item);
	}
}
