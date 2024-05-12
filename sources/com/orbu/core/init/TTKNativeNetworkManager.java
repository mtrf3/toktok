package com.orbu.core.init;

import X.C16880lQ;
import com.bytedance.android.bytehook.ByteHook;
import com.orbu.core.init.TTKNativeNetworkManager;
import com.orbu.core.mob.ITTKNativeCallback;
import java.util.concurrent.ExecutorService;

/* loaded from: classes16.dex */
public class TTKNativeNetworkManager {
    public static ITTKNativeCallback _callback;
    public static final String TAG = C16880lQ.LJLLJ(TTKNativeNetworkManager.class);
    public static boolean loaded = false;
    public static boolean inited = false;
    public static volatile boolean active = false;
    public static ExecutorService pool = C16880lQ.LLLLZLLIL();

    public static native int activesdk(boolean z, boolean z2);

    public static native int initcall();

    public static void load() {
        if (!loaded) {
            try {
                C16880lQ.LLJJJIL("orbuculumadapter");
                loaded = true;
            } catch (Throwable unused) {
            }
        }
        ByteHook.init();
        if (!inited) {
            try {
                initcall();
                inited = true;
            } catch (Throwable unused2) {
            }
        }
    }

    public static boolean isActive() {
        return active;
    }

    public static void active(final boolean z) {
        pool.execute(new Runnable() { // from class: X.XwI
            @Override // java.lang.Runnable
            public final void run() {
                TTKNativeNetworkManager.lambda$active$0(z);
            }
        });
    }

    public static /* synthetic */ void lambda$active$0(boolean z) {
        boolean z2;
        load();
        try {
            active = z;
            if (_callback != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            activesdk(z, z2);
        } catch (Throwable unused) {
            active = false;
        }
    }

    public static void setTTKNativeCallback(ITTKNativeCallback iTTKNativeCallback) {
        _callback = iTTKNativeCallback;
    }

    public static void send(String str, String str2, String str3, String str4, String str5, int i) {
        ITTKNativeCallback iTTKNativeCallback = _callback;
        if (iTTKNativeCallback != null) {
            iTTKNativeCallback.onNativeNetworkEvent(str, str2, str3, str4, str5, i);
        }
    }
}
