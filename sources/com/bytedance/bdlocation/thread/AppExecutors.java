package com.bytedance.bdlocation.thread;

import X.C16880lQ;
import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public class AppExecutors {
    public static volatile AppExecutors instance;
    public final Executor DISK_IO;
    public final Executor MAIN_THREAD;
    public final Executor NETWORK_IO;

    /* loaded from: classes7.dex */
    public static class MainThreadExecutor implements Executor {
        public Handler mMainThreadHandler;

        public MainThreadExecutor() {
            this.mMainThreadHandler = new Handler(C16880lQ.LLJJJJ());
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.mMainThreadHandler.post(runnable);
        }
    }

    public static AppExecutors getInstance() {
        if (instance == null) {
            synchronized (AppExecutors.class) {
                if (instance == null) {
                    instance = new AppExecutors(C16880lQ.LLLLZLLIL(), LocationFixedThreadPool.newFixedThreadPool(3), new MainThreadExecutor());
                }
            }
        }
        return instance;
    }

    public boolean isMainThread() {
        if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
            return true;
        }
        return false;
    }

    public Executor diskIO() {
        return this.DISK_IO;
    }

    public Executor mainThread() {
        return this.MAIN_THREAD;
    }

    public Executor networkIO() {
        return this.NETWORK_IO;
    }

    public AppExecutors(Executor executor, Executor executor2, Executor executor3) {
        this.DISK_IO = executor;
        this.NETWORK_IO = executor2;
        this.MAIN_THREAD = executor3;
    }
}
