package com.thedoctorsoda.sodacantorches.configuration;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
	public static boolean overrideVanillaTextures = false;
	public static boolean enableTorches = true;
	public static boolean enableLadders = true;
	public static boolean enableLanterns = true;
	public static boolean enableFences = true;

	public static boolean enableStoneTorch = true;
	public static boolean enableObsidianTorch = true;
	public static boolean enableNetherrackTorch = true;
	public static boolean enableQuartzTorch = true;
	public static boolean enableBedrockTorch = true;
	public static boolean enableBlazeTorch = true;
	public static boolean enableBoneTorch = true;

	public static boolean enableStoneLadder = true;
	public static boolean enableObsidianLadder = true;
	public static boolean enableNetherrackLadder = true;
	public static boolean enableQuartzLadder = true;
	public static boolean enableBedrockLadder = true;
	public static boolean enableBlazeLadder = true;

	public static boolean enableWoodLantern = true;
	public static boolean enableStoneLantern = true;
	public static boolean enableObsidianLantern = true;
	public static boolean enableNetherrackLantern = true;
	public static boolean enableQuartzLantern = true;
	public static boolean enableBlazeLantern = true;
	public static boolean enableBedrockLantern = true;

	public static boolean enableWoodFence = true;
	public static boolean enableStoneFence = true;
	public static boolean enableObsidianFence = true;
	public static boolean enableNetherrackFence = true;
	public static boolean enableQuartzFence = true;
	public static boolean enableBlazeFence = true;
	public static boolean enableBedrockFence = true;

	public static boolean enableNetherBrickFenceGate = true;
	public static boolean enableNetherBrickFenceRecipeOverride = true;

	public static boolean enableUnusedSticks = false;

	public static void init(File configFile) {
		Configuration configuration = new Configuration(configFile);

		try {
			configuration.load();

			// Vanilla Textures Override
			overrideVanillaTextures = configuration.get(Configuration.CATEGORY_GENERAL, "overrideVanillaTextures", false, "Enable Vanilla Override Textures").getBoolean();

			// Torches
			enableTorches = configuration.get(Configuration.CATEGORY_GENERAL, "enableTorches", true, "Enable Torches").getBoolean();

			enableStoneTorch = configuration.get(Configuration.CATEGORY_GENERAL, "enableStoneTorch", true, "Enable Stone Torch").getBoolean();
			enableObsidianTorch = configuration.get(Configuration.CATEGORY_GENERAL, "enableObsidianTorch", true, "Enable Obsidian Torch").getBoolean();
			enableNetherrackTorch = configuration.get(Configuration.CATEGORY_GENERAL, "enableNetherrackTorch", true, "Enable Netherrack Torch").getBoolean();
			enableQuartzTorch = configuration.get(Configuration.CATEGORY_GENERAL, "enableQuartzTorch", true, "Enable Quartz Torch").getBoolean();
			enableBedrockTorch = configuration.get(Configuration.CATEGORY_GENERAL, "enableBedrockTorch", true, "Enable Bedrock Torch").getBoolean();
			enableBlazeTorch = configuration.get(Configuration.CATEGORY_GENERAL, "enableBlazeTorch", true, "Enable Blaze Torch").getBoolean();
			enableBoneTorch = configuration.get(Configuration.CATEGORY_GENERAL, "enableBoneTorch", false, "Enable Bone Torch").getBoolean();

			// Ladders
			enableLadders = configuration.get(Configuration.CATEGORY_GENERAL, "enableLadders", true, "Enable Ladders").getBoolean();

			enableStoneLadder = configuration.get(Configuration.CATEGORY_GENERAL, "enableStoneLadder", true, "Enable Stone Ladder").getBoolean();
			enableObsidianLadder = configuration.get(Configuration.CATEGORY_GENERAL, "enableObsidianLadder", true, "Enable Obsidian Ladder").getBoolean();
			enableNetherrackLadder = configuration.get(Configuration.CATEGORY_GENERAL, "enableNetherrackLadder", true, "Enable Netherrack Ladder").getBoolean();
			enableQuartzLadder = configuration.get(Configuration.CATEGORY_GENERAL, "enableQuartzLadder", true, "Enable Quartz Ladder").getBoolean();
			enableBedrockLadder = configuration.get(Configuration.CATEGORY_GENERAL, "enableBedrockLadder", true, "Enable Bedrock Ladder").getBoolean();
			enableBlazeLadder = configuration.get(Configuration.CATEGORY_GENERAL, "enableBlazeLadder", true, "Enable Blaze Ladder").getBoolean();

			// Lanterns
			enableLanterns = configuration.get(Configuration.CATEGORY_GENERAL, "enableLanterns", true, "Enable Lanterns").getBoolean();

			enableStoneLantern = configuration.get(Configuration.CATEGORY_GENERAL, "enableStoneLantern", true, "Enable Stone Lantern").getBoolean();
			enableObsidianLantern = configuration.get(Configuration.CATEGORY_GENERAL, "enableObsidianLantern", true, "Enable Obsidian Lantern").getBoolean();
			enableNetherrackLantern = configuration.get(Configuration.CATEGORY_GENERAL, "enableNetherrackLantern", true, "Enable Netherrack Lantern").getBoolean();
			enableQuartzLantern = configuration.get(Configuration.CATEGORY_GENERAL, "enableQuartzLantern", true, "Enable Quartz Lantern").getBoolean();
			enableBedrockLantern = configuration.get(Configuration.CATEGORY_GENERAL, "enableBedrockLantern", true, "Enable Bedrock Lantern").getBoolean();
			enableBlazeLantern = configuration.get(Configuration.CATEGORY_GENERAL, "enableBlazeLantern", true, "Enable Blaze Lantern").getBoolean();

			// Fences
			enableFences = configuration.get(Configuration.CATEGORY_GENERAL, "enableFences", true, "Enable Fences/Fence Gates").getBoolean();

			enableStoneFence = configuration.get(Configuration.CATEGORY_GENERAL, "enableStoneFence", true, "Enable Stone Fence/Gate").getBoolean();
			enableObsidianFence = configuration.get(Configuration.CATEGORY_GENERAL, "enableObsidianFence", true, "Enable Obsidian Fence/Gate").getBoolean();
			enableNetherrackFence = configuration.get(Configuration.CATEGORY_GENERAL, "enableNetherrackFence", true, "Enable Netherrack Fence/Gate").getBoolean();
			enableQuartzFence = configuration.get(Configuration.CATEGORY_GENERAL, "enableQuartzFence", true, "Enable Quartz Fence/Gate").getBoolean();
			enableBedrockFence = configuration.get(Configuration.CATEGORY_GENERAL, "enableBedrockFence", true, "Enable Bedrock Fence/Gate").getBoolean();
			enableBlazeFence = configuration.get(Configuration.CATEGORY_GENERAL, "enableBlazeFence", true, "Enable Blaze Fence/Gate").getBoolean();

			enableNetherBrickFenceGate = configuration.get(Configuration.CATEGORY_GENERAL, "enableNetherBrickFenceGate", true, "Enable Nether Brick Fence Gate").getBoolean();
			enableNetherBrickFenceRecipeOverride = configuration.get(Configuration.CATEGORY_GENERAL, "enableNetherBrickFenceRecipeOverride", true, "Enable Nether Brick Fence Recipe Override").getBoolean();

			// Unused Sticks
			enableUnusedSticks = configuration.get(Configuration.CATEGORY_GENERAL, "enableUnusedSticks", false, "Enable Unused Sticks").getBoolean();
		} catch (Exception e) {

		} finally {
			configuration.save();
		}
	}
}