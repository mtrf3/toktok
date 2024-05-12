package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Pattern;

/* loaded from: classes12.dex */
public class HeapGCOptimizer {
    public static long currentRegionSpaces = 0;
    public static boolean sGlobalSwitchOff = false;
    public static boolean sInited = false;
    public static int sMaxAPISupport = 33;
    public static boolean sShrinkInited;
    public static Timer sVssCheckTimer;
    public static final Pattern numPattern = PatternProtector.compile("[^0-9]");
    public static VssConfig sVssConfig = new VssConfig();

    /* loaded from: classes12.dex */
    public static class VssCheckAndShrinkTask extends TimerTask {
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            com_bytedance_sysoptimizer_HeapGCOptimizer$VssCheckAndShrinkTask_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_bytedance_sysoptimizer_HeapGCOptimizer$VssCheckAndShrinkTask__run$___twin___() {
            long j = HeapGCOptimizer.currentRegionSpaces;
            VssConfig vssConfig = HeapGCOptimizer.sVssConfig;
            if (j - vssConfig.shrinkStep < vssConfig.lowerLimit) {
                HeapGCOptimizer.stopVssCheckTimer();
                return;
            }
            long readVssSize = HeapGCOptimizer.readVssSize();
            if (readVssSize < 0) {
                HeapGCOptimizer.stopVssCheckTimer();
                return;
            }
            float f = ((float) readVssSize) / 4.2949673E9f;
            if (f < 1.0d) {
                if (f > HeapGCOptimizer.sVssConfig.periodOfShrink) {
                    if (!HeapGCOptimizer.shrink_regionspace_vss(r1.shrinkStep * 1048576)) {
                        HeapGCOptimizer.stopVssCheckTimer();
                        return;
                    } else {
                        HeapGCOptimizer.currentRegionSpaces -= HeapGCOptimizer.sVssConfig.shrinkStep;
                        HeapGCOptimizer.startVssCheckTimer(-1, HeapGCOptimizer.sVssConfig.periodOfCheck / 2);
                        return;
                    }
                }
                VssConfig vssConfig2 = HeapGCOptimizer.sVssConfig;
                if (f < vssConfig2.periodOfLessMemoryUsage) {
                    HeapGCOptimizer.startVssCheckTimer(-1, vssConfig2.periodOfCheck * 2);
                }
            }
        }

        public VssCheckAndShrinkTask() {
        }

