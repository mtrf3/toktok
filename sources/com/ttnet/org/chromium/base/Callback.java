package com.ttnet.org.chromium.base;

/* loaded from: classes17.dex */
public interface Callback<T> {
    void LIZ();

    /* loaded from: classes17.dex */
    public static abstract class Helper {
        public static void runRunnable(Runnable runnable) {
            runnable.run();
        }

        public static void onBooleanResultFromNative(Callback callback, boolean z) {
            callback.LIZ();
        }

        public static void onIntResultFromNative(Callback callback, int i) {
            callback.LIZ();
        }

        public static void onLongResultFromNative(Callback callback, long j) {
            callback.LIZ();
        }

        public static void onObjectResultFromNative(Callback callback, Object obj) {
            callback.LIZ();
        }

        public static void onTimeResultFromNative(Callback callback, long j) {
            callback.LIZ();
        }
    }
}
