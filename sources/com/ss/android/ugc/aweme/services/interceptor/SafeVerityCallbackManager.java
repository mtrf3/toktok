package com.ss.android.ugc.aweme.services.interceptor;

/* loaded from: classes17.dex */
public class SafeVerityCallbackManager {
    public static final Object LOCK = new Object();
    public static volatile SafeVerityCallbackManager sInstance;
    public SafeVerityCallback mCallback;

    public static SafeVerityCallbackManager getInstance() {
        if (sInstance == null) {
            synchronized (SafeVerityCallbackManager.class) {
                if (sInstance == null) {
                    sInstance = new SafeVerityCallbackManager();
                }
            }
        }
        return sInstance;
    }

    public void notifyResult(SafeVerityResponse safeVerityResponse) {
        synchronized (LOCK) {
            SafeVerityCallback safeVerityCallback = this.mCallback;
            if (safeVerityCallback != null) {
                safeVerityCallback.onComplete(safeVerityResponse);
                this.mCallback = null;
            }
        }
    }

    public void register(SafeVerityCallback safeVerityCallback) {
        if (safeVerityCallback == null) {
            return;
        }
        synchronized (LOCK) {
            this.mCallback = safeVerityCallback;
        }
    }
}
