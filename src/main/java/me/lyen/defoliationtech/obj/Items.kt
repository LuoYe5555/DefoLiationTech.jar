package me.lyen.defoliationtech.obj

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack
import me.lyen.defoliationtech.obj.basic_machine.ElectricLore
import org.bukkit.Material

class Items {

    val DefoLiationTech = SlimefunItemStack("DEFOLIATIONTECH_DEFOLIATIONTECH",
        Material.GUNPOWDER, "§8落叶", "§f星际间飘散的渺小尘埃")

    val DefoLiationTech_Ingot = SlimefunItemStack("DEFOLIATIONTECH_DEFOLIATIONTECH_INGOT",
        Material.BRICK, "§b落叶§7锭", "§f渺小尘埃聚集成的锭")

    val Basic_Core = SlimefunItemStack("DEFOLIATIONTECH_BASIC_CORE",
        Material.FIREWORK_STAR, "§8基础§7核心", "§f合成的重要之物")

    val DefoLiationTech_Core = SlimefunItemStack("DEFOLIATIONTECH_DEFOLIATIONTECH_CORE",
        Material.FIREWORK_STAR, "§b落叶§7核心", "§fem..就加了点东西")

    val Generator_Core = SlimefunItemStack("DEFOLIATIONTECH_GENERATOR_CORE",
        Material.FIREWORK_STAR, "§8机器§7核心", "§f用于合成机器")

    val YuanShi = SlimefunItemStack("DEFOLIATIONTECH_YUANSHI",
        Material.NETHER_STAR, "§6原石", "§e☆☆☆☆☆","§6超出世界的原初晶石","§6黑暗的宇宙中","§6由无助的梦想与希望凝结而成的辉光","§6由游戏内活动、探索、成就、任务、充值等获取")

    val MoLa = SlimefunItemStack("DEFOLIATIONTECH_MOLA",
        Material.MAGMA_CREAM, "§3摩拉", "§b☆☆☆","§3提瓦特通用的共同语言","§3谁人都能理解的贵金属")

    val ChuangShiJieJing = SlimefunItemStack("DEFOLIATIONTECH_CHUANGSHIJIEJING",
        Material.AMETHYST_SHARD, "§6创世结晶", "§e☆☆☆☆☆","§6开辟宇宙的能量结晶","§6虚无的真空中","§6由足以点亮新星的潜力和希望结晶而成")

    val DefoLiationTechGen = SlimefunItemStack("DEFOLIATIONTECH_DEFOLIATIONTECH_GEN",
        Material.CAULDRON, "§s落叶§7生成器", ElectricLore().capacityLore(1000),ElectricLore().energyConsumptionLore(300))

    val DefoLiationTechG = SlimefunItemStack("DEFOLIATIONTECH_DEFOLIATIONTECH_G",
        Material.CAULDRON, "§s落叶核心§7生成器", ElectricLore().capacityLore(100),ElectricLore().energyConsumptionLore(30))

    val DustEnergyMachine = SlimefunItemStack("DEFOLIATIONTECH_DUST_ENERGY_MACHINE",
        Material.SMOOTH_SANDSTONE, "§s落叶§7粉尘发电机", ElectricLore().capacityLore(1000))
}