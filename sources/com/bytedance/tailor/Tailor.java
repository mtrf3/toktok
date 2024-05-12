package com.bytedance.tailor;

import X.C16880lQ;
import android.os.Debug;

/* loaded from: classes7.dex */
public class Tailor {
    public static native void closeTailor();

    public static native void openTailor(String str, boolean z);

    public static native void tailorHprof(String str, String str2);

    static {
        C16880lQ.LLJJJIL("tailor");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        if (0 != 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isHprofValid(java.lang.String r6) {
        /*
            r5 = 0
            r1 = 0
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = "r"
            r4.<init>(r6, r0)     // Catch: java.lang.Throwable -> L22
            long r2 = r4.length()     // Catch: java.lang.Throwable -> L20
            r0 = 9
            long r2 = r2 - r0
            r4.seek(r2)     // Catch: java.lang.Throwable -> L20
            byte r1 = r4.readByte()     // Catch: java.lang.Throwable -> L20
            r0 = 44
            if (r1 != r0) goto L1c
            r5 = 1
        L1c:
            r4.close()     // Catch: java.lang.Throwable -> L1f
        L1f:
            return r5
        L20:
            r1 = r4
            goto L24
        L22:
            if (r1 == 0) goto L27
        L24:
            r1.close()     // Catch: java.lang.Throwable -> L27
        L27:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tailor.Tailor.isHprofValid(java.lang.String):boolean");
    }

    public static void dumpHprofData(String str, boolean z) {
        openTailor(str, z);
        Debug.dumpHprofData(str);
        closeTailor();
    }
}
