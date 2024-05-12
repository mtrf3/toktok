package X;

import kotlin.jvm.internal.AqS177S0100000_11;

/* renamed from: X.PfM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65012PfM<ResponseT> extends AbstractC64960PeW<ResponseT, Object> {
    public final InterfaceC65013PfN<ResponseT, InterfaceC65079PgR<ResponseT>> LIZLLL;
    public final boolean LJ;

    @Override // X.AbstractC64960PeW
    public final Object LIZJ(C64639PYl c64639PYl, Object[] objArr) {
        InterfaceC65079PgR interfaceC65079PgR = (InterfaceC65079PgR) this.LIZLLL.LIZIZ(c64639PYl);
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) objArr[objArr.length - 1];
        try {
            if (this.LJ) {
                XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
                xks.LJIILIIL(new AqS177S0100000_11(interfaceC65079PgR, 22));
                interfaceC65079PgR.LLLZ(new PZG(xks));
                return xks.LJIIJJI();
            }
            XKS xks2 = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
            xks2.LJIILIIL(new AqS177S0100000_11(interfaceC65079PgR, 21));
            interfaceC65079PgR.LLLZ(new PZE(xks2));
            return xks2.LJIIJJI();
        } catch (Exception e) {
            return C65310PkA.LIZ(e, interfaceC67352kd);
        }
    }

    public C65012PfM(C64646PYs c64646PYs, InterfaceC48134Iuo interfaceC48134Iuo, InterfaceC65017PfR interfaceC65017PfR, InterfaceC65013PfN interfaceC65013PfN) {
        super(c64646PYs, interfaceC48134Iuo, interfaceC65017PfR);
        this.LIZLLL = interfaceC65013PfN;
        this.LJ = false;
    }
}
