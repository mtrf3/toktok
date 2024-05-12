package X;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class FSD extends FSE {
    public final ExecutorService LJLIL;

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.LJLIL.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.LJLIL.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.LJLIL.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.LJLIL.shutdownNow();
    }

    public FSD(ExecutorService executorService) {
        executorService.getClass();
        this.LJLIL = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.LJLIL.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.LJLIL.awaitTermination(j, timeUnit);
    }
}
