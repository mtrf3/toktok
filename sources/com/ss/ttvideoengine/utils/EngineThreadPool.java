package com.ss.ttvideoengine.utils;

import X.C16880lQ;
import X.C78253UnR;
import X.RunnableC47964Is4;
import X.X1D;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes9.dex */
public class EngineThreadPool {
    public static volatile boolean mEnableLockOptimize;
    public static volatile ThreadPoolExecutor mExecutorInstance;
    public static Deque<RunnableC47964Is4> mReadyRunnables = new ArrayDeque();
    public static Deque<RunnableC47964Is4> mRunningRunnables = new ArrayDeque();
    public static volatile boolean mEnableThreadPoolOptimize = true;

    public static void _promoteRunnable() {
        if (mReadyRunnables.size() > 0) {
            Iterator<RunnableC47964Is4> it = mReadyRunnables.iterator();
            if (it.hasNext()) {
                RunnableC47964Is4 next = it.next();
                it.remove();
                mRunningRunnables.add(next);
                mExecutorInstance.execute(next);
            }
        }
    }

    public static ThreadPoolExecutor getExecutorInstance() {
        if (mExecutorInstance == null) {
            synchronized (EngineThreadPool.class) {
                if (mExecutorInstance == null) {
                    if (mEnableThreadPoolOptimize) {
                        C78253UnR.LJI("EngineThreadPool", "mEnableThreadPoolOptimize true");
                        mExecutorInstance = new PThreadPoolExecutor(5, 5, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new DefaultThreadFactory("EngineThreadPool"));
                        mExecutorInstance.allowCoreThreadTimeOut(true);
                    } else {
                        mExecutorInstance = new PThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new DefaultThreadFactory("EngineThreadPool"));
                    }
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

    public static synchronized void _finished(RunnableC47964Is4 runnableC47964Is4) {
        synchronized (EngineThreadPool.class) {
            mRunningRunnables.remove(runnableC47964Is4);
            _promoteRunnable();
        }
    }

    public static Future addExecuteTask(Runnable runnable) {
        Future addExecuteTaskInternal;
        if (mEnableLockOptimize) {
            return addExecuteTaskInternal(runnable);
        }
        synchronized (EngineThreadPool.class) {
            addExecuteTaskInternal = addExecuteTaskInternal(runnable);
        }
        return addExecuteTaskInternal;
    }

    public static Future addExecuteTaskInternal(Runnable runnable) {
        if (runnable == null) {
            return null;
        }
        if (mExecutorInstance == null) {
            getExecutorInstance();
        }
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("addExecuteTask,pool size:");
            LIZ.append(getPoolSize());
            LIZ.append(", active:");
            LIZ.append(mExecutorInstance.getActiveCount());
            C78253UnR.LJI("EngineThreadPool", X1D.LIZIZ(LIZ));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (mEnableThreadPoolOptimize) {
            return mExecutorInstance.submit(runnable);
        }
        synchronized (EngineThreadPool.class) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("running:");
            LIZ2.append(mRunningRunnables.size());
            LIZ2.append(", ready:");
            LIZ2.append(mReadyRunnables.size());
            C78253UnR.LJI("EngineThreadPool", X1D.LIZIZ(LIZ2));
            RunnableC47964Is4 runnableC47964Is4 = new RunnableC47964Is4(runnable);
            if (mRunningRunnables.size() >= 5) {
                mReadyRunnables.add(runnableC47964Is4);
                return null;
            }
            mRunningRunnables.add(runnableC47964Is4);
            return mExecutorInstance.submit(runnableC47964Is4);
        }
    }

    public static void setExecutorInstance(ThreadPoolExecutor threadPoolExecutor) {
        synchronized (EngineThreadPool.class) {
            mExecutorInstance = threadPoolExecutor;
        }
    }

    public static synchronized void setOptimizeEnabled(boolean z) {
        synchronized (EngineThreadPool.class) {
            mEnableThreadPoolOptimize = z;
        }
    }

    public static void setOptimizeLock(boolean z) {
        mEnableLockOptimize = z;
    }

    public static Future addExecuteTaskSync(Runnable runnable, long j) {
        Future addExecuteTaskSyncInternal;
        if (mEnableLockOptimize) {
            return addExecuteTaskSyncInternal(runnable, j);
        }
        synchronized (EngineThreadPool.class) {
            addExecuteTaskSyncInternal = addExecuteTaskSyncInternal(runnable, j);
        }
        return addExecuteTaskSyncInternal;
    }

    public static Future addExecuteTaskSyncInternal(Runnable runnable, long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addExecuteTaskSync timeout:");
        LIZ.append(j);
        C78253UnR.LJI("EngineThreadPool", X1D.LIZIZ(LIZ));
        Future addExecuteTaskInternal = addExecuteTaskInternal(runnable);
        if (addExecuteTaskInternal != null) {
            try {
                addExecuteTaskInternal.get(j, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                C78253UnR.LIZLLL("EngineThreadPool", "set surface time out");
            }
        }
        return addExecuteTaskInternal;
    }
}
