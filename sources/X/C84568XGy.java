package X;

import X.InterfaceC199277rv;
import kotlin.jvm.internal.o;

/* renamed from: X.XGy, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84568XGy<D extends InterfaceC199277rv> implements XHD {
    public static final C84559XGp LIZJ = new C84559XGp();
    public final D LIZIZ;

    @Override // X.XHD
    public final XHG<?> getKey() {
        return LIZJ;
    }

    public C84568XGy(D d) {
        this.LIZIZ = d;
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
