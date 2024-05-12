package com.byted.cast.common.threadpool;

import com.byted.cast.common.Monitor;
import java.util.HashMap;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes29.dex */
public class CastDiscardOldestPolicy extends ThreadPoolExecutor.DiscardOldestPolicy {
    @Override // java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy, java.util.concurrent.RejectedExecutionHandler
    public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        super.rejectedExecution(runnable, threadPoolExecutor);
        HashMap hashMap = new HashMap();
        hashMap.put("executor", threadPoolExecutor.toString());
        ThreadFactory threadFactory = threadPoolExecutor.getThreadFactory();
        if (threadFactory instanceof CastThreadFactory) {
            hashMap.put("taskName", ((CastThreadFactory) threadFactory).getNamePrefix());
        }
        Monitor.sendEvent("bytecast_threadpool_discard_oldest_policy_error", hashMap);
    }
}
