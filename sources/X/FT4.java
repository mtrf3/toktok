package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FT4 extends PThreadPoolExecutor {
    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        Callable<T> callable2;
        o.LJIIIZ(callable, "callable");
        if (!(callable instanceof Comparable)) {
            callable2 = null;
        } else {
            callable2 = callable;
        }
        return new FT3(callable, (Comparable) callable2);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        Runnable runnable2;
        o.LJIIIZ(runnable, "runnable");
        if (!(runnable instanceof Comparable)) {
            runnable2 = null;
        } else {
            runnable2 = runnable;
        }
        return new FT3(runnable, t, (Comparable) runnable2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FT4(int i, int i2, TimeUnit unit, BlockingQueue blockingQueue) {
        super(i, i2, 8000L, unit, (BlockingQueue<Runnable>) blockingQueue, new DefaultThreadFactory("ComparableThreadPoolExecutor"));
        o.LJIIIZ(unit, "unit");
    }
}
