package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.IoB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47723IoB extends AbstractC47721Io9 {
    public final ReentrantLock LIZIZ;

    public C47723IoB(int i) {
        super(i);
        this.LIZIZ = new ReentrantLock();
    }

    @Override // X.AbstractC47721Io9
    public final void LIZJ(int i) {
        this.LIZIZ.lock();
    }

    @Override // X.AbstractC47721Io9
    public final void LJ(int i) {
        this.LIZIZ.unlock();
    }

    @Override // X.AbstractC47721Io9
    public final boolean LIZLLL(long j, TimeUnit timeUnit) {
        return this.LIZIZ.tryLock(j, timeUnit);
    }
}
