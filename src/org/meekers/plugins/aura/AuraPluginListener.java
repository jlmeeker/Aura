/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.meekers.plugins.aura;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetEvent;

/**
 *
 * @author jaredm
 */
class AuraPluginListener implements Listener {

    Aura plugin;

    public AuraPluginListener(Aura plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onEntityHit(EntityTargetEvent event) {
        if (event.getTarget().getType() == EntityType.PLAYER) {
            Player p = (Player) event.getTarget();
            if (p.getLevel() >= plugin.getConfig().getInt("minxp")) {
                event.setCancelled(true);
            }
        }
    }
}
