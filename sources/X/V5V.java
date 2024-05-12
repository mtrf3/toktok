package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V5V extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC10180ac, InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ A4T LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V5V(boolean z, A4T a4t, int i) {
        super(3);
        this.LJLIL = z;
        this.LJLILLLLZI = a4t;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC10180ac item, InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        int intValue = num.intValue();
        o.LJIIIZ(item, "$this$item");
        if ((intValue & 81) != 16 || !interfaceC24520xk2.LIZ()) {
            if (this.LJLIL) {
                A4T a4t = this.LJLILLLLZI;
                int i = this.LJLJI;
                interfaceC24520xk2.LJJIIJ(-483455358);
                C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
                C32371Ov c32371Ov = C0YW.LIZJ;
                InterfaceC07760Se.LJJJ.getClass();
                InterfaceC273215k LIZ = C09330Yf.LIZ(c32371Ov, C07730Sb.LJIILIIL, interfaceC24520xk2);
                interfaceC24520xk2.LJJIIJ(-1323940314);
                Object LJIILLIIL = interfaceC24520xk2.LJIILLIIL(AnonymousClass057.LJ);
                Object LJIILLIIL2 = interfaceC24520xk2.LJIILLIIL(AnonymousClass057.LJIIJ);
                InterfaceC015404g interfaceC015404g = (InterfaceC015404g) interfaceC24520xk2.LJIILLIIL(AnonymousClass057.LJIILJJIL);
                InterfaceC03730Cr.LJ.getClass();
                C46041rM c46041rM = C03720Cq.LIZIZ;
                C40431iJ LJIIL = C56509MFt.LJIIL(c1m1);
                if (interfaceC24520xk2.LJJ() instanceof InterfaceC24420xa) {
                    interfaceC24520xk2.LJIJI();
                    if (interfaceC24520xk2.LJIJJLI()) {
                        interfaceC24520xk2.LJJI(c46041rM);
                    } else {
                        interfaceC24520xk2.LIZIZ();
                    }
                    interfaceC24520xk2.LJJIIZI();
                    C24830yF.LIZ(interfaceC24520xk2, LIZ, C03720Cq.LJ);
                    C24830yF.LIZ(interfaceC24520xk2, LJIILLIIL, C03720Cq.LIZLLL);
                    C24830yF.LIZ(interfaceC24520xk2, LJIILLIIL2, C03720Cq.LJFF);
                    C17280m4.LIZIZ(0, LJIIL, V1I.LIZIZ(interfaceC24520xk2, interfaceC015404g, C03720Cq.LJI, interfaceC24520xk2), interfaceC24520xk2, 2058660585, -1163856341);
                    V5R.LJ(a4t, null, null, interfaceC24520xk2, (i >> 3) & 14, 6);
                    C79057V0z.LJ(C09290Yb.LJIIIIZZ(c1m1, 8), interfaceC24520xk2, 6);
                    interfaceC24520xk2.LJJIJIIJIL();
                    interfaceC24520xk2.LJJIJIIJIL();
                    interfaceC24520xk2.LJIJ();
                    interfaceC24520xk2.LJJIJIIJIL();
                    interfaceC24520xk2.LJJIJIIJIL();
                } else {
                    C78929UyL.LJIILJJIL();
                    throw null;
                }
            }
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
