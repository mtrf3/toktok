package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes16.dex */
public class XJY<E> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater LIZ = AtomicReferenceFieldUpdater.newUpdater(XJY.class, Object.class, "_cur");
    public volatile /* synthetic */ Object _cur = new XJX(8, false);

    public final void LIZIZ() {
        while (true) {
            XJX xjx = (XJX) this._cur;
            if (xjx.LIZIZ()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LIZ;
            XJX<E> LJ = xjx.LJ();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, xjx, LJ) && atomicReferenceFieldUpdater.get(this) == xjx) {
            }
        }
    }

    public final int LIZJ() {
        return ((XJX) this._cur).LIZJ();
    }

    public final E LIZLLL() {
        while (true) {
            XJX xjx = (XJX) this._cur;
            E e = (E) xjx.LJFF();
            if (e != XJX.LJI) {
                return e;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LIZ;
            XJX<E> LJ = xjx.LJ();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, xjx, LJ) && atomicReferenceFieldUpdater.get(this) == xjx) {
            }
        }
    }

    public final boolean LIZ(E e) {
        while (true) {
            XJX xjx = (XJX) this._cur;
            int LIZ2 = xjx.LIZ(e);
            if (LIZ2 == 0) {
                return true;
            }
            if (LIZ2 != 1) {
                if (LIZ2 == 2) {
                    return false;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LIZ;
                XJX<E> LJ = xjx.LJ();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, xjx, LJ) && atomicReferenceFieldUpdater.get(this) == xjx) {
                }
            }
        }
    }
}
