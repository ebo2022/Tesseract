package dev.tesseract.biomes.impl;

import dev.tesseract.biomes.*;
import net.minecraft.world.level.biome.Biome;

public class MutableBiomeProperties extends ImmutableBiomeProperties implements BiomeProperties.Mutable {

    public MutableBiomeProperties(Biome biome, ClimateSettings.Mutable climateSettings, SpecialEffectSettings.Mutable specialEffectSettings, GenerationSettings.Mutable generationSettings, SpawnSettings.Mutable spawnSettings) {
        super(biome, climateSettings, specialEffectSettings, generationSettings, spawnSettings);
    }

    public MutableBiomeProperties(Biome biome) {
        super(biome);
    }

    @Override
    public ClimateSettings.Mutable getClimateSettings() {
        return (ClimateSettings.Mutable) super.getClimateSettings();
    }

    @Override
    public SpecialEffectSettings.Mutable getSpecialEffectSettings() {
        return (SpecialEffectSettings.Mutable) super.getSpecialEffectSettings();
    }

    @Override
    public GenerationSettings.Mutable getGenerationSettings() {
        return (GenerationSettings.Mutable) super.getGenerationSettings();
    }

    @Override
    public SpawnSettings.Mutable getSpawnSettings() {
        return (SpawnSettings.Mutable) super.getSpawnSettings();
    }
}
