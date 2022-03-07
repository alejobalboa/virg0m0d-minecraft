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
				() -> new Item (new Item.Properties().tab(virg0m0d.MATE_TAB )
						.food(new FoodProperties.Builder().nutrition(7).saturationMod(8f).effect(() 
						        .effect(() -> new MobEffectInstance,(MobEffects.MOVEMENT_SPEED, 700, 3), 0.7f))
					        .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 21600, 5)
							.build())))
	
	private static <T extends Item> RegistryObject<T> register (final String name, final Supplier<T>  
		return ITEMS.register(name, Item);
	}
}
