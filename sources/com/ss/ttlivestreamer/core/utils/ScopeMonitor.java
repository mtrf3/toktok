package com.ss.ttlivestreamer.core.utils;

import android.os.Handler;
import android.os.HandlerThread;
import com.ss.ttlivestreamer.core.utils.ThreadUtils;

/* loaded from: classes12.dex */
public class ScopeMonitor {
    public static boolean enabled = true;
    public static ScopeMonitor instance;
    public final HandlerThread mHandlerThread;
    public final Handler mLogHandler;
    public final ThreadUtils.ThreadChecker mThreadChecker;

    public static native void nativeCalcElapse(int i, long j, long j2);

    private void release() {
        try {
            this.mHandlerThread.quitSafely();
        } catch (Throwable unused) {
            this.mHandlerThread.quit();
        }
    }

    public static void releaseScopeMonitor() {
        ScopeMonitor scopeMonitor = instance;
        if (scopeMonitor != null) {
            scopeMonitor.release();
        }
    }

    public ScopeMonitor() {
        HandlerThread handlerThread = new HandlerThread("ScopeMonitor", TTLSThreadConfigHelper.getPriority("ScopeMonitor", 0));
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.mLogHandler = new Handler(handlerThread.getLooper());
        this.mThreadChecker = null;
    }

    public static void CalcElapse(int i, long j, long j2) {
        if (!enabled) {
            return;
        }
        if (instance == null) {
            instance = new ScopeMonitor();
        }
        instance.CalcElapseInstance(i, j, j2);
    }

    private void CalcElapseInstance(final int i, final long j, final long j2) {
        this.mLogHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.utils.ScopeMonitor.2
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_utils_ScopeMonitor$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_utils_ScopeMonitor$2__run$___twin___() {
                ScopeMonitor.nativeCalcElapse(i, j, j2);
            }

            public static void com_ss_ttlivestreamer_core_utils_ScopeMonitor$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_ss_ttlivestreamer_core_utils_ScopeMonitor$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }
}
