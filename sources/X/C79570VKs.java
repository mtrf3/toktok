package X;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.VKs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79570VKs extends AbstractExecutorService {
    public static final Class<?> LJLJLJ = C79570VKs.class;
    public final String LJLIL;
    public final Executor LJLILLLLZI;
    public final BlockingQueue<Runnable> LJLJJI;
    public volatile int LJLJI = 1;
    public final RunnableC79571VKt LJLJJL = new RunnableC79571VKt(this);
    public final AtomicInteger LJLJJLL = new AtomicInteger(0);
    public final AtomicInteger LJLJL = new AtomicInteger(0);

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    public final void LIZ() {
        int i = this.LJLJJLL.get();
        while (i < this.LJLJI) {
            int i2 = i + 1;
            boolean compareAndSet = this.LJLJJLL.compareAndSet(i, i2);
            Class<?> cls = LJLJLJ;
            if (compareAndSet) {
                W58.LJIILIIL(cls, "%s: starting worker %d of %d", this.LJLIL, Integer.valueOf(i2), Integer.valueOf(this.LJLJI));
                this.LJLILLLLZI.execute(this.LJLJJL);
                return;
            } else {
                W58.LJIIJJI(cls, "%s: race in startWorkerIfNeeded; retrying", this.LJLIL);
                i = this.LJLJJLL.get();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable != null) {
            if (this.LJLJJI.offer(runnable)) {
                int size = this.LJLJJI.size();
                int i = this.LJLJL.get();
                if (size > i && this.LJLJL.compareAndSet(i, size)) {
                    W58.LJIIL(LJLJLJ, "%s: max pending work in queue = %d", this.LJLIL, Integer.valueOf(size));
                }
                LIZ();
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLIL);
            LIZ.append(" queue is full, size=");
            LIZ.append(this.LJLJJI.size());
            throw new RejectedExecutionException(X1D.LIZIZ(LIZ));
        }
        throw new NullPointerException("runnable parameter is null");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public C79570VKs(String str, Executor executor, BlockingQueue blockingQueue) {
        this.LJLIL = str;
        this.LJLILLLLZI = executor;
        this.LJLJJI = blockingQueue;
    }
}
