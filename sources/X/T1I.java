package X;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes13.dex */
public final class T1I extends AbstractC73945T0j {
    public final PriorityBlockingQueue<T1K> LJLIL = new PriorityBlockingQueue<>();
    public final AtomicInteger LJLILLLLZI = new AtomicInteger();
    public final AtomicInteger LJLJI = new AtomicInteger();
    public volatile boolean LJLJJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJJI = true;
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJJI;
    }

    @Override // X.AbstractC73945T0j
    public final InterfaceC92693kP LIZIZ(Runnable runnable) {
        return LJ(AbstractC73945T0j.LIZ(TimeUnit.MILLISECONDS), runnable);
    }

    public final InterfaceC92693kP LJ(long j, Runnable runnable) {
        if (this.LJLJJI) {
            return EnumC73538Sta.INSTANCE;
        }
        T1K t1k = new T1K(runnable, Long.valueOf(j), this.LJLJI.incrementAndGet());
        this.LJLIL.add(t1k);
        if (this.LJLILLLLZI.getAndIncrement() == 0) {
            int i = 1;
            while (!this.LJLJJI) {
                T1K poll = this.LJLIL.poll();
                if (poll == null) {
                    i = this.LJLILLLLZI.addAndGet(-i);
                    if (i == 0) {
                        return EnumC73538Sta.INSTANCE;
                    }
                } else if (!poll.LJLJJI) {
                    poll.LJLIL.run();
                }
            }
            this.LJLIL.clear();
            return EnumC73538Sta.INSTANCE;
        }
        return new C73660SvY(new T1J(this, t1k));
    }

    @Override // X.AbstractC73945T0j
    public final InterfaceC92693kP LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j) + AbstractC73945T0j.LIZ(TimeUnit.MILLISECONDS);
        return LJ(millis, new T1H(runnable, this, millis));
    }
}
