package com.ss.android.ugc.bytex.pthread.base.convergence;

import com.ss.android.ugc.bytex.pthread.base.convergence.executor.DefaultThreadPoolExecutor;
import com.ss.android.ugc.bytex.pthread.base.convergence.executor.IExecutor;
import com.ss.android.ugc.bytex.pthread.base.convergence.external.ThreadLifecycleObserver;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SuperThreadPool {
    public static volatile int mEnable;
    public static ThreadLifecycleObserver threadLifecycleObserver;
    public static final SuperThreadPool INSTANCE = new SuperThreadPool();
    public static IExecutor mExecutor = new DefaultThreadPoolExecutor();
    public static boolean enableBlockFetchTask = true;
    public static boolean allowAllCoreThreadTimeOut = true;
    public static long idleWorkerKeepAliveNs = -1;
    public static boolean enablePriority = true;

    public final void execute(Runnable runnable) {
        o.LJIIJ(runnable, "runnable");
        mExecutor.execute(runnable);
    }

    public final boolean getAllowAllCoreThreadTimeOut() {
        return allowAllCoreThreadTimeOut;
    }

    public final boolean getEnableBlockFetchTask() {
        return enableBlockFetchTask;
    }

    public final boolean getEnablePriority() {
        return enablePriority;
    }

    public final long getIdleWorkerKeepAliveNs() {
        return idleWorkerKeepAliveNs;
    }

    public final ThreadLifecycleObserver getThreadLifecycleObserver() {
        return threadLifecycleObserver;
    }

    public final boolean isEnable(int i) {
        return (mEnable & i) == i;
    }

    public final void setAllowAllCoreThreadTimeOut(boolean z) {
        allowAllCoreThreadTimeOut = z;
    }

    public final void setEnableBlockFetchTask(boolean z) {
        enableBlockFetchTask = z;
    }

    public final void setEnablePriority(boolean z) {
        enablePriority = z;
    }

    public final void setEnableType(int i) {
        mEnable = i;
    }

    public final void setExecutor(IExecutor executor) {
        o.LJIIJ(executor, "executor");
        mExecutor = executor;
    }

    public final void setIdleWorkerKeepAliveNs(long j) {
        idleWorkerKeepAliveNs = j;
    }

    public final void setThreadLifecycleObserver(ThreadLifecycleObserver threadLifecycleObserver2) {
        threadLifecycleObserver = threadLifecycleObserver2;
    }
}
