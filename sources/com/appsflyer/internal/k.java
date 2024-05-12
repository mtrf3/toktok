package com.appsflyer.internal;

import X.C16880lQ;
import android.net.TrafficStats;
import com.appsflyer.AFLogger;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class k {
    public static k values;
    public ScheduledExecutorService AFInAppEventParameterName;
    public final ThreadFactory AFInAppEventType = new ThreadFactory() { // from class: com.appsflyer.internal.k.4
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(final Runnable runnable) {
            return new PthreadThread(new Runnable() { // from class: com.appsflyer.internal.k.4.5
                @Override // java.lang.Runnable
                public final void run() {
                    com_appsflyer_internal_k$4$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public final void com_appsflyer_internal_k$4$5__run$___twin___() {
                    TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
                    runnable.run();
                }

                public static void com_appsflyer_internal_k$4$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                    boolean LIZ;
                    try {
                        anonymousClass5.com_appsflyer_internal_k$4$5__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            }, "/internal/k$4");
        }
    };
    public Executor AFKeystoreWrapper;
    public ScheduledExecutorService valueOf;

    public final ScheduledThreadPoolExecutor AFInAppEventType() {
        ScheduledExecutorService scheduledExecutorService = this.valueOf;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown() || this.valueOf.isTerminated()) {
            this.valueOf = C16880lQ.LLLLZLL(2, this.AFInAppEventType);
        }
        return (ScheduledThreadPoolExecutor) this.valueOf;
    }

    public final Executor AFKeystoreWrapper() {
        Executor executor = this.AFKeystoreWrapper;
        if (executor == null || ((executor instanceof ThreadPoolExecutor) && (((ThreadPoolExecutor) executor).isShutdown() || ((ThreadPoolExecutor) this.AFKeystoreWrapper).isTerminated() || ((ThreadPoolExecutor) this.AFKeystoreWrapper).isTerminating()))) {
            this.AFKeystoreWrapper = C16880lQ.LLLLZI(2, this.AFInAppEventType);
        }
        return this.AFKeystoreWrapper;
    }

    public static void valueOf(ExecutorService executorService) {
        try {
            try {
                AFLogger.AFInAppEventParameterName("shut downing executor ...");
                executorService.shutdown();
                executorService.awaitTermination(10L, TimeUnit.SECONDS);
                if (!executorService.isTerminated()) {
                    AFLogger.AFInAppEventParameterName("killing non-finished tasks");
                }
                executorService.shutdownNow();
            } catch (InterruptedException unused) {
                AFLogger.AFInAppEventParameterName("InterruptedException!!!");
                if (!executorService.isTerminated()) {
                    AFLogger.AFInAppEventParameterName("killing non-finished tasks");
                }
                executorService.shutdownNow();
            }
        } catch (Throwable th) {
            if (!executorService.isTerminated()) {
                AFLogger.AFInAppEventParameterName("killing non-finished tasks");
            }
            executorService.shutdownNow();
            throw th;
        }
    }
}
