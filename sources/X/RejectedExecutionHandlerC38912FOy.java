package X;

import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.FOy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class RejectedExecutionHandlerC38912FOy implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        PThreadExecutorsUtils.newCachedThreadPool(new DefaultThreadFactory("AppLogExecutors$1")).execute(runnable);
    }
}
