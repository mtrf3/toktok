package X;

import android.os.Handler;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* renamed from: X.VWm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79876VWm<T> {
    public final Executor LIZ;
    public C79875VWl LIZIZ;
    public final java.util.Set<InterfaceC79878VWo<T>> LIZJ;
    public final java.util.Set<InterfaceC79878VWo<Throwable>> LIZLLL;
    public final Handler LJ;
    public final FutureTask<C79877VWn<T>> LJFF;
    public volatile C79877VWn<T> LJI;

    public final synchronized void LIZJ() {
        C79875VWl c79875VWl = this.LIZIZ;
        if ((c79875VWl == null || !c79875VWl.isAlive()) && this.LJI == null) {
            C79875VWl c79875VWl2 = new C79875VWl(this);
            this.LIZIZ = c79875VWl2;
            c79875VWl2.start();
        }
    }

    public C79876VWm(Callable<C79877VWn<T>> callable) {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.LIZ = newCachedThreadPool;
        this.LIZJ = new LinkedHashSet(1);
        this.LIZLLL = new LinkedHashSet(1);
        this.LJ = new Handler(C16880lQ.LLJJJJ());
        this.LJI = null;
        FutureTask<C79877VWn<T>> futureTask = new FutureTask<>(callable);
        this.LJFF = futureTask;
        newCachedThreadPool.execute(futureTask);
        LIZJ();
    }

    public final synchronized void LIZ(InterfaceC79878VWo interfaceC79878VWo) {
        if (this.LJI != null && this.LJI.LIZIZ != null) {
            interfaceC79878VWo.onResult(this.LJI.LIZIZ);
        }
        this.LIZLLL.add(interfaceC79878VWo);
        LIZJ();
    }

    public final synchronized void LIZIZ(InterfaceC79878VWo interfaceC79878VWo) {
        if (this.LJI != null && this.LJI.LIZ != null) {
            interfaceC79878VWo.onResult(this.LJI.LIZ);
        }
        this.LIZJ.add(interfaceC79878VWo);
        LIZJ();
    }
}
