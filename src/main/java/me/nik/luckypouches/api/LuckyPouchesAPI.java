package me.nik.luckypouches.api;

import me.nik.luckypouches.api.custom.AnimationType;
import me.nik.luckypouches.api.custom.CurrencyType;
import me.nik.luckypouches.api.custom.Pouch;
import org.bukkit.entity.Player;

public interface LuckyPouchesAPI {

    void registerAnimation(AnimationType... animation);

    void registerCurrency(CurrencyType... currency);

    long giveReward(Player player, Pouch pouch);
}