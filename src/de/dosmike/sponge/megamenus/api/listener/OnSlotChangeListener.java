package de.dosmike.sponge.megamenus.api.listener;

import de.dosmike.sponge.megamenus.api.elements.MSlot;
import de.dosmike.sponge.megamenus.api.elements.concepts.IElement;
import de.dosmike.sponge.megamenus.impl.util.SlotChange;
import org.spongepowered.api.entity.living.player.Player;

@FunctionalInterface
public interface OnSlotChangeListener {

    /**
     * Event specifically for tracking changes in {@link MSlot} elements.<br>
     * @param change a wrapper for the SlotTransaction that triggered this event
     * @param element the element that was interacted with
     * @param viewer the player that took or put items from/into this element
     */
    void onSlotChange(SlotChange change, IElement element, Player viewer);

}
