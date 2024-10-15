package xyz.iwolfking.woldsvaults.init;


import net.minecraftforge.event.RegistryEvent;
import xyz.iwolfking.vhapi.api.registry.gear.CustomVaultGearRegistryEntry;
import xyz.iwolfking.woldsvaults.config.fake.CustomVaultGearModelRollRaritiesConfig;
import xyz.iwolfking.woldsvaults.config.forge.WoldsVaultsConfig;
import xyz.iwolfking.woldsvaults.models.Battlestaffs;
import xyz.iwolfking.woldsvaults.models.LootSacks;
import xyz.iwolfking.woldsvaults.models.Plushies;
import xyz.iwolfking.woldsvaults.models.Tridents;

public class ModCustomVaultGearEntries {

    public static final CustomVaultGearRegistryEntry BATTLESTAFF = new CustomVaultGearRegistryEntry("battlestaff", "Battlestaff", ModItems.BATTLESTAFF, Battlestaffs.REGISTRY, CustomVaultGearModelRollRaritiesConfig.BATTLESTAFF_MODEL_ROLLS);
    public static final CustomVaultGearRegistryEntry TRIDENT = new CustomVaultGearRegistryEntry("trident", "Trident", ModItems.TRIDENT, Tridents.REGISTRY, CustomVaultGearModelRollRaritiesConfig.TRIDENT_MODEL_ROLLS);
    public static final CustomVaultGearRegistryEntry PLUSHIE = new CustomVaultGearRegistryEntry("plushie", "Plushie", ModItems.PLUSHIE, Plushies.REGISTRY, CustomVaultGearModelRollRaritiesConfig.PLUSHIE_MODEL_ROLLS);
    public static final CustomVaultGearRegistryEntry LOOT_SACK = new CustomVaultGearRegistryEntry("loot_sack", "Loot Sack", ModItems.LOOT_SACK, LootSacks.REGISTRY, CustomVaultGearModelRollRaritiesConfig.LOOT_SACKS_MODEL_ROLLS);
    public static void registerGearEntries(RegistryEvent.Register<CustomVaultGearRegistryEntry> event) {
        if(WoldsVaultsConfig.COMMON.enableVaultTrident.get()) {
            event.getRegistry().register(TRIDENT);
        }

        if(WoldsVaultsConfig.COMMON.enableVaultBattlestaff.get()) {
            event.getRegistry().register(BATTLESTAFF);
        }

        if(WoldsVaultsConfig.COMMON.enableVaultLootSack.get()) {
            event.getRegistry().register(LOOT_SACK);
        }

        if(WoldsVaultsConfig.COMMON.enableVaultPlushie.get()) {
            event.getRegistry().register(PLUSHIE);
        }

    }
}
