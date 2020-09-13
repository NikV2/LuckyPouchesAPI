package me.nik.luckypouches.api;

import org.bukkit.entity.Player;

public interface LuckyPouchesAPI {

    void registerAnimation(AnimationType animation);

    void registerCurrency(CurrencyType currency);

    long giveReward(Player player, Pouch pouch);
}