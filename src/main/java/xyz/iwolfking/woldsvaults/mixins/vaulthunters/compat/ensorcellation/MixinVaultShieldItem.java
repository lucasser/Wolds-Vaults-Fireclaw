package xyz.iwolfking.woldsvaults.mixins.vaulthunters.compat.ensorcellation;

import cofh.ensorcellation.init.EnsorcEnchantments;
import iskallia.vault.gear.item.VaultGearItem;
import iskallia.vault.item.gear.VaultShieldItem;
import me.fallenbreath.conditionalmixin.api.annotation.Condition;
import me.fallenbreath.conditionalmixin.api.annotation.Restriction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.enchantment.Enchantment;
import org.spongepowered.asm.mixin.Mixin;
@Restriction(
        require = {
                @Condition(type = Condition.Type.MOD, value = "cofh_core"),
                @Condition(type = Condition.Type.MOD, value = "ensorcellation"),
        }
)
@Mixin(value = VaultShieldItem.class, remap = false)
public abstract class MixinVaultShieldItem   extends ShieldItem implements VaultGearItem {

    public MixinVaultShieldItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        if(enchantment.equals(EnsorcEnchantments.SOULBOUND.get())) {
            return true;
        }
        else {
            return super.canApplyAtEnchantingTable(stack, enchantment);
        }

    }
}
