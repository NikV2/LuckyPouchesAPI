package me.nik.luckypouches.api;

import me.nik.luckypouches.api.custom.AnimationType;
import me.nik.luckypouches.api.custom.CurrencyType;
import me.nik.luckypouches.api.custom.Pouch;
import org.bukkit.entity.Player;

public interface LuckyPouchesAPI {

    /**
     * Register an animation
     * 
     * @param animation The animation
     */
    void registerAnimation(AnimationType... animation);

    /**
     * Register a currency
     * 
     * @param currency The currency
     */
    void registerCurrency(CurrencyType... currency);

    /**
     * Give the reward to a player
     * This is designed to be used once inside animations
     * 
     * @param player The player
     * @param pouch The pouch
     * @return The rewarded amount
     */
    long giveReward(Player player, Pouch pouch);
}
