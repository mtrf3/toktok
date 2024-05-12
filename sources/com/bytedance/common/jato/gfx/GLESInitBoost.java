package com.bytedance.common.jato.gfx;

import X.C0IN;
import X.C0IO;
import X.C48693J9d;
import com.bytedance.android.bytehook.ByteHook;

/* loaded from: classes7.dex */
public class GLESInitBoost {
    public static boolean LIZ;

    public static native int nativeBoost(boolean z);

    public static synchronized void LIZ(boolean z) {
        synchronized (GLESInitBoost.class) {
            if (LIZ) {
                return;
            }
            LIZ = true;
            if (!C48693J9d.LJFF()) {
                return;
            }
            C0IO c0io = new C0IO();
            C0IN c0in = new C0IN();
            c0in.LIZ = c0io.LIZ;
            c0in.LIZIZ = c0io.LIZIZ;
            ByteHook.init(c0in);
            nativeBoost(z);
        }
    }
}
