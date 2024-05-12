package com.bytedance.sysoptimizer;

import X.C16880lQ;
import android.content.Context;
import android.os.Build;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* loaded from: classes12.dex */
public class NativeBitmap {
    public static boolean mEnabled;
    public static boolean mStarted;

    public static native boolean start(int i);

    public static double getJavaHeapUtilizaiton() {
        return (Runtime.getRuntime().totalMemory() * 1.0d) / Runtime.getRuntime().maxMemory();
    }

    public static synchronized boolean enable(Context context) {
        synchronized (NativeBitmap.class) {
            int i = Build.VERSION.SDK_INT;
            if (i < 22 || i > 25) {
                return false;
            }
            return realStart(context);
        }
    }

    public static synchronized boolean realStart(Context context) {
        synchronized (NativeBitmap.class) {
            if (mEnabled) {
                return true;
            }
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                try {
                    boolean start = start(Build.VERSION.SDK_INT);
                    mEnabled = start;
                    return start;
                } catch (UnsatisfiedLinkError unused) {
                }
            }
            return false;
        }
    }

    public static synchronized boolean enable(final Context context, final long j, final double d, long j2) {
        synchronized (NativeBitmap.class) {
            int i = Build.VERSION.SDK_INT;
            if (i < 22 || i > 25) {
                return false;
            }
            if (Runtime.getRuntime().maxMemory() > j2) {
                return false;
            }
            if (!mStarted && !mEnabled) {
                mStarted = true;
                new PthreadThread(null, new Runnable() { // from class: com.bytedance.sysoptimizer.NativeBitmap.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com_bytedance_sysoptimizer_NativeBitmap$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_bytedance_sysoptimizer_NativeBitmap$1__run$___twin___() {
                        while (true) {
                            try {
                                Thread.sleep(j);
                            } catch (InterruptedException e) {
                                C16880lQ.LLLLIIL(e);
                            }
                            if (!NativeBitmap.mEnabled) {
                                if (NativeBitmap.getJavaHeapUtilizaiton() >= d) {
                                    NativeBitmap.realStart(context);
                                    return;
                                }
                                continue;
                            } else {
                                return;
                            }
                        }
                    }

                    public static void com_bytedance_sysoptimizer_NativeBitmap$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        boolean LIZ;
                        try {
                            anonymousClass1.com_bytedance_sysoptimizer_NativeBitmap$1__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                }, "NativeBitmap", 262144L).start();
                return true;
            }
            return true;
        }
    }
}
