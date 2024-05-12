package com.ss.android.ugc.bytex.pthread.base.proxy;

import com.ss.android.ugc.bytex.pthread.base.convergence.SuperThreadPool;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadFactoryProxy;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class PThreadScheduledThreadPoolExecutor extends ScheduledThreadPoolExecutor {
    public PThreadScheduledThreadPoolExecutor(int i) {
        super(i, ThreadFactoryProxy.Companion.proxy(Executors.defaultThreadFactory(), 8));
        SuperThreadPool superThreadPool = SuperThreadPool.INSTANCE;
        if (!superThreadPool.getAllowAllCoreThreadTimeOut() || superThreadPool.getIdleWorkerKeepAliveNs() <= 0) {
            return;
        }
        setKeepAliveTime(superThreadPool.getIdleWorkerKeepAliveNs(), TimeUnit.NANOSECONDS);
        try {
            allowCoreThreadTimeOut(true);
        } catch (Throwable unused) {
        }
    }

    public PThreadScheduledThreadPoolExecutor(int i, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, ThreadFactoryProxy.Companion.proxy(Executors.defaultThreadFactory(), 8), rejectedExecutionHandler);
        SuperThreadPool superThreadPool = SuperThreadPool.INSTANCE;
        if (!superThreadPool.getAllowAllCoreThreadTimeOut() || superThreadPool.getIdleWorkerKeepAliveNs() <= 0) {
            return;
        }
        setKeepAliveTime(superThreadPool.getIdleWorkerKeepAliveNs(), TimeUnit.NANOSECONDS);
        try {
            allowCoreThreadTimeOut(true);
        } catch (Throwable unused) {
        }
    }

    public PThreadScheduledThreadPoolExecutor(int i, ThreadFactory threadFactory) {
        super(i, ThreadFactoryProxy.Companion.proxy(threadFactory, 8));
        SuperThreadPool superThreadPool = SuperThreadPool.INSTANCE;
        if (!superThreadPool.getAllowAllCoreThreadTimeOut() || superThreadPool.getIdleWorkerKeepAliveNs() <= 0) {
            return;
        }
        setKeepAliveTime(superThreadPool.getIdleWorkerKeepAliveNs(), TimeUnit.NANOSECONDS);
        try {
            allowCoreThreadTimeOut(true);
        } catch (Throwable unused) {
        }
    }

    public PThreadScheduledThreadPoolExecutor(int i, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, ThreadFactoryProxy.Companion.proxy(threadFactory, 8), rejectedExecutionHandler);
        SuperThreadPool superThreadPool = SuperThreadPool.INSTANCE;
        if (!superThreadPool.getAllowAllCoreThreadTimeOut() || superThreadPool.getIdleWorkerKeepAliveNs() <= 0) {
            return;
        }
        setKeepAliveTime(superThreadPool.getIdleWorkerKeepAliveNs(), TimeUnit.NANOSECONDS);
        try {
            allowCoreThreadTimeOut(true);
        } catch (Throwable unused) {
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void allowCoreThreadTimeOut(boolean z) {
        try {
            super.allowCoreThreadTimeOut(!SuperThreadPool.INSTANCE.getEnableBlockFetchTask() || z);
        } catch (Throwable unused) {
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void setThreadFactory(ThreadFactory threadFactory) {
        super.setThreadFactory(ThreadFactoryProxy.Companion.proxy(threadFactory, 8));
    }
}
