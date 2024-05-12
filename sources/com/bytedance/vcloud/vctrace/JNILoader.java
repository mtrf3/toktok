package com.bytedance.vcloud.vctrace;

import X.C16880lQ;
import android.content.Context;

/* loaded from: classes9.dex */
public class JNILoader {
    public static volatile boolean isLibraryLoaded;

    public static synchronized void loadLibrary(Context context) {
        synchronized (JNILoader.class) {
            try {
                if (!isLibraryLoaded) {
                    C16880lQ.LLJJJIL("vctrace");
                    isLibraryLoaded = true;
                }
            } catch (Throwable unused) {
            }
        }
    }
}
