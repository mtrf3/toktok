package com.ss.android.ugc.bytex.pthread.base.proxy;

import android.os.AsyncTask;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public abstract class PthreadAsyncTask<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {
    public static Executor THREAD_POOL_EXECUTOR = new PThreadPoolExecutor(0, 20, 3, TimeUnit.MILLISECONDS, new SynchronousQueue(), new DefaultThreadFactory("PthreadAsyncTask"));

    public static void execute(Runnable runnable) {
        THREAD_POOL_EXECUTOR.execute(runnable);
    }

    public final AsyncTask<Params, Progress, Result> execute1(Params... paramsArr) {
        return executeOnExecutor(THREAD_POOL_EXECUTOR, paramsArr);
    }
}
