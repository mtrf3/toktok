package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes16.dex */
public final class XJP extends XJV<XJO> {
    public final XJQ LIZIZ;

    public XJP(XJQ xjq) {
        this.LIZIZ = xjq;
    }

    @Override // X.XJV
    public final Object LJI(XJO xjo) {
        XJQ xjq = this.LIZIZ;
        if (xjq.LJIILLIIL() == xjq) {
            return null;
        }
        return XJR.LIZ;
    }

    @Override // X.XJV
    public final void LIZLLL(XJO xjo, Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = XJR.LJ;
        } else {
            obj2 = this.LIZIZ;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = XJO.LIZ;
        while (!atomicReferenceFieldUpdater.compareAndSet(xjo, this, obj2) && atomicReferenceFieldUpdater.get(xjo) == this) {
        }
    }
}
