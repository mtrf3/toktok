package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XH7 implements XHD {
    public static final V89 LIZJ = new V89();
    public final InterfaceC57326Meg LIZIZ;

    @Override // X.XHD
    public final XHG<?> getKey() {
        return LIZJ;
    }

    public XH7(InterfaceC57326Meg interfaceC57326Meg) {
        this.LIZIZ = interfaceC57326Meg;
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
