package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.XJl, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC84633XJl extends AbstractC84634XJm {
    public abstract Object LIZJ(C84629XJh c84629XJh);

    public abstract void LIZLLL(C84629XJh c84629XJh);

    public abstract void LJ(C84632XJk c84632XJk);

    public abstract C84629XJh LJFF();

    public abstract C84629XJh LJI();

    public void LJIIIIZZ(C84629XJh c84629XJh) {
    }

    public abstract boolean LJIIIZ(Object obj);

    public abstract C84629XJh LJIIJ(XJU xju);

    public abstract X9N LJIIJJI(C84629XJh c84629XJh);

    @Override // X.AbstractC84634XJm
    public final Object LIZIZ(XJV<?> xjv) {
        boolean z;
        while (true) {
            C84629XJh LJIIJ = LJIIJ(xjv);
            if (LJIIJ == null) {
                return XJW.LIZIZ;
            }
            Object obj = LJIIJ._next;
            if (obj == xjv) {
                return null;
            }
            boolean z2 = false;
            if (xjv._consensus != XJW.LIZ) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            if (obj instanceof XJU) {
                XJU xju = (XJU) obj;
                if (xjv.LIZIZ(xju)) {
                    return XJW.LIZIZ;
                }
                xju.LIZJ(LJIIJ);
            } else {
                Object LIZJ = LIZJ(LJIIJ);
                if (LIZJ != null) {
                    return LIZJ;
                }
                if (LJIIIZ(obj)) {
                    continue;
                } else {
                    C84632XJk c84632XJk = new C84632XJk(LJIIJ, (C84629XJh) obj, this);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C84629XJh.LJLIL;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(LJIIJ, obj, c84632XJk)) {
                            z2 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater.get(LJIIJ) != obj) {
                            break;
                        }
                    }
                    if (z2) {
                        try {
                            if (c84632XJk.LIZJ(LJIIJ) != C84639XJr.LIZ) {
                                return null;
                            }
                        } catch (Throwable th) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C84629XJh.LJLIL;
                            while (!atomicReferenceFieldUpdater2.compareAndSet(LJIIJ, c84632XJk, obj) && atomicReferenceFieldUpdater2.get(LJIIJ) == c84632XJk) {
                            }
                            throw th;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    public Object LJII(C84632XJk c84632XJk) {
        LJ(c84632XJk);
        return null;
    }

    @Override // X.AbstractC84634XJm
    public final void LIZ(XJV<?> xjv, Object obj) {
        boolean z;
        C84629XJh LJI;
        X9N x9n;
        if (obj == null) {
            z = true;
        } else {
            z = false;
        }
        C84629XJh LJFF = LJFF();
        if (LJFF == null || (LJI = LJI()) == null) {
            return;
        }
        if (z) {
            x9n = LJIIJJI(LJI);
        } else {
            x9n = LJI;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C84629XJh.LJLIL;
        while (!atomicReferenceFieldUpdater.compareAndSet(LJFF, xjv, x9n)) {
            if (atomicReferenceFieldUpdater.get(LJFF) != xjv) {
                return;
            }
        }
        if (z) {
            LIZLLL(LJI);
        }
    }
}
