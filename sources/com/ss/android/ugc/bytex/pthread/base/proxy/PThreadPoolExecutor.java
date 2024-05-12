package com.ss.android.ugc.bytex.pthread.base.proxy;

import com.ss.android.ugc.bytex.pthread.base.IRunnableMonitor;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.pthread.base.PThreadPoolExecutorInject;
import com.ss.android.ugc.bytex.pthread.base.convergence.SuperThreadPool;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.BlockingQueueProxy;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadFactoryProxy;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class PThreadPoolExecutor extends ThreadPoolExecutor {
    public static final Companion Companion = new Companion();

    /* loaded from: classes7.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
        super(i, i2, j, timeUnit, (BlockingQueue<Runnable>) BlockingQueueProxy.Companion.proxy(blockingQueue), ThreadFactoryProxy.Companion.proxy(Executors.defaultThreadFactory(), 2));
        if (allowsCoreThreadTimeOut() || !SuperThreadPool.INSTANCE.getAllowAllCoreThreadTimeOut()) {
            return;
        }
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long max = Math.max(30L, getKeepAliveTime(timeUnit2));
        setKeepAliveTime(max < 1 ? 1L : max, timeUnit2);
        try {
            allowCoreThreadTimeOut(true);
        } catch (Throwable unused) {
        }
    }

    public PThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, BlockingQueueProxy.Companion.proxy(blockingQueue), ThreadFactoryProxy.Companion.proxy(Executors.defaultThreadFactory(), 2), rejectedExecutionHandler);
        if (allowsCoreThreadTimeOut() || !SuperThreadPool.INSTANCE.getAllowAllCoreThreadTimeOut()) {
            return;
        }
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long max = Math.max(30L, getKeepAliveTime(timeUnit2));
        setKeepAliveTime(max < 1 ? 1L : max, timeUnit2);
        try {
            allowCoreThreadTimeOut(true);
        } catch (Throwable unused) {
        }
    }

    public PThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, (BlockingQueue<Runnable>) BlockingQueueProxy.Companion.proxy(blockingQueue), ThreadFactoryProxy.Companion.proxy(threadFactory, 2));
        if (allowsCoreThreadTimeOut() || !SuperThreadPool.INSTANCE.getAllowAllCoreThreadTimeOut()) {
            return;
        }
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long max = Math.max(30L, getKeepAliveTime(timeUnit2));
        setKeepAliveTime(max < 1 ? 1L : max, timeUnit2);
        try {
            allowCoreThreadTimeOut(true);
        } catch (Throwable unused) {
        }
    }

    public PThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, BlockingQueueProxy.Companion.proxy(blockingQueue), ThreadFactoryProxy.Companion.proxy(threadFactory, 2), rejectedExecutionHandler);
        if (allowsCoreThreadTimeOut() || !SuperThreadPool.INSTANCE.getAllowAllCoreThreadTimeOut()) {
            return;
        }
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long max = Math.max(30L, getKeepAliveTime(timeUnit2));
        setKeepAliveTime(max < 1 ? 1L : max, timeUnit2);
        try {
            allowCoreThreadTimeOut(true);
        } catch (Throwable unused) {
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        IRunnableMonitor iRunnableMonitor = PThreadExecutorsUtils.runnableMonitor;
        if (iRunnableMonitor != null) {
            iRunnableMonitor.afterExecuteRunnable(runnable);
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
    public void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        IRunnableMonitor iRunnableMonitor = PThreadExecutorsUtils.runnableMonitor;
        if (iRunnableMonitor != null) {
            iRunnableMonitor.beforeExecuteRunnable(runnable);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable command) {
        o.LJIIJ(command, "command");
        PThreadPoolExecutorInject pThreadPoolExecutorInject = PThreadExecutorsUtils.pThreadPoolExecutorInject;
        if (pThreadPoolExecutorInject != null) {
            pThreadPoolExecutorInject.beforeExecute(command);
        }
        super.execute(command);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void finalize() {
        super.finalize();
        shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public BlockingQueue<Runnable> getQueue() {
        BlockingQueue<Runnable> queue = super.getQueue();
        if (queue instanceof BlockingQueueProxy) {
            return ((BlockingQueueProxy) queue).getDelegate$threadpool_plugin_base_release();
        }
        o.LJFF(queue, "queue");
        return queue;
    }

    public final boolean isWorkQueueEmpty() {
        return getQueue().isEmpty();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void setThreadFactory(ThreadFactory threadFactory) {
        super.setThreadFactory(ThreadFactoryProxy.Companion.proxy(threadFactory, 2));
    }
}
