package com.ttnet.org.chromium.base;

import X.AbstractC38644FEq;
import X.C16880lQ;
import X.C38643FEp;
import X.O6T;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public class SysUtils {
    public static Boolean LIZ;
    public static Integer LIZIZ;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        r1 = java.lang.Integer.parseInt(r1.group(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r1 > 1024) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        android.os.StrictMode.setThreadPolicy(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ() {
        /*
            java.lang.String r0 = "^MemTotal:\\s+([0-9]+) kB$"
            java.util.regex.Pattern r5 = com.bytedance.mt.protector.impl.PatternProtector.compile(r0)
            android.os.StrictMode$ThreadPolicy r4 = android.os.StrictMode.allowThreadDiskReads()
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L55
            java.lang.String r0 = "/proc/meminfo"
            r3.<init>(r0)     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L55
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4b
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4b
        L16:
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L46
            if (r0 != 0) goto L1d
            goto L35
        L1d:
            java.util.regex.Matcher r1 = r5.matcher(r0)     // Catch: java.lang.Throwable -> L46
            boolean r0 = r1.find()     // Catch: java.lang.Throwable -> L46
            if (r0 != 0) goto L28
            goto L16
        L28:
            r0 = 1
            java.lang.String r0 = r1.group(r0)     // Catch: java.lang.Throwable -> L46
            int r1 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L46
            r0 = 1024(0x400, float:1.435E-42)
            if (r1 > r0) goto L3c
        L35:
            r2.close()     // Catch: java.lang.Throwable -> L4b
            r3.close()     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L55
            goto L50
        L3c:
            r2.close()     // Catch: java.lang.Throwable -> L4b
            r3.close()     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L55
            android.os.StrictMode.setThreadPolicy(r4)
            return r1
        L46:
            r0 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L4b
            throw r0     // Catch: java.lang.Throwable -> L4b
        L4b:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L55
            throw r0     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L55
        L50:
            android.os.StrictMode.setThreadPolicy(r4)
            r0 = 0
            return r0
        L55:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.SysUtils.LIZ():int");
    }

    public static int amountOfPhysicalMemoryKB() {
        if (LIZIZ == null) {
            LIZIZ = Integer.valueOf(LIZ());
        }
        return LIZIZ.intValue();
    }

    public static boolean isCurrentlyLowMemory() {
        ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(O6T.LIZ, "activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    public static boolean isLowEndDevice() {
        boolean z;
        boolean z2;
        int i;
        if (LIZ == null) {
            AtomicReference<AbstractC38644FEq> atomicReference = AbstractC38644FEq.LIZ;
            boolean z3 = true;
            if (!atomicReference.get().LIZ()) {
                if (atomicReference.get().LIZ()) {
                    z3 = false;
                } else {
                    Integer valueOf = Integer.valueOf(LIZ());
                    LIZIZ = valueOf;
                    if (valueOf.intValue() <= 0 || (Build.VERSION.SDK_INT < 26 ? LIZIZ.intValue() / 1024 > 512 : LIZIZ.intValue() / 1024 > 1024)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    Context context = O6T.LIZ;
                    if (context != null) {
                        z2 = ((ActivityManager) C16880lQ.LLILL(context, "activity")).isLowRamDevice();
                    } else {
                        z2 = false;
                    }
                    if (z == z2) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    C38643FEp.LIZ.LIZIZ(1, i, "Android.SysUtilsLowEndMatches", 0, 0, 0);
                    z3 = z;
                }
            }
            LIZ = Boolean.valueOf(z3);
        }
        return LIZ.booleanValue();
    }
}
