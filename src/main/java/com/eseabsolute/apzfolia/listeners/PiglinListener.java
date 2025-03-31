package com.eseabsolute.apzfolia.listeners;

import io.papermc.paper.event.player.PlayerNameEntityEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.PiglinAbstract;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.logging.Level;

public class PiglinListener implements Listener {
    @EventHandler
    public void onPlayerNameEntity(PlayerNameEntityEvent event) {
        if (event.getEntity().getType() == EntityType.PIGLIN) {
            PiglinAbstract piglin = (PiglinAbstract) event.getEntity();
            piglin.setImmuneToZombification(true);
            Bukkit.getLogger().log(Level.INFO, "[APZFolia] Piglin with uuid " + piglin.getUniqueId() + "was named! Zombification disabled.");
        }
    }
}
