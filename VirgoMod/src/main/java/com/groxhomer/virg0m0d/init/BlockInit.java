package com.groxhomer.virg0m0d.init;

import java.util.function.Function;

import com.google.common.base.Supplier;
import com.groxhomer.virg0m0d.virg0m0d;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, 
			virg0m0d.MOD_ID);
	public static final DeferredRegister<Item> ITEMS = ItemInit.ITEMS;
	
	//public static final RegistryObject<Block> BLOQUE_VIKINGUR = register("bloque_vikingur", 
	//		() -> new Block(BlockBehaviour.Properties.of( , MaterialColor.COLOR_RED)), 
	///		object -> ()  -> new Item (new Item.Properties().tab(virg0m0d.MATE_TAB)));
	
	public static final RegistryObject<Block> VIKINGUR_BLOQUE = register("bloque_vikingur", 
			() -> new Block( BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).strength(3.0f).
					sound(SoundType.METAL).requiresCorrectToolForDrops()) , 
			object -> () -> new BlockItem(object.get(),  new Item.Properties().tab(virg0m0d.MATE_TAB))));
	
	private static <T extends Block> RegistryObject<T> registerBlock (final String name, 
			final Supplier<? extends T>  block){
		return BLOCKS.register(name, block);
	}
	
	private static <T extends Block> RegistryObject<T> register(final String name,  final Supplier<? extends T>  block,  
			Function<RegistryObject<T>, Supplier<? extends Item>> item){
		RegistryObject<T> obj = registerBlock(name, block);
		ITEMS.register(name, item.apply(obj));
		return obj;
	}
}


	