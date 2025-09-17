package com.example.examplemod.item;

import com.example.examplemod.ExampleMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ExampleMod.MODID);

    public static final RegistryObject<Item> A   = ITEMS.register("a",   () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KI  = ITEMS.register("ki",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SU  = ITEMS.register("su",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SE  = ITEMS.register("se",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SO  = ITEMS.register("so",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GI  = ITEMS.register("gi",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KYA = ITEMS.register("kya", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHI = ITEMS.register("shi", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GA  = ITEMS.register("ga",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> U   = ITEMS.register("u",   () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ME  = ITEMS.register("me",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NA  = ITEMS.register("na",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SA  = ITEMS.register("sa",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TA  = ITEMS.register("ta",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RE  = ITEMS.register("re",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BYU = ITEMS.register("byu", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> O   = ITEMS.register("o",   () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HA  = ITEMS.register("ha",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PO  = ITEMS.register("po",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DA  = ITEMS.register("da",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PA  = ITEMS.register("pa",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JI  = ITEMS.register("ji",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KYU = ITEMS.register("kyu", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KYO = ITEMS.register("kyo", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RYU = ITEMS.register("ryu", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RA  = ITEMS.register("ra",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BE  = ITEMS.register("be",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HO  = ITEMS.register("ho",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TO  = ITEMS.register("to",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHU = ITEMS.register("chu", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PU  = ITEMS.register("pu",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HI  = ITEMS.register("hi",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DU  = ITEMS.register("du",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TE  = ITEMS.register("te",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> I   = ITEMS.register("i",   () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YO  = ITEMS.register("yo",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KA  = ITEMS.register("ka",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KU  = ITEMS.register("ku",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HE  = ITEMS.register("he",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHA = ITEMS.register("sha", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHO = ITEMS.register("sho", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RI  = ITEMS.register("ri",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NYA = ITEMS.register("nya", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PE  = ITEMS.register("pe",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GYO = ITEMS.register("gyo", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> E   = ITEMS.register("e",   () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KE  = ITEMS.register("ke",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KO  = ITEMS.register("ko",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TSU = ITEMS.register("tsu", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NE  = ITEMS.register("ne",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MA  = ITEMS.register("ma",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YU  = ITEMS.register("yu",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YA  = ITEMS.register("ya",  () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> N   = ITEMS.register("n",   () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}