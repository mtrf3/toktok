package X;

import android.os.Looper;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.5jA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142885jA implements InterfaceC142865j8 {
    public CountDownLatch LIZIZ;
    public final String LIZ = "publish_cover_generate_tag";
    public final List<Runnable> LIZJ = FII.LIZ();

    @Override // X.InterfaceC142865j8
    public final void LIZIZ() {
        this.LIZIZ = new CountDownLatch(1);
        G8G.LIZ.start(this.LIZ, "generate cover start");
    }

    @Override // X.InterfaceC142865j8
    public final void LIZJ() {
        G8G.LIZ.step(this.LIZ, "generate cover end");
        CountDownLatch countDownLatch = this.LIZIZ;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            List<Runnable> callbacks = this.LIZJ;
            o.LJIIIIZZ(callbacks, "callbacks");
            Iterator<Runnable> it = callbacks.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        } else {
            List<Runnable> callbacks2 = this.LIZJ;
            o.LJIIIIZZ(callbacks2, "callbacks");
            Iterator<Runnable> it2 = callbacks2.iterator();
            while (it2.hasNext()) {
                ExecutorC142245i8.LJLILLLLZI.execute(it2.next());
            }
        }
        this.LIZJ.clear();
        G8G.LIZ.end(this.LIZ, "generate cover clear task");
    }

    @Override // X.InterfaceC142865j8
    public final boolean LIZLLL() {
        CountDownLatch countDownLatch = this.LIZIZ;
        if (countDownLatch == null || countDownLatch.getCount() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC142865j8
    public final boolean LIZ(long j) {
        CountDownLatch countDownLatch = this.LIZIZ;
        boolean z = true;
        if (countDownLatch != null) {
            try {
                z = countDownLatch.await(j, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
            }
            this.LIZIZ = null;
        }
        return z;
    }

    public final synchronized void LJ(Runnable runnable) {
        if (LIZLLL()) {
            runnable.run();
        } else {
            this.LIZJ.add(runnable);
        }
    }
}
