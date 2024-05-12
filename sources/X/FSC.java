package X;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FSC implements ExecutorService {
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
        List<Runnable> shutdownNow = this.LJLIL.shutdownNow();
        o.LJIIIIZZ(shutdownNow, "delegate.shutdownNow()");
        return shutdownNow;
    }

    public FSC(ExecutorService executorService) {
        this.LJLIL = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        o.LJIIIZ(command, "command");
        C37158EiA.LIZIZ(command, this.LJLIL);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) {
        o.LJIIIZ(tasks, "tasks");
        List<Future<T>> invokeAll = this.LJLIL.invokeAll(tasks);
        o.LJIIIIZZ(invokeAll, "delegate.invokeAll(tasks)");
        return invokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> tasks) {
        o.LJIIIZ(tasks, "tasks");
        return (T) this.LJLIL.invokeAny(tasks);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable task) {
        o.LJIIIZ(task, "task");
        Future<?> submit = this.LJLIL.submit(task);
        o.LJIIIIZZ(submit, "delegate.submit(task)");
        return submit;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> task) {
        o.LJIIIZ(task, "task");
        Future<T> submit = this.LJLIL.submit(task);
        o.LJIIIIZZ(submit, "delegate.submit(task)");
        return submit;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit unit) {
        o.LJIIIZ(unit, "unit");
        return this.LJLIL.awaitTermination(j, unit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable task, T t) {
        o.LJIIIZ(task, "task");
        Future<T> submit = this.LJLIL.submit(task, t);
        o.LJIIIIZZ(submit, "delegate.submit(task, result)");
        return submit;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long j, TimeUnit unit) {
        o.LJIIIZ(tasks, "tasks");
        o.LJIIIZ(unit, "unit");
        List<Future<T>> invokeAll = this.LJLIL.invokeAll(tasks, j, unit);
        o.LJIIIIZZ(invokeAll, "delegate.invokeAll(tasks, timeout, unit)");
        return invokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> tasks, long j, TimeUnit unit) {
        o.LJIIIZ(tasks, "tasks");
        o.LJIIIZ(unit, "unit");
        return (T) this.LJLIL.invokeAny(tasks, j, unit);
    }
}
