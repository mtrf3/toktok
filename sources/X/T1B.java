package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes13.dex */
public final class T1B extends AbstractC73945T0j {
    public final T1C LJLILLLLZI;
    public final T1D LJLJI;
    public final AtomicBoolean LJLJJI = new AtomicBoolean();
    public final C73318Sq2 LJLIL = new C73318Sq2();

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        if (this.LJLJJI.compareAndSet(false, true)) {
            this.LJLIL.dispose();
            T1C t1c = this.LJLILLLLZI;
            T1D t1d = this.LJLJI;
            t1c.getClass();
            t1d.LJLJI = System.nanoTime() + t1c.LJLIL;
            t1c.LJLILLLLZI.offer(t1d);
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJJI.get();
    }

    public T1B(T1C t1c) {
        T1D t1d;
        this.LJLILLLLZI = t1c;
        if (t1c.LJLJI.LJLILLLLZI) {
            t1d = T1A.LJI;
            this.LJLJI = t1d;
        }
        while (true) {
            if (!t1c.LJLILLLLZI.isEmpty()) {
                t1d = t1c.LJLILLLLZI.poll();
                if (t1d != null) {
                    break;
                }
            } else {
                t1d = new T1D(t1c.LJLJJLL);
                t1c.LJLJI.LIZ(t1d);
                break;
            }
        }
        this.LJLJI = t1d;
    }

    @Override // X.AbstractC73945T0j
    public final InterfaceC92693kP LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.LJLIL.LJLILLLLZI) {
            return EnumC73538Sta.INSTANCE;
        }
        return this.LJLJI.LJ(runnable, j, timeUnit, this.LJLIL);
    }
}
