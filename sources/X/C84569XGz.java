package X;

import X.InterfaceC199367s4;
import X.InterfaceC57356MfA;
import kotlin.jvm.internal.o;

/* renamed from: X.XGz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84569XGz<DTO extends InterfaceC199367s4, PO, Q extends InterfaceC57356MfA<DTO>> implements XHD {
    public static final C84551XGh LIZJ = new C84551XGh();
    public final C57354Mf8<DTO, PO, Q> LIZIZ;

    @Override // X.XHD
    public final XHG<?> getKey() {
        return LIZJ;
    }

    public C84569XGz(C57354Mf8<DTO, PO, Q> c57354Mf8) {
        this.LIZIZ = c57354Mf8;
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
