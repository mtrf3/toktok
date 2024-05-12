package X;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T1L extends AbstractC73945T0j {
    public final C60692Zt LJLIL;
    public final PriorityBlockingQueue<RunnableC80373Dl> LJLILLLLZI;
    public final C73318Sq2 LJLJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJI.dispose();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJI.LJLILLLLZI;
    }

    @Override // X.AbstractC73945T0j
    public final InterfaceC92693kP LIZIZ(Runnable action) {
        o.LJIIIZ(action, "action");
        return LIZJ(action, 0L, TimeUnit.MILLISECONDS);
    }

    public T1L(C60692Zt taskInfo, PriorityBlockingQueue<RunnableC80373Dl> queue) {
        o.LJIIIZ(taskInfo, "taskInfo");
        o.LJIIIZ(queue, "queue");
        this.LJLIL = taskInfo;
        this.LJLILLLLZI = queue;
        this.LJLJI = new C73318Sq2();
    }

    @Override // X.AbstractC73945T0j
    public final InterfaceC92693kP LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
        o.LJIIIZ(runnable, "runnable");
        o.LJIIIZ(timeUnit, "timeUnit");
        RunnableC80373Dl runnableC80373Dl = new RunnableC80373Dl(this.LJLIL, runnable);
        RunnableC73954T0s runnableC73954T0s = new RunnableC73954T0s(runnableC80373Dl, this.LJLJI);
        runnableC73954T0s.setFuture(new T1O(this, runnableC80373Dl));
        this.LJLJI.LIZ(runnableC73954T0s);
        while (this.LJLILLLLZI.contains(runnableC80373Dl)) {
            this.LJLILLLLZI.remove(runnableC80373Dl);
        }
        this.LJLILLLLZI.offer(runnableC80373Dl, j, timeUnit);
        return runnableC73954T0s;
    }
}
