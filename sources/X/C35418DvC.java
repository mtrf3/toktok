package X;

import java.util.HashMap;

/* renamed from: X.DvC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35418DvC {
    public static final java.util.Map<Integer, String> LIZ;
    public static final java.util.Map<Integer, String> LIZIZ;

    static {
        HashMap hashMap = new HashMap();
        LIZ = hashMap;
        HashMap hashMap2 = new HashMap();
        LIZIZ = hashMap2;
        Integer LIZIZ2 = DIX.LIZIZ(hashMap, -2, "An unknown error occurred.", -3, "The API is not available on this device.");
        Integer LIZIZ3 = DIX.LIZIZ(hashMap, -4, "The request that was sent by the app is malformed.", -5, "The install is unavailable to this user or device.");
        Integer LIZIZ4 = DIX.LIZIZ(hashMap, -6, "The download/install is not allowed, due to the current device state (e.g. low battery, low disk space, ...).", -7, "The install/update has not been (fully) downloaded yet.");
        Integer LIZIZ5 = DIX.LIZIZ(hashMap, -8, "The install is already in progress and there is no UI flow to resume.", -9, "The Play Store app is either not installed or not the official version.");
        Integer LIZIZ6 = DIX.LIZIZ(hashMap, -10, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.", -100, "An internal error happened in the Play Store.");
        hashMap2.put(-2, "ERROR_UNKNOWN");
        hashMap2.put(LIZIZ2, "ERROR_API_NOT_AVAILABLE");
        hashMap2.put(-4, "ERROR_INVALID_REQUEST");
        hashMap2.put(LIZIZ3, "ERROR_INSTALL_UNAVAILABLE");
        hashMap2.put(-6, "ERROR_INSTALL_NOT_ALLOWED");
        hashMap2.put(LIZIZ4, "ERROR_DOWNLOAD_NOT_PRESENT");
        hashMap2.put(-8, "ERROR_INSTALL_IN_PROGRESS");
        hashMap2.put(LIZIZ6, "ERROR_INTERNAL_ERROR");
        hashMap2.put(LIZIZ5, "ERROR_PLAY_STORE_NOT_FOUND");
        hashMap2.put(-10, "ERROR_APP_NOT_OWNED");
    }
}
