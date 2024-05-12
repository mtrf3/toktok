package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.IoA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47722IoA extends AbstractC47721Io9 {
    public final ReentrantReadWriteLock.ReadLock LIZIZ;
    public final ReentrantReadWriteLock.WriteLock LIZJ;

    public C47722IoA(int i) {
        super(i);
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.LIZIZ = reentrantReadWriteLock.readLock();
        this.LIZJ = reentrantReadWriteLock.writeLock();
    }

    @Override // X.AbstractC47721Io9
    public final void LIZJ(int i) {
        if (i == 1) {
            this.LIZIZ.lock();
        } else {
            if (i != 2) {
                return;
            }
            this.LIZJ.lock();
        }
    }

    @Override // X.AbstractC47721Io9
    public final void LJ(int i) {
        if (i == 1) {
            this.LIZIZ.unlock();
        } else {
            if (i != 2) {
                return;
            }
            this.LIZJ.unlock();
        }
    }

    @Override // X.AbstractC47721Io9
    public final boolean LIZLLL(long j, TimeUnit timeUnit) {
        return this.LIZIZ.tryLock(j, timeUnit);
    }
}
