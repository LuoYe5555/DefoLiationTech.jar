package me.lyen.defoliationtech.task.reg

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems
import me.lyen.defoliationtech.DefoLiationTech
import me.lyen.defoliationtech.obj.Groups
import me.lyen.defoliationtech.obj.Items
import me.lyen.defoliationtech.obj.machines.MaterialGen
import me.lyen.defoliationtech.obj.machines.MachinesRecipe
import me.lyen.defoliationtech.obj.machines.SimpleEnergyMachine
import org.bukkit.inventory.ItemStack


class Items{
    fun setup(inst: DefoLiationTech) {

        SlimefunItem(
            Groups.DLT_Materials,
            Items().DefoLiationTech,
            RecipeType.NULL, null
        ).register(inst)

        SlimefunItem(
            Groups.DLT_SPECIAL_MATERIALS,
            Items().YuanShi,
            RecipeType.NULL, null
        ).register(inst)

        SlimefunItem(
            Groups.DLT_SPECIAL_MATERIALS,
            Items().MoLa,
            RecipeType.NULL, null
        ).register(inst)

        SlimefunItem(
            Groups.DLT_SPECIAL_MATERIALS,
            Items().ChuangShiJieJing,
            RecipeType.NULL, null
        ).register(inst)

        SlimefunItem(
            Groups.DLT_Materials,
            Items().DefoLiationTech_Ingot,
            RecipeType.SMELTERY, arrayOf<ItemStack>(
                Items().DefoLiationTech,Items().DefoLiationTech,Items().DefoLiationTech,
                Items().DefoLiationTech, SlimefunItems.REINFORCED_ALLOY_INGOT, Items().DefoLiationTech,
                Items().DefoLiationTech,Items().DefoLiationTech,Items().DefoLiationTech,
            )
        ).register(inst)

        SlimefunItem(
            Groups.DLT_Materials,
            Items().Basic_Core,
            RecipeType.ANCIENT_ALTAR, arrayOf<ItemStack>(
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.ELECTRO_MAGNET, SlimefunItems.REINFORCED_ALLOY_INGOT,
                SlimefunItems.ELECTRO_MAGNET, SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.ELECTRO_MAGNET,
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.ELECTRO_MAGNET, SlimefunItems.REINFORCED_ALLOY_INGOT
            )
        ).register(inst)

        SlimefunItem(
            Groups.DLT_Materials,
            Items().DefoLiationTech_Core,
            RecipeType.ANCIENT_ALTAR, arrayOf<ItemStack>(
                Items().DefoLiationTech, Items().DefoLiationTech_Ingot, Items().DefoLiationTech,
                Items().DefoLiationTech_Ingot, Items().Basic_Core, Items().DefoLiationTech_Ingot,
                Items().DefoLiationTech, Items().DefoLiationTech_Ingot, Items().DefoLiationTech
            )
        ).register(inst)

        SlimefunItem(
            Groups.DLT_Materials,
            Items().Generator_Core,
            RecipeType.ANCIENT_ALTAR, arrayOf<ItemStack>(
                Items().DefoLiationTech, Items().DefoLiationTech_Ingot, Items().DefoLiationTech,
                Items().DefoLiationTech_Ingot, Items().DefoLiationTech_Core, Items().DefoLiationTech_Ingot,
                Items().DefoLiationTech, Items().DefoLiationTech_Ingot, Items().DefoLiationTech
            )
        ).register(inst)

        MaterialGen(
            Groups.DLT_Basic_Machine,
            Items().DefoLiationTechGen,
            RecipeType.NULL, null,
            1000,
            300,
            Items().DefoLiationTech,
            30
        ).register(inst)

        MaterialGen(
            Groups.DLT_Basic_Machine,
            Items().DefoLiationTechG,
            RecipeType.NULL, null,
            100,
            30,
            Items().DefoLiationTech_Core,
            30
        ).register(inst)

        val DustEnergyMachineRecipe:HashMap<ItemStack, MachinesRecipe> = HashMap()
        DustEnergyMachineRecipe.put(Items().DefoLiationTech, MachinesRecipe(100,10))

        SimpleEnergyMachine(
            Groups.DLT_Basic_Machine,
            Items().DustEnergyMachine,
            RecipeType.NULL,null,
            1000,
            DustEnergyMachineRecipe
        ).register(inst)
    }

}