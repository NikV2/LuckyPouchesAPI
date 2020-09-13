package me.nik.luckypouches.api;

public class LuckyPouchesAPIProvider {
    private static LuckyPouchesAPI luckyPouchesAPI = null;

    public LuckyPouchesAPIProvider() {
    }

    public static LuckyPouchesAPI getAPI() {
        return luckyPouchesAPI;
    }

    public static void register(LuckyPouchesAPI api) {
        luckyPouchesAPI = api;
    }
}