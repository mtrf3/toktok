package com.ss.mediakit.net;

import X.X1D;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public class AVMDLThreadPool {
    public static volatile ThreadPoolExecutor mExecutorInstance;
    public static Deque<AsyncRunnable> mReadyRunnables = new ArrayDeque();
    public static Deque<AsyncRunnable> mRunningRunnables = new ArrayDeque();

    /* loaded from: classes9.dex */
    public static class AsyncRunnable implements Runnable {
        public Runnable mRunnable;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_mediakit_net_AVMDLThreadPool$AsyncRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_mediakit_net_AVMDLThreadPool$AsyncRunnable__run$___twin___() {
            this.mRunnable.run();
            AVMDLThreadPool._finished(this);
        }

        public AsyncRunnable(Runnable runnable) {
            this.mRunnable = runnable;
        }

        public static void com_ss_mediakit_net_AVMDLThreadPool$AsyncRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AsyncRunnable asyncRunnable) {
            boolean LIZ;
            try {
                asyncRunnable.com_ss_mediakit_net_AVMDLThreadPool$AsyncRunnable__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    public static void _promoteRunnable() {
        if (mReadyRunnables.size() > 0) {
            Iterator<AsyncRunnable> it = mReadyRunnables.iterator();
            if (it.hasNext()) {
                AsyncRunnable next = it.next();
                it.remove();
                mRunningRunnables.add(next);
                mExecutorInstance.execute(next);
            }
        }
    }

    public static ThreadPoolExecutor getExecutorInstance() {
        if (mExecutorInstance == null) {
            synchronized (AVMDLThreadPool.class) {
                if (mExecutorInstance == null) {
                    mExecutorInstance = new PThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new DefaultThreadFactory("AVMDLThreadPool"));
                }
            }
        }
        return mExecutorInstance;
    }

    public static int getPoolSize() {
        if (mExecutorInstance == null) {
            getExecutorInstance();
        }
        return mExecutorInstance.getPoolSize();
    }

    public static void shutdown() {
        if (mExecutorInstance != null) {
            mExecutorInstance.shutdown();
        }
    }

    public static synchronized void _finished(AsyncRunnable asyncRunnable) {
        synchronized (AVMDLThreadPool.class) {
            mRunningRunnables.remove(asyncRunnable);
            _promoteRunnable();
        }
    }

    public static synchronized Future addExecuteTask(Runnable runnable) {
        synchronized (AVMDLThreadPool.class) {
            if (runnable == null) {
                return null;
            }
            if (mExecutorInstance == null) {
                getExecutorInstance();
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("addExecuteTask,cur thread num:");
            LIZ.append(getPoolSize());
            AVMDLLog.d("AVMDLThreadPool", X1D.LIZIZ(LIZ));
            AsyncRunnable asyncRunnable = new AsyncRunnable(runnable);
            if (mRunningRunnables.size() >= 64) {
                mReadyRunnables.add(asyncRunnable);
                return null;
            }
            mRunningRunnables.add(asyncRunnable);
            return mExecutorInstance.submit(asyncRunnable);
        }
    }

    public static void setExecutorInstance(ThreadPoolExecutor threadPoolExecutor) {
        synchronized (AVMDLThreadPool.class) {
            mExecutorInstance = threadPoolExecutor;
        }
    }
}
