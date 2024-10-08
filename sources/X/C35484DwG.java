package X;

import java.util.HashMap;

/* renamed from: X.DwG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35484DwG {
    public static final java.util.Map LIZ;
    public static final java.util.Map LIZIZ;

    static {
        HashMap hashMap = new HashMap();
        LIZ = hashMap;
        HashMap hashMap2 = new HashMap();
        LIZIZ = hashMap2;
        Integer LIZIZ2 = DIX.LIZIZ(hashMap, -1, "Integrity API is not available.\nIntegrity API is not enabled, or the Play Store version might be old.\nRecommended actions:\n1) Make sure that Integrity API is enabled in Google Play Console.\n2) Ask the user to update Play Store.\n", -2, "The Play Store app is either not installed or not the official version.\nAsk the user to install an official and recent version of Play Store.\n");
        Integer LIZIZ3 = DIX.LIZIZ(hashMap, -3, "Network error: unable to obtain integrity details.\nAsk the user to check for a connection.\n", -4, "No active account found in the Play Store app. Note that the Play Integrity API now supports unauthenticated requests. This error code is used only for older Play Store versions that lack support.\nAsk the user to authenticate in Play Store.\n");
        Integer LIZIZ4 = DIX.LIZIZ(hashMap, -5, "PackageManager could not find this app.\nSomething is wrong (possibly an attack). Non-actionable.\n", -6, "Google Play Services is not available or version is too old.\nAsk the user to Install or Update Play Services.\n");
        Integer LIZIZ5 = DIX.LIZIZ(hashMap, -7, "The calling app UID (user id) does not match the one from Package Manager.\nSomething is wrong (possibly an attack). Non-actionable.\n", -8, "The calling app is making too many requests to the API and hence is throttled.\nRetry with an exponential backoff.\n");
        Integer LIZIZ6 = DIX.LIZIZ(hashMap, -9, "Binding to the service in the Play Store has failed. This can be due to having an old Play Store version installed on the device.\nAsk the user to update Play Store.\n", -10, "Nonce length is too short. The nonce must be a minimum of 16 bytes (before base64 encoding) to allow for a better security.\nRetry with a longer nonce.\n");
        Integer LIZIZ7 = DIX.LIZIZ(hashMap, -11, "Nonce length is too long. The nonce must be less than 500 bytes before base64 encoding.\nRetry with a shorter nonce.\n", -12, "Unknown internal Google server error.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n");
        Integer LIZIZ8 = DIX.LIZIZ(hashMap, -13, "Nonce is not encoded as a base64 web-safe no-wrap string.\nRetry with correct nonce format.\n", -14, "The Play Store needs to be updated.\nAsk the user to update the Google Play Store.\n");
        Integer LIZIZ9 = DIX.LIZIZ(hashMap, -15, "Play Services needs to be updated.\nAsk the user to update Google Play Services.\n", -16, "The provided cloud project number is invalid.\nUse the cloud project number which can be found in Project info in your Google Cloud Console for the cloud project where Play Integrity API is enabled.\n");
        Integer LIZIZ10 = DIX.LIZIZ(hashMap, -100, "Unknown error processing integrity request.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n", -17, "There is a transient error on the calling device.\nRetry with an exponential backoff.\n");
        hashMap2.put(-1, "API_NOT_AVAILABLE");
        hashMap2.put(-3, "NETWORK_ERROR");
        hashMap2.put(LIZIZ2, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(LIZIZ3, "PLAY_STORE_ACCOUNT_NOT_FOUND");
        hashMap2.put(LIZIZ8, "PLAY_STORE_VERSION_OUTDATED");
        hashMap2.put(-5, "APP_NOT_INSTALLED");
        hashMap2.put(LIZIZ4, "PLAY_SERVICES_NOT_FOUND");
        hashMap2.put(-15, "PLAY_SERVICES_VERSION_OUTDATED");
        hashMap2.put(-7, "APP_UID_MISMATCH");
        hashMap2.put(LIZIZ5, "TOO_MANY_REQUESTS");
        hashMap2.put(-9, "CANNOT_BIND_TO_SERVICE");
        hashMap2.put(LIZIZ6, "NONCE_TOO_SHORT");
        hashMap2.put(-11, "NONCE_TOO_LONG");
        hashMap2.put(-13, "NONCE_IS_NOT_BASE64");
        hashMap2.put(LIZIZ9, "CLOUD_PROJECT_NUMBER_IS_INVALID");
        hashMap2.put(LIZIZ7, "GOOGLE_SERVER_UNAVAILABLE");
        hashMap2.put(-100, "INTERNAL_ERROR");
        hashMap2.put(LIZIZ10, "CLIENT_TRANSIENT_ERROR");
    }
}
