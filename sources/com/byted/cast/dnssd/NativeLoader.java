package com.byted.cast.dnssd;

import X.C16880lQ;
import X.X1D;

/* loaded from: classes29.dex */
public class NativeLoader {
    public static boolean myLoadLibrary(String str) {
        try {
            C16880lQ.LLJJJIL(str);
            return true;
        } catch (UnsatisfiedLinkError e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("can't load library:");
            LIZ.append(str);
            LIZ.append(", e:");
            LIZ.append(e);
            Logger.w("NativeLoader", X1D.LIZIZ(LIZ));
            return false;
        }
    }
}
