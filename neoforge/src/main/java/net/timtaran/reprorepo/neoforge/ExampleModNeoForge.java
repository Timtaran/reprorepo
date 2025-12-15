package net.timtaran.reprorepo.neoforge;

import net.neoforged.fml.common.Mod;

import net.timtaran.reprorepo.ExampleMod;

@Mod(ExampleMod.MOD_ID)
public final class ExampleModNeoForge {
    public ExampleModNeoForge() {
        // Run our common setup.
        ExampleMod.init();
    }
}
