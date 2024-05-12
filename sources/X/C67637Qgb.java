package X;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.Qgb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67637Qgb {
    public static <TResult> TResult LIZ(AbstractC67638Qgc<TResult> abstractC67638Qgc) {
        QH7.LJII("Must not be called on the main application thread");
        QH7.LJIIIZ(abstractC67638Qgc, "Task must not be null");
        if (abstractC67638Qgc.LJIIL()) {
            return (TResult) LJFF(abstractC67638Qgc);
        }
        C67640Qge c67640Qge = new C67640Qge();
        ExecutorC67642Qgg executorC67642Qgg = C67641Qgf.LIZIZ;
        abstractC67638Qgc.LJFF(executorC67642Qgg, c67640Qge);
        abstractC67638Qgc.LIZLLL(executorC67642Qgg, c67640Qge);
        abstractC67638Qgc.LIZ(executorC67642Qgg, c67640Qge);
        c67640Qge.LJLIL.await();
        return (TResult) LJFF(abstractC67638Qgc);
    }

    public static C67646Qgk LIZLLL(Exception exc) {
        C67646Qgk c67646Qgk = new C67646Qgk();
        c67646Qgk.LJIIZILJ(exc);
        return c67646Qgk;
    }

    public static C67646Qgk LJ(Object obj) {
        C67646Qgk c67646Qgk = new C67646Qgk();
        c67646Qgk.LJIJ(obj);
        return c67646Qgk;
    }

    public static <TResult> TResult LJFF(AbstractC67638Qgc<TResult> abstractC67638Qgc) {
        if (abstractC67638Qgc.LJIILIIL()) {
            return abstractC67638Qgc.LJIIIZ();
        }
        if (abstractC67638Qgc.LJIIJJI()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(abstractC67638Qgc.LJIIIIZZ());
    }

    public static C67646Qgk LIZJ(Callable callable, Executor executor) {
        QH7.LJIIIZ(executor, "Executor must not be null");
        C67646Qgk c67646Qgk = new C67646Qgk();
        executor.execute(new RunnableC67639Qgd(c67646Qgk, callable));
        return c67646Qgk;
    }

    public static <TResult> TResult LIZIZ(AbstractC67638Qgc<TResult> abstractC67638Qgc, long j, TimeUnit timeUnit) {
        QH7.LJII("Must not be called on the main application thread");
        QH7.LJIIIZ(abstractC67638Qgc, "Task must not be null");
        QH7.LJIIIZ(timeUnit, "TimeUnit must not be null");
        if (abstractC67638Qgc.LJIIL()) {
            return (TResult) LJFF(abstractC67638Qgc);
        }
        C67640Qge c67640Qge = new C67640Qge();
        ExecutorC67642Qgg executorC67642Qgg = C67641Qgf.LIZIZ;
        abstractC67638Qgc.LJFF(executorC67642Qgg, c67640Qge);
        abstractC67638Qgc.LIZLLL(executorC67642Qgg, c67640Qge);
        abstractC67638Qgc.LIZ(executorC67642Qgg, c67640Qge);
        if (c67640Qge.LJLIL.await(j, timeUnit)) {
            return (TResult) LJFF(abstractC67638Qgc);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }
}
