package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes7.dex */
public final class FE9 {
    public final ReentrantReadWriteLock LIZ = new ReentrantReadWriteLock(false);
    public final java.util.Map<String, C35758E1q> LIZIZ = new HashMap();
    public final AtomicInteger LIZJ = new AtomicInteger();

    public FE9() {
        new ArrayList();
    }

    public final void LIZ(int i, int i2, String str, int i3, int i4, int i5) {
        C35758E1q c35758E1q = (C35758E1q) ((HashMap) this.LIZIZ).get(str);
        if (c35758E1q == null) {
            if (((HashMap) this.LIZIZ).size() >= 256) {
                this.LIZJ.incrementAndGet();
                return;
            } else {
                c35758E1q = new C35758E1q(i, i3, i4, i5, str);
                ((HashMap) this.LIZIZ).put(str, c35758E1q);
            }
        }
        if (!c35758E1q.LIZ(i2)) {
            this.LIZJ.incrementAndGet();
        }
    }

    public final void LIZIZ(int i, int i2, String str, int i3, int i4, int i5) {
        this.LIZ.readLock().lock();
        try {
            C35758E1q c35758E1q = (C35758E1q) ((HashMap) this.LIZIZ).get(str);
            if (c35758E1q == null) {
                this.LIZ.readLock().unlock();
                this.LIZ.writeLock().lock();
                try {
                    LIZ(i, i2, str, i3, i4, i5);
                    return;
                } finally {
                    this.LIZ.writeLock().unlock();
                }
            }
            if (!c35758E1q.LIZ(i2)) {
                this.LIZJ.incrementAndGet();
            }
        } finally {
            this.LIZ.readLock().unlock();
        }
    }
}
