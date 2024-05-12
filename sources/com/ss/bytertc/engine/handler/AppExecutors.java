package com.ss.bytertc.engine.handler;

import X.C16880lQ;
import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes33.dex */
public class AppExecutors {
    public static final AppExecutors INSTANCE = new AppExecutors(new MainThreadExecutor());
    public final Executor mMainThread;

    /* loaded from: classes33.dex */
    public static class MainThreadExecutor implements Executor {
        public Handler mainThreadHandler;

        public MainThreadExecutor() {
            this.mainThreadHandler = new Handler(C16880lQ.LLJJJJ());
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.mainThreadHandler.post(runnable);
        }
    }

    public static AppExecutors getInstance() {
        return INSTANCE;
    }

    public Executor mainThread() {
        return this.mMainThread;
    }

    public AppExecutors(Executor executor) {
        this.mMainThread = executor;
    }
}
