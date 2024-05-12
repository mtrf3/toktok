package com.byted.cast.common.threadpool;

import X.C16880lQ;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes29.dex */
public class CastScheduledThreadPoolExecutor extends PThreadScheduledThreadPoolExecutor {
    public static final String TAG = C16880lQ.LJLLJ(CastScheduledThreadPoolExecutor.class);

    public CastScheduledThreadPoolExecutor(int i) {
        this(i, new CastThreadFactory(TAG));
    }

    public CastScheduledThreadPoolExecutor(int i, RejectedExecutionHandler rejectedExecutionHandler) {
        this(i, new CastThreadFactory(TAG), rejectedExecutionHandler);
    }

    public CastScheduledThreadPoolExecutor(int i, ThreadFactory threadFactory) {
        this(i, threadFactory, new ThreadPoolExecutor.AbortPolicy());
    }

    public CastScheduledThreadPoolExecutor(int i, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, threadFactory, rejectedExecutionHandler);
    }
}
