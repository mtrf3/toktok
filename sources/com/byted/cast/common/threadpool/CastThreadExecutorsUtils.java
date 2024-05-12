package com.byted.cast.common.threadpool;

import X.C16880lQ;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes29.dex */
public class CastThreadExecutorsUtils {
    public static final String TAG = C16880lQ.LJLLJ(CastThreadExecutorsUtils.class);

    /* loaded from: classes29.dex */
    public static class DelegatedExecutorService extends AbstractExecutorService {
        public final ExecutorService mExecutorService;

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            return this.mExecutorService.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            return this.mExecutorService.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            this.mExecutorService.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            return this.mExecutorService.shutdownNow();
        }

        public DelegatedExecutorService(ExecutorService executorService) {
            this.mExecutorService = executorService;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.mExecutorService.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j, TimeUnit timeUnit) {
            return this.mExecutorService.awaitTermination(j, timeUnit);
        }
    }

    public static ExecutorService newCachedThreadPool() {
        return new CastThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue());
    }

    public static ExecutorService newSingleThreadExecutor() {
        return new FinalizableDelegatedExecutorService(new CastThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(128)));
    }

    public static ScheduledExecutorService newSingleThreadScheduledExecutor() {
        return new DelegatedScheduledExecutorService(new PThreadScheduledThreadPoolExecutor(1, new DefaultThreadFactory("CastThreadExecutorsUtils")));
    }

    /* loaded from: classes29.dex */
    public static class FinalizableDelegatedExecutorService extends DelegatedExecutorService {
        public void finalize() {
            super.shutdown();
        }

        public FinalizableDelegatedExecutorService(ExecutorService executorService) {
            super(executorService);
        }
    }

    /* loaded from: classes29.dex */
    public static class DelegatedScheduledExecutorService extends DelegatedExecutorService implements ScheduledExecutorService {
        public final ScheduledExecutorService e;

        public DelegatedScheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.e = scheduledExecutorService;
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.e.schedule(runnable, j, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
            return this.e.schedule(callable, j, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            return this.e.scheduleAtFixedRate(runnable, j, j2, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            return this.e.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
        }
    }

    public static ExecutorService newCachedThreadPool(ThreadFactory threadFactory) {
        return new CastThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
    }

    public static ExecutorService newFixedThreadPool(int i) {
        return new CastThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(128));
    }

    public static ScheduledExecutorService newScheduledThreadPool(int i) {
        return new CastScheduledThreadPoolExecutor(i);
    }

    public static ExecutorService newSingleThreadExecutor(ThreadFactory threadFactory) {
        return new FinalizableDelegatedExecutorService(new CastThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(128), threadFactory));
    }

    public static ScheduledExecutorService newSingleThreadScheduledExecutor(ThreadFactory threadFactory) {
        return new DelegatedScheduledExecutorService(new PThreadScheduledThreadPoolExecutor(1, threadFactory));
    }

    public static ExecutorService newFixedThreadPool(int i, ThreadFactory threadFactory) {
        return new CastThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(128), threadFactory);
    }

    public static ScheduledExecutorService newScheduledThreadPool(int i, ThreadFactory threadFactory) {
        return new CastScheduledThreadPoolExecutor(i, threadFactory);
    }
}
