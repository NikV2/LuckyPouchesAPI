package me.nik.luckypouches.api;

public class LuckyPouchesAPIProvider {
    private static LuckyPouchesAPI luckyPouchesAPI = null;

    public LuckyPouchesAPIProvider() {
    }

    /**
     * Get the instance of LuckyPouchesAPI
     *
     * @return LuckyPouchesAPI
     */
    public static LuckyPouchesAPI getAPI() {
        return luckyPouchesAPI;
    }

    /**
     * Internal use by LuckyPouches Only!
     *
     * @param api LuckyPouchesAPI
     */
    @Deprecated
    public static void register(LuckyPouchesAPI api) {
        luckyPouchesAPI = api;
    }
}