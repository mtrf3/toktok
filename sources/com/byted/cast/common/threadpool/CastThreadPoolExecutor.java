package com.byted.cast.common.threadpool;

import X.C16880lQ;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes29.dex */
public class CastThreadPoolExecutor extends PThreadPoolExecutor {
    public static final String TAG = C16880lQ.LJLLJ(CastThreadPoolExecutor.class);
    public static final RejectedExecutionHandler mDefaultRejectedHandler = new CastDiscardOldestPolicy();

    private void init() {
        if (!allowsCoreThreadTimeOut()) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            setKeepAliveTime(Math.max(30L, getKeepAliveTime(timeUnit)), timeUnit);
        }
        try {
            allowCoreThreadTimeOut(true);
        } catch (Throwable unused) {
        }
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor
    public void allowCoreThreadTimeOut(boolean z) {
        super.allowCoreThreadTimeOut(z);
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        super.execute(runnable);
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
    }

    public CastThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
        this(i, i2, j, timeUnit, blockingQueue, new CastThreadFactory(TAG));
    }

    public CastThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, RejectedExecutionHandler rejectedExecutionHandler) {
        this(i, i2, j, timeUnit, blockingQueue, new CastThreadFactory(TAG), rejectedExecutionHandler);
    }

    public CastThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        this(i, i2, j, timeUnit, blockingQueue, threadFactory, mDefaultRejectedHandler);
    }

    public CastThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        init();
    }
}
