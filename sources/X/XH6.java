package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XH6 implements XHD {
    public static final V88 LIZJ = new V88();
    public final EnumC78982UzC LIZIZ;

    @Override // X.XHD
    public final XHG<?> getKey() {
        return LIZJ;
    }

    public XH6(EnumC78982UzC value) {
        o.LJIIIZ(value, "value");
        this.LIZIZ = value;
    }

    @Override // X.XHD, X.XH8
    public final <E extends XHD> E LIZ(XHG<E> xhg) {
        return (E) XHA.LIZ(this, xhg);
    }

    @Override // X.XH8
    public final XH8 LIZJ(XHD xhd) {
        return XHE.LIZ(this, xhd);
    }

    @Override // X.XH8
    public final XH8 LIZLLL(XHG<?> xhg) {
        return XHA.LIZIZ(this, xhg);
    }

    @Override // X.XH8
    public final Object LIZIZ(Object obj, XHB operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }
}
