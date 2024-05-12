package X;

import X.InterfaceC57357MfB;
import kotlin.jvm.internal.o;

/* renamed from: X.XGw, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84566XGw<D extends InterfaceC57357MfB> implements XHD {
    public static final C84565XGv LIZJ = new C84565XGv();
    public final InterfaceC57361MfF<D> LIZIZ;

    @Override // X.XHD
    public final XHG<?> getKey() {
        return LIZJ;
    }

    public C84566XGw(InterfaceC57361MfF<D> interfaceC57361MfF) {
        this.LIZIZ = interfaceC57361MfF;
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
