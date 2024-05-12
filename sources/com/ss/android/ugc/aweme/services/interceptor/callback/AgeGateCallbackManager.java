package com.ss.android.ugc.aweme.services.interceptor.callback;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class AgeGateCallbackManager {
    public static final Companion Companion = new Companion();
    public static final Object LOCK = new Object();
    public static volatile AgeGateCallbackManager sInstance;
    public AgeGateCallback currentCallback;

    /* loaded from: classes12.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AgeGateCallbackManager getInstance() {
            if (AgeGateCallbackManager.sInstance == null) {
                synchronized (AgeGateCallbackManager.class) {
                    if (AgeGateCallbackManager.sInstance == null) {
                        AgeGateCallbackManager.sInstance = new AgeGateCallbackManager();
                    }
                }
            }
            return AgeGateCallbackManager.sInstance;
        }

        public Companion() {
        }
    }

    public /* synthetic */ AgeGateCallbackManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AgeGateCallbackManager() {
    }

    public final void notifyResult(String str) {
        synchronized (LOCK) {
            AgeGateCallback ageGateCallback = this.currentCallback;
            if (ageGateCallback != null) {
                ageGateCallback.onComplete(str);
            }
            this.currentCallback = null;
        }
    }

    public final void register(AgeGateCallback callback) {
        o.LJIIIZ(callback, "callback");
        synchronized (LOCK) {
            this.currentCallback = callback;
        }
    }
}
