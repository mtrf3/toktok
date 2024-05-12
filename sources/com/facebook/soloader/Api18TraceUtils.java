package com.facebook.soloader;

import X.X1D;
import android.os.Trace;
import defpackage.a1;

/* loaded from: classes7.dex */
public class Api18TraceUtils {
    public static void LIZ(String str, String str2, String str3) {
        String LJ = a1.LJ(str, str2, str3);
        if (LJ.length() > 127 && str2 != null) {
            int length = (127 - str.length()) - str3.length();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(str2.substring(0, length));
            LIZ.append(str3);
            LJ = X1D.LIZIZ(LIZ);
        }
        Trace.beginSection(LJ);
    }
}
