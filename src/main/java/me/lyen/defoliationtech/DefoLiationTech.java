package me.lyen.defoliationtech;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import me.lyen.defoliationtech.task.reg.Groups;
import me.lyen.defoliationtech.task.reg.Items;
import org.bukkit.plugin.java.JavaPlugin;

public class DefoLiationTech extends JavaPlugin implements SlimefunAddon {

    @Override
    public void onEnable() {
        //注册
        new Groups().setup(this);
        new Items().setup(this);
    }

    @Override
    public void onDisable() {
        // 禁用插件的逻辑...
    }

    @Override
    public String getBugTrackerURL() {
        // 你可以在这里返回你的问题追踪器的网址，而不是 null
        return null;
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        /*
         * 你需要返回对你插件的引用。
         * 如果这是你插件的主类，只需要返回 "this" 即可。
         */
        return this;
    }

}
