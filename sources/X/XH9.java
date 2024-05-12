package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XH9 implements XH8 {
    public final XH8 LIZIZ;
    public final XHD LIZJ;

    @Override // X.XH8
    public final <E extends XHD> E LIZ(XHG<E> xhg) {
        XH9 xh9 = this;
        while (true) {
            E e = (E) xh9.LIZJ.LIZ(xhg);
            if (e != null) {
                return e;
            }
            XH8 xh8 = xh9.LIZIZ;
            if (xh8 instanceof XH9) {
                xh9 = (XH9) xh8;
            } else {
                return (E) xh8.LIZ(xhg);
            }
        }
    }

    @Override // X.XH8
    public final XH8 LIZJ(XHD xhd) {
        return XHE.LIZ(this, xhd);
    }

    @Override // X.XH8
    public final XH8 LIZLLL(XHG<?> key) {
        o.LJIIIZ(key, "key");
        if (this.LIZJ.LIZ(key) != null) {
            return this.LIZIZ;
        }
        XH8 LIZLLL = this.LIZIZ.LIZLLL(key);
        if (LIZLLL == this.LIZIZ) {
            return this;
        }
        if (LIZLLL == XHC.LIZIZ) {
            return this.LIZJ;
        }
        return new XH9(this.LIZJ, LIZLLL);
    }

    public XH9(XHD element, XH8 left) {
        o.LJIIIZ(left, "left");
        o.LJIIIZ(element, "element");
        this.LIZIZ = left;
        this.LIZJ = element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.XH8
    public final Object LIZIZ(Object obj, XHB operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(this.LIZIZ.LIZIZ(obj, operation), this.LIZJ);
    }
}
