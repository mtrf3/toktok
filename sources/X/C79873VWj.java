package X;

import android.os.Handler;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* renamed from: X.VWj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79873VWj<T> {
    public final Executor LIZ;
    public C79874VWk LIZIZ;
    public final java.util.Set<InterfaceC04760Gq<T>> LIZJ;
    public final java.util.Set<InterfaceC04760Gq<Throwable>> LIZLLL;
    public final Handler LJ;
    public final FutureTask<C0GQ<T>> LJFF;
    public volatile C0GQ<T> LJI;

    public C79873VWj(Callable<C0GQ<T>> callable) {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.LIZ = newCachedThreadPool;
        this.LIZJ = new LinkedHashSet(1);
        this.LIZLLL = new LinkedHashSet(1);
        this.LJ = new Handler(C16880lQ.LLJJJJ());
        this.LJI = null;
        FutureTask<C0GQ<T>> futureTask = new FutureTask<>(callable);
        this.LJFF = futureTask;
        newCachedThreadPool.execute(futureTask);
        synchronized (this) {
            C79874VWk c79874VWk = this.LIZIZ;
            if ((c79874VWk == null || !c79874VWk.isAlive()) && this.LJI == null) {
                C79874VWk c79874VWk2 = new C79874VWk(this);
                this.LIZIZ = c79874VWk2;
                c79874VWk2.start();
            }
        }
    }
}
