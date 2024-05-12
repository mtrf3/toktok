package com.ss.android.utils;

import X.C16880lQ;
import android.app.ActivityManager;
import android.os.Debug;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ttve.nativePort.TEContentProviderUtils;

/* loaded from: classes9.dex */
public class TEDeviceInformation {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getCPUModel() {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L9
            java.lang.String r0 = android.os.Build.SOC_MODEL
            return r0
        L9:
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L4f
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Exception -> L4f
            java.lang.String r0 = "/proc/cpuinfo"
            r1.<init>(r0)     // Catch: java.lang.Exception -> L4f
            r5.<init>(r1)     // Catch: java.lang.Exception -> L4f
        L15:
            java.lang.String r1 = r5.readLine()     // Catch: java.lang.Exception -> L4f
            if (r1 == 0) goto L4b
            java.lang.String r0 = ":"
            java.lang.String[] r4 = r1.split(r0)     // Catch: java.lang.Exception -> L4f
            int r0 = r4.length     // Catch: java.lang.Exception -> L4f
            r3 = 1
            if (r0 <= r3) goto L15
            r0 = 0
            r0 = r4[r0]     // Catch: java.lang.Exception -> L4f
            java.lang.String r2 = r0.trim()     // Catch: java.lang.Exception -> L4f
            java.lang.String r1 = " "
            java.lang.String r0 = "_"
            java.lang.String r2 = r2.replace(r1, r0)     // Catch: java.lang.Exception -> L4f
            r0 = r4[r3]     // Catch: java.lang.Exception -> L4f
            java.lang.String r1 = r0.trim()     // Catch: java.lang.Exception -> L4f
            java.lang.String r0 = "Processor"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Exception -> L4f
            if (r0 != 0) goto L4a
            java.lang.String r0 = "ARMv"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Exception -> L4f
            if (r0 == 0) goto L15
        L4a:
            return r1
        L4b:
            r5.close()     // Catch: java.lang.Exception -> L4f
            goto L59
        L4f:
            r2 = move-exception
            java.lang.String r1 = "TEUtil"
            java.lang.String r0 = r2.getLocalizedMessage()
            X.P4Q.LIZLLL(r1, r0, r2)
        L59:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.utils.TEDeviceInformation.getCPUModel():java.lang.String");
    }

    public static Integer gpuUsed() {
        return CastIntegerProtector.valueOf(new Debug.MemoryInfo().getMemoryStat("summary.graphics"));
    }

    public static Integer memNative() {
        return CastIntegerProtector.valueOf(new Debug.MemoryInfo().getMemoryStat("summary.native-heap"));
    }

    public static long availMemMemory() {
        ActivityManager activityManager = (ActivityManager) C16880lQ.LLIZ("activity", TEContentProviderUtils.getApplicationContext());
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static long memThreshold() {
        ActivityManager activityManager = (ActivityManager) C16880lQ.LLIZ("activity", TEContentProviderUtils.getApplicationContext());
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.threshold;
    }

    public static long memTotal() {
        ActivityManager activityManager = (ActivityManager) C16880lQ.LLIZ("activity", TEContentProviderUtils.getApplicationContext());
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }
}
