package X;

import java.util.HashMap;

/* renamed from: X.DwF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35483DwF {
    public static final java.util.Map<Integer, String> LIZ;
    public static final java.util.Map<Integer, String> LIZIZ;

    static {
        HashMap hashMap = new HashMap();
        LIZ = hashMap;
        HashMap hashMap2 = new HashMap();
        LIZIZ = hashMap2;
        Integer LIZIZ2 = DIX.LIZIZ(hashMap, -1, "The requesting app is unavailable (e.g. unpublished, nonexistent version code).", -2, "The requested pack is not available.");
        Integer LIZIZ3 = DIX.LIZIZ(hashMap, -3, "The request is invalid.", -4, "The requested download is not found.");
        Integer LIZIZ4 = DIX.LIZIZ(hashMap, -5, "The Asset Delivery API is not available.", -6, "Network error. Unable to obtain the asset pack details.");
        Integer LIZIZ5 = DIX.LIZIZ(hashMap, -7, "Download not permitted under current device circumstances (e.g. in background).", -10, "Asset pack download failed due to insufficient storage.");
        Integer LIZIZ6 = DIX.LIZIZ(hashMap, -11, "The Play Store app is either not installed or not the official version.", -12, "Tried to show the cellular data confirmation but no asset packs are waiting for Wi-Fi.");
        Integer LIZIZ7 = DIX.LIZIZ(hashMap, -13, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.", -100, "Unknown error downloading an asset pack.");
        hashMap2.put(-1, "APP_UNAVAILABLE");
        hashMap2.put(LIZIZ2, "PACK_UNAVAILABLE");
        hashMap2.put(-3, "INVALID_REQUEST");
        hashMap2.put(LIZIZ3, "DOWNLOAD_NOT_FOUND");
        hashMap2.put(-5, "API_NOT_AVAILABLE");
        hashMap2.put(LIZIZ4, "NETWORK_ERROR");
        hashMap2.put(-7, "ACCESS_DENIED");
        hashMap2.put(LIZIZ5, "INSUFFICIENT_STORAGE");
        hashMap2.put(-11, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(LIZIZ6, "NETWORK_UNRESTRICTED");
        hashMap2.put(-13, "APP_NOT_OWNED");
        hashMap2.put(LIZIZ7, "INTERNAL_ERROR");
    }
}
