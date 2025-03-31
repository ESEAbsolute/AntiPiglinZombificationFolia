package com.eseabsolute.apzfolia.listeners;

import com.eseabsolute.apzfolia.AntiPiglinZombification;
import io.papermc.paper.event.player.PlayerNameEntityEvent;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.PiglinAbstract;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTransformEvent;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PiglinListener implements Listener {
    Logger logger;

    public PiglinListener() {
        this.logger = AntiPiglinZombification.logger;
    }

    @EventHandler
    public void onPlayerNameEntity(PlayerNameEntityEvent event) {
        if (event.getEntity().getType() == EntityType.PIGLIN) {
            PiglinAbstract piglin = (PiglinAbstract) event.getEntity();
            piglin.setImmuneToZombification(true);
            logger.log(Level.INFO, "[APZFolia] Piglin with uuid " + piglin.getUniqueId() + "was named! Zombification disabled.");
        }
    }
    @EventHandler
    public void onEntityTransform(EntityTransformEvent event) {
        if (event.getEntity().getType() == EntityType.PIGLIN) {
            PiglinAbstract piglin = (PiglinAbstract) event.getEntity();
            piglin.setImmuneToZombification(true);
            logger.log(Level.INFO, "[APZFolia] Piglin with uuid " + piglin.getUniqueId() + "was named! Zombification disabled.");
            event.setCancelled(true);
        }
    }
}
