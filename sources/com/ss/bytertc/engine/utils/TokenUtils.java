package com.ss.bytertc.engine.utils;

import X.C16880lQ;
import X.X1D;
import android.util.Base64;

/* loaded from: classes33.dex */
public class TokenUtils {
    public static String buildToken(String str, String str2, String str3, String str4) {
        if (str == null || str.isEmpty()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Basic ");
            LIZ.append(Base64.encodeToString(C16880lQ.LLLZ("%s:%s:%s", new Object[]{str2, str3, str4}).getBytes(), 2));
            return X1D.LIZIZ(LIZ);
        }
        if (str.contains("Basic")) {
            return str;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Bearer ");
        LIZ2.append(str);
        return X1D.LIZIZ(LIZ2);
    }
}
