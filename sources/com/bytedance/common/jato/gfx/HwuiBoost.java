package com.bytedance.common.jato.gfx;

import X.C0IN;
import X.C0IO;
import X.C48693J9d;
import android.os.Build;
import com.bytedance.android.bytehook.ByteHook;

/* loaded from: classes7.dex */
public class HwuiBoost {
    public static boolean LIZ;

    public static native void nativeBoost(boolean z, boolean z2);

    public static void LIZ(boolean z, boolean z2, boolean z3) {
        synchronized (HwuiBoost.class) {
            if (LIZ) {
                return;
            }
            LIZ = true;
            if (z && Build.VERSION.SDK_INT >= 29) {
                GLESInitBoost.LIZ(false);
            }
            if (Build.VERSION.SDK_INT < 31) {
                z3 = false;
            }
            if ((!z2 && !z3) || !C48693J9d.LJFF()) {
                return;
            }
            C0IO c0io = new C0IO();
            C0IN c0in = new C0IN();
            c0in.LIZ = c0io.LIZ;
            c0in.LIZIZ = c0io.LIZIZ;
            ByteHook.init(c0in);
            nativeBoost(z2, z3);
        }
    }
}
