package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.FOx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38911FOx extends PThreadPoolExecutor {
    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final void shutdown() {
    }

    static {
        new ThreadPoolExecutor.AbortPolicy();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return new ArrayList();
    }

    public C38911FOx(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, FOX fox, RejectedExecutionHandlerC38912FOy rejectedExecutionHandlerC38912FOy) {
        super(i, i2, j, timeUnit, blockingQueue, fox, rejectedExecutionHandlerC38912FOy);
    }
}
