package X;

import kotlin.jvm.internal.AqS177S0100000_11;

/* renamed from: X.PfL, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65011PfL<ResponseT> extends AbstractC64960PeW<ResponseT, Object> {
    public final InterfaceC65013PfN<ResponseT, InterfaceC65079PgR<ResponseT>> LIZLLL;

    @Override // X.AbstractC64960PeW
    public final Object LIZJ(C64639PYl c64639PYl, Object[] objArr) {
        InterfaceC65079PgR interfaceC65079PgR = (InterfaceC65079PgR) this.LIZLLL.LIZIZ(c64639PYl);
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) objArr[objArr.length - 1];
        try {
            XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
            xks.LJIILIIL(new AqS177S0100000_11(interfaceC65079PgR, 23));
            interfaceC65079PgR.LLLZ(new C64652PYy(xks));
            return xks.LJIIJJI();
        } catch (Exception e) {
            return C65310PkA.LIZ(e, interfaceC67352kd);
        }
    }

    public C65011PfL(C64646PYs c64646PYs, InterfaceC48134Iuo interfaceC48134Iuo, InterfaceC65017PfR<PVM, ResponseT> interfaceC65017PfR, InterfaceC65013PfN<ResponseT, InterfaceC65079PgR<ResponseT>> interfaceC65013PfN) {
        super(c64646PYs, interfaceC48134Iuo, interfaceC65017PfR);
        this.LIZLLL = interfaceC65013PfN;
    }
}
