package me.nik.luckypouches.api;

public class LuckyPouchesAPIProvider {

    private static LuckyPouchesAPI API = null;

    public LuckyPouchesAPIProvider() {
    }

    public static LuckyPouchesAPI getAPI() {
        return API;
    }

    /**
     * Internal use by LuckyPouches only!
     *
     * @param api LuckyPouchesAPI
     */
    @Deprecated
    public static void register(LuckyPouchesAPI api) {
        API = api;
    }
}