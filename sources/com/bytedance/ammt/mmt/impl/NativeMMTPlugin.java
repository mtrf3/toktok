package com.bytedance.ammt.mmt.impl;

import X.C10940bq;
import X.C16880lQ;
import com.bytedance.android.bytehook.ByteHook;

/* loaded from: classes.dex */
public class NativeMMTPlugin extends C10940bq {
    public static volatile NativeMMTPlugin LIZLLL;
    public static final String LJ;
    public String LIZIZ;
    public String LIZJ;

    public static native void native_dump(String str, String str2);

    public static native void native_setConfigParams(int i);

    public static native void native_setMemoryThreshold(long j, long j2);

    public static native void native_start();

    public static native void native_stop();

    static {
        C16880lQ.LLJJJIL("mmt");
        LJ = "nmt";
    }

    public static NativeMMTPlugin LIZIZ() {
        if (LIZLLL == null) {
            synchronized (NativeMMTPlugin.class) {
                LIZLLL = new NativeMMTPlugin();
            }
        }
        return LIZLLL;
    }

    public final void LIZ() {
        native_dump(this.LIZIZ, this.LIZJ);
    }

    public final void LIZLLL() {
        ByteHook.init();
        native_start();
        this.LIZ = true;
    }

    public final void LIZJ(long j, long j2) {
        native_setMemoryThreshold(j, j2);
    }
}