        public static void com_bytedance_sysoptimizer_HeapGCOptimizer$VssCheckAndShrinkTask_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(VssCheckAndShrinkTask vssCheckAndShrinkTask) {
            boolean LIZ;
            try {
                vssCheckAndShrinkTask.com_bytedance_sysoptimizer_HeapGCOptimizer$VssCheckAndShrinkTask__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* loaded from: classes12.dex */
    public static class VssConfig {
        public int firstDelay = 30;
        public int periodOfCheck = 30;
        public float periodOfShrink = 0.65f;
        public float periodOfLessMemoryUsage = 0.45f;
        public int shrinkStep = 125;
        public int lowerLimit = 384;
    }

    public static native long getCurrentRegionSpaceSize();

    public static native boolean heap_expand(int i, boolean z);

    public static native boolean init(int i);

    public static native boolean init_4shrink_region_space(int i);

    public static native boolean init_shrink_region_space_step_size(long j);

    public static native boolean optimize(int i, float f, float f2, float f3);

    public static native boolean reuse_partial_tlab();

    public static native boolean shrink_regionspace_vss(long j);

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        r2 = java.lang.Integer.parseInt(com.bytedance.sysoptimizer.HeapGCOptimizer.numPattern.matcher(r1).replaceAll("").trim()) * 1024;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0068 -> B:16:0x006b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long readVssSize() {
        /*
            r2 = -1
            r6 = 0
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L6b
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = "/proc/"
            r1.append(r0)     // Catch: java.lang.Throwable -> L6b
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L6b
            r1.append(r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = "/status"
            r1.append(r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L6b
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L6b
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5d
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L5d
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L5d
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L5d
        L2b:
            java.lang.String r0 = r4.readLine()     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L56
            java.lang.String r1 = r0.toLowerCase()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = "vmsize"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L2b
            java.util.regex.Pattern r0 = com.bytedance.sysoptimizer.HeapGCOptimizer.numPattern     // Catch: java.lang.Throwable -> L5e
            java.util.regex.Matcher r1 = r0.matcher(r1)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = ""
            java.lang.String r0 = r1.replaceAll(r0)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L5e
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L5e
            long r2 = (long) r0     // Catch: java.lang.Throwable -> L5e
            r0 = 1024(0x400, double:5.06E-321)
            long r2 = r2 * r0
        L56:
            r5.close()     // Catch: java.io.IOException -> L67
            r4.close()     // Catch: java.io.IOException -> L67
            goto L6b
        L5d:
            r4 = r6
        L5e:
            r5.close()     // Catch: java.io.IOException -> L67
            if (r4 == 0) goto L6b
            r4.close()     // Catch: java.io.IOException -> L67
            goto L6b
        L67:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L6b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sysoptimizer.HeapGCOptimizer.readVssSize():long");
    }

    public static boolean shouldSkipHeapOptimize() {
        if (Build.VERSION.SDK_INT > sMaxAPISupport || sGlobalSwitchOff) {
            return true;
        }
        return false;
    }

    public static void stopVssCheckTimer() {
        Timer timer = sVssCheckTimer;
        if (timer != null) {
            timer.cancel();
            sVssCheckTimer = null;
        }
    }

    public static synchronized void heapOptimizeSwitchOff(boolean z) {
        synchronized (HeapGCOptimizer.class) {
            sGlobalSwitchOff = z;
        }
    }

    public static synchronized void reusePartialTLAB(Context context) {
        synchronized (HeapGCOptimizer.class) {
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                try {
                    reuse_partial_tlab();
                } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                }
            }
        }
    }

    public static synchronized void setHeapOptMaxAPISupport(int i) {
        synchronized (HeapGCOptimizer.class) {
            sMaxAPISupport = i;
        }
    }

    public static synchronized void initOptimizeRegionSpaceVSS(Context context, int i) {
        synchronized (HeapGCOptimizer.class) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 26) {
                return;
            }
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                try {
                    if (!sShrinkInited && init_4shrink_region_space(i2)) {
                        sShrinkInited = true;
                    }
                    if (sShrinkInited) {
                        init_shrink_region_space_step_size(i);
                    }
                } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                }
            }
        }
    }

    public static synchronized void optimizeRegionSpaceVSS(Context context, VssConfig vssConfig) {
        synchronized (HeapGCOptimizer.class) {
            int i = Build.VERSION.SDK_INT;
            if (i < 26) {
                return;
            }
            if (Process.is64Bit()) {
                return;
            }
            sVssConfig = vssConfig;
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                try {
                    if (!sShrinkInited && init_4shrink_region_space(i)) {
                        sShrinkInited = true;
                    }
                    if (sShrinkInited) {
                        if (sVssConfig.periodOfCheck == -1) {
                            shrink_regionspace_vss(r4.shrinkStep * 1048576);
                        } else {
                            currentRegionSpaces = getCurrentRegionSpaceSize() / 1048576;
                            startVssCheckTimer(vssConfig.firstDelay, sVssConfig.periodOfCheck);
                        }
                    }
                } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                }
            }
        }
    }

    public static void startVssCheckTimer(int i, int i2) {
        if (sVssCheckTimer != null) {
            stopVssCheckTimer();
        }
        if (i2 <= 0) {
            return;
        }
        PthreadTimer pthreadTimer = new PthreadTimer("HeapGCOptimizer");
        sVssCheckTimer = pthreadTimer;
        if (i > 0 && i > i2) {
            pthreadTimer.schedule(new VssCheckAndShrinkTask(), i * 1000, i2 * 1000);
        } else {
            long j = i2 * 1000;
            pthreadTimer.schedule(new VssCheckAndShrinkTask(), j, j);
        }
    }

    public static synchronized void heapExpand(Context context, int i, boolean z) {
        synchronized (HeapGCOptimizer.class) {
            if (shouldSkipHeapOptimize()) {
                return;
            }
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (!sInited && init(i2)) {
                        sInited = true;
                    }
                    if (sInited) {
                        heap_expand(i, z);
                    }
                } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                }
            }
        }
    }

    public static synchronized void optimize(Context context, float f, float f2, float f3) {
        synchronized (HeapGCOptimizer.class) {
            if (shouldSkipHeapOptimize()) {
                return;
            }
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                try {
                    int i = Build.VERSION.SDK_INT;
                    if (!sInited && init(i)) {
                        sInited = true;
                    }
                    if (sInited) {
                        optimize(i, f, f2, f3);
                    }
                } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                }
            }
        }
    }
}
