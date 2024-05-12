package X;

import Y.ARunnableS25S0200000_6;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: X.FAz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38549FAz extends PThreadPoolExecutor {
    public final int LJLIL;

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        if (this.LJLIL != 1) {
            return super.submit(runnable);
        }
        String LJLLJ = C16880lQ.LJLLJ(runnable.getClass());
        if (LJLLJ.startsWith("AyncGetLogDataRunnable") || LJLLJ.startsWith("AsyncShowEventRunnable")) {
            if (!FB0.LIZ) {
                execute(runnable);
                return null;
            }
            C37179EiV.LJFF.postDelayed(new ARunnableS25S0200000_6(this, runnable, 18), 100L);
            return null;
        }
        return super.submit(runnable);
    }

    public C38549FAz(TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(5, 5, 60L, timeUnit, (BlockingQueue<Runnable>) blockingQueue, new DefaultThreadFactory("NetworkHook$BaseThreadPool"));
        this.LJLIL = 1;
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor
    public final void beforeExecute(Thread thread, Runnable runnable) {
        if (this.LJLIL != 0) {
            super.beforeExecute(thread, runnable);
            return;
        }
        if (FOJ.LIZLLL) {
            C35810E3q.LIZJ("beforeExecute");
            while (FB0.LIZ) {
                FB0.LIZ();
            }
            C35810E3q.LJII();
        }
        super.beforeExecute(thread, runnable);
    }

    public C38549FAz(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, (BlockingQueue<Runnable>) blockingQueue, threadFactory);
        this.LJLIL = 0;
    }
}
