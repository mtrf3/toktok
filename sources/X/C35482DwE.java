package X;

import java.util.HashMap;

/* renamed from: X.DwE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35482DwE {
    public static final java.util.Map<Integer, String> LIZ;
    public static final java.util.Map<Integer, String> LIZIZ;

    static {
        HashMap hashMap = new HashMap();
        LIZ = hashMap;
        HashMap hashMap2 = new HashMap();
        LIZIZ = hashMap2;
        Integer LIZIZ2 = DIX.LIZIZ(hashMap, -1, "Too many sessions are running for current app, existing sessions must be resolved first.", -2, "A requested module is not available (to this user/device, for the installed apk).");
        Integer LIZIZ3 = DIX.LIZIZ(hashMap, -3, "Request is otherwise invalid.", -4, "Requested session is not found.");
        Integer LIZIZ4 = DIX.LIZIZ(hashMap, -5, "Split Install API is not available.", -6, "Network error: unable to obtain split details.");
        Integer LIZIZ5 = DIX.LIZIZ(hashMap, -7, "Download not permitted under current device circumstances (e.g. in background).", -8, "Requested session contains modules from an existing active session and also new modules.");
        Integer LIZIZ6 = DIX.LIZIZ(hashMap, -9, "Service handling split install has died.", -10, "Install failed due to insufficient storage.");
        Integer LIZIZ7 = DIX.LIZIZ(hashMap, -11, "Signature verification error when invoking SplitCompat.", -12, "Error in SplitCompat emulation.");
        Integer LIZIZ8 = DIX.LIZIZ(hashMap, -13, "Error in copying files for SplitCompat.", -14, "The Play Store app is either not installed or not the official version.");
        hashMap.put(-15, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
        hashMap.put(-100, "Unknown error processing split install.");
        hashMap2.put(-1, "ACTIVE_SESSIONS_LIMIT_EXCEEDED");
        hashMap2.put(LIZIZ2, "MODULE_UNAVAILABLE");
        hashMap2.put(-3, "INVALID_REQUEST");
        hashMap2.put(LIZIZ3, "DOWNLOAD_NOT_FOUND");
        hashMap2.put(-5, "API_NOT_AVAILABLE");
        hashMap2.put(LIZIZ4, "NETWORK_ERROR");
        hashMap2.put(-7, "ACCESS_DENIED");
        hashMap2.put(LIZIZ5, "INCOMPATIBLE_WITH_EXISTING_SESSION");
        hashMap2.put(-9, "SERVICE_DIED");
        hashMap2.put(LIZIZ6, "INSUFFICIENT_STORAGE");
        hashMap2.put(-11, "SPLITCOMPAT_VERIFICATION_ERROR");
        hashMap2.put(LIZIZ7, "SPLITCOMPAT_EMULATION_ERROR");
        hashMap2.put(-13, "SPLITCOMPAT_COPY_ERROR");
        hashMap2.put(LIZIZ8, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(-15, "APP_NOT_OWNED");
    }
}
