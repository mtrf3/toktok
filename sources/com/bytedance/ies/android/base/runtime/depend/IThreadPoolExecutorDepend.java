package com.bytedance.ies.android.base.runtime.depend;

import java.util.concurrent.ExecutorService;

/* loaded from: classes14.dex */
public interface IThreadPoolExecutorDepend {
    ExecutorService getCPUThreadExecutor();

    ExecutorService getIOThreadExecutor();

    ExecutorService getNormalThreadExecutor();
}
