package dev.tesseract.biomes.impl;

import dev.tesseract.biomes.*;
import net.minecraft.world.level.biome.Biome;

public class ImmutableBiomeProperties implements BiomeProperties {
    protected final Biome biome;
    protected final ClimateSettings climateSettings;
    protected final SpecialEffectSettings specialEffectSettings;
    protected final GenerationSettings generationSettings;
    protected final SpawnSettings spawnSettings;

    public ImmutableBiomeProperties(Biome biome) {
        this(biome, new ImmutableClimateSettings(biome), new ImmutableSpecialEffectSettings(biome), new ImmutableGenerationSettings(biome), new ImmutableSpawnSettings(biome));
    }

    public ImmutableBiomeProperties(Biome biome, ClimateSettings climateSettings, SpecialEffectSettings specialEffectSettings, GenerationSettings generationSettings, SpawnSettings spawnSettings) {
        this.biome = biome;
        this.climateSettings = climateSettings;
        this.specialEffectSettings = specialEffectSettings;
        this.generationSettings = generationSettings;
        this.spawnSettings = spawnSettings;
    }

    @Override
    public ClimateSettings getClimateSettings() {
        return this.climateSettings;
    }

    @Override
    public SpecialEffectSettings getSpecialEffectSettings() {
        return this.specialEffectSettings;
    }

    @Override
    public GenerationSettings getGenerationSettings() {
        return this.generationSettings;
    }

    @Override
    public SpawnSettings getSpawnSettings() {
        return this.spawnSettings;
    }
}
