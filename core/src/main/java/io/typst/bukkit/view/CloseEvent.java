package io.typst.bukkit.view;

import lombok.Data;
import lombok.With;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryCloseEvent;

@Data
@With
public class CloseEvent {
    private final Player player;
    private final ChestView view;
    private final InventoryCloseEvent.Reason reason;
}
