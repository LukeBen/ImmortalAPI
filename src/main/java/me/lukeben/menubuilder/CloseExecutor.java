package me.lukeben.menubuilder;

import org.bukkit.event.inventory.InventoryCloseEvent;

@FunctionalInterface
public interface CloseExecutor {

    void execute(InventoryCloseEvent event);

}
