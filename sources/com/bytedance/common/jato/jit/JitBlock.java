package com.bytedance.common.jato.jit;

import X.C48693J9d;
import X.InterfaceC36130EFy;
import X.X1D;
import android.os.Build;

/* loaded from: classes7.dex */
public class JitBlock {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static InterfaceC36130EFy LIZJ;

    public static native int initJitBlockInternal(int i, boolean z);

    public static native void lightJitBlockStartInternal();

    public static native void lightJitBlockStopInternal();

    public static native void nativeSetInterval(long j);

    public static native void nativeSetPriority(int i);

    public static boolean LIZ() {
        int i;
        if (!LIZ || LIZIZ || (i = Build.VERSION.SDK_INT) < 25 || i > 32) {
            return false;
        }
        return true;
    }

    public static void LIZJ() {
        if (LIZ()) {
            lightJitBlockStartInternal();
        }
    }

    public static void LIZLLL() {
        if (LIZ()) {
            lightJitBlockStopInternal();
        }
    }

    public static void LIZIZ(boolean z) {
        int i;
        if (LIZ || LIZIZ || (i = Build.VERSION.SDK_INT) < 25 || i > 32 || !C48693J9d.LJFF()) {
            return;
        }
        try {
            int initJitBlockInternal = initJitBlockInternal(i, z);
            if (initJitBlockInternal != 0) {
                InterfaceC36130EFy interfaceC36130EFy = LIZJ;
                if (interfaceC36130EFy != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("init jit block failed:");
                    LIZ2.append(initJitBlockInternal);
                    X1D.LIZIZ(LIZ2);
                    interfaceC36130EFy.LIZ();
                }
                LIZIZ = true;
            }
            LIZ = true;
        } catch (Throwable unused) {
        }
    }

    public static void LJ(long j) {
        if (LIZ()) {
            nativeSetInterval(j);
        }
    }

    public static void LJFF(int i) {
        if (LIZ() && i != -1) {
            nativeSetPriority(i);
        }
    }
}
