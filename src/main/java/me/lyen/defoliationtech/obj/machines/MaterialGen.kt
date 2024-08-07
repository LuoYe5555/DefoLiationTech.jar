package me.lyen.defoliationtech.obj.machines

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils
import me.lyen.defoliationtech.obj.basic_machine.ElectricMachine
import me.lyen.defoliationtech.obj.basic_machine.Process
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class MaterialGen(
    itemGroup: ItemGroup,
    item: SlimefunItemStack,
    recipeType: RecipeType,
    recipe: Array<out ItemStack>?,
    private val electricCapacity: Int,
    private val energyConsumption: Int,
    private val material: SlimefunItemStack,
    private val MaxProcess: Int
): ElectricMachine(itemGroup, item, recipeType, recipe,electricCapacity),Process {

    override fun findNextRecipe(inv: BlockMenu): Boolean {
        return if ((inv.getItemInSlot(13)?.amount?:0) != 64) {
            if (IsProcess(inv, MaxProcess, 4))
                inv.pushItem(material.clone(), 13)
            true
        }else{
            false
        }
    }

    override fun constructMenu(preset: BlockMenuPreset) {
        val empty = arrayOf(0,1,2,3,5,6,7,8,9,10,11,15,16,17)
        for(num in empty){
            preset.addItem(num, ChestMenuUtils.getBackground(),
                ChestMenuUtils.getEmptyClickHandler())
        }
        val out = arrayOf(12,14)
        for(num in out){
            preset.addItem(num, ChestMenuUtils.getOutputSlotTexture(),
                ChestMenuUtils.getEmptyClickHandler())
        }
        preset.addItem(4, CustomItemStack(Material.RED_STAINED_GLASS_PANE, "&a进度", "&fmd 电呢?"),
            ChestMenuUtils.getEmptyClickHandler())
    }

    override fun getInputSlots(): IntArray {
        return IntArray(0)
    }

    override fun getOutputSlots(): IntArray {
        return intArrayOf(13)
    }

    override fun getCapacity(): Int {
        return electricCapacity
    }

    override fun getEnergyConsumption(): Int {
        return energyConsumption
    }

}