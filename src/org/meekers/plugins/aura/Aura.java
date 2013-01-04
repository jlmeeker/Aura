package org.meekers.plugins.aura;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author jaredm
 */
public class Aura extends JavaPlugin {

    public void onEnable() {
        this.saveDefaultConfig();
        Bukkit.getPluginManager().registerEvents(new AuraPluginListener(this), this);
    }
    
}
