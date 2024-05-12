package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XH1 implements XHD {
    public static final C84552XGi LIZJ = new C84552XGi();
    public final EnumC199577sP LIZIZ;

    @Override // X.XHD
    public final XHG<?> getKey() {
        return LIZJ;
    }

    public XH1(EnumC199577sP value) {
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
