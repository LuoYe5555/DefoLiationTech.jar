package me.lyen.defoliationtech.task.reg


import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack
import me.lyen.defoliationtech.DefoLiationTech
import me.lyen.defoliationtech.obj.Groups
import org.bukkit.Material
import org.bukkit.NamespacedKey

class Groups {
    fun setup(inst: DefoLiationTech) {

        // 物品组设置

        //父分类
        Groups.Group_Main = NestedItemGroup(
            NamespacedKey(inst, "defoliationtech_main"),
            CustomItemStack(Material.TARGET, "&7&kii&b落&e叶&c科&3技&7&kii"), 3
        )
        //子分类
            Groups.DLT_Notice = SubItemGroup(
            NamespacedKey(inst, "defoliationtech_notice"),
            Groups.Group_Main, CustomItemStack(Material.PAPER, "&7合成")
            )

            Groups.DLT_SPECIAL_MATERIALS = SubItemGroup(
            NamespacedKey(inst, "defoliationtech_special_materials"),
            Groups.Group_Main, CustomItemStack(Material.MAGMA_CREAM, "&7特殊材料")
            )

            Groups.DLT_Materials = SubItemGroup(
            NamespacedKey(inst, "defoliationtech_materials"),
            Groups.Group_Main, CustomItemStack(Material.NETHER_STAR, "&7材料")
            )

            Groups.DLT_Basic_Machine = SubItemGroup(
            NamespacedKey(inst, "defoliationtech_basic_machine"),
            Groups.Group_Main, CustomItemStack(Material.GILDED_BLACKSTONE, "&7基础机器")
            )

        // 物品组注册
        Groups.Group_Main.register(inst)
        Groups.DLT_Notice.register(inst)
        Groups.DLT_SPECIAL_MATERIALS.register(inst)
        Groups.DLT_Materials.register(inst)
        Groups.DLT_Basic_Machine.register(inst)
    }
}