package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Ew4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38020Ew4 extends PThreadPoolExecutor {
    public static final RejectedExecutionHandler LJLIL = new ThreadPoolExecutor.AbortPolicy();

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final void shutdown() {
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return new ArrayList();
    }

    public C38020Ew4(int i, int i2, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, 30L, timeUnit, blockingQueue, threadFactory, LJLIL);
    }

    public C38020Ew4(int i, int i2, TimeUnit timeUnit, BlockingQueue blockingQueue, FOU fou, RejectedExecutionHandlerC38021Ew5 rejectedExecutionHandlerC38021Ew5) {
        super(i, i2, 30L, timeUnit, blockingQueue, fou, rejectedExecutionHandlerC38021Ew5);
    }
}
