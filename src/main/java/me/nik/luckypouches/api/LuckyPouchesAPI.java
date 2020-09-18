package me.nik.luckypouches.api;

import org.bukkit.entity.Player;

public interface LuckyPouchesAPI {

    /**
     * Register an animation
     *
     * @param animation AnimationType
     */
    void registerAnimation(AnimationType animation);

    /**
     * Register a currency
     *
     * @param currency CurrencyType
     */
    void registerCurrency(CurrencyType currency);

    /**
     * Give a reward to a player
     *
     * @param player The player give the reward to
     * @param pouch  The pouch to get the reward from
     * @return The reward amount
     */
    long giveReward(Player player, Pouch pouch);
}