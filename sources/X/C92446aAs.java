package X;

import java.util.List;
import kotlin.jvm.internal.IDqS445S0100000_31;

/* renamed from: X.aAs, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92446aAs extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ InterfaceC24760y8<Integer> LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final /* synthetic */ List<String> LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92446aAs(int i, InterfaceC24760y8 interfaceC24760y8, List list, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns) {
        super(2);
        this.LJLIL = interfaceC24760y8;
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = list;
        this.LJLJJI = interfaceC88472Yns;
        this.LJLJJL = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            C32541Pm LJIIIZ = C1E5.LJIIIZ(this.LJLIL.getValue().intValue(), interfaceC24520xk2, 2);
            C44031o7 c44031o7 = AnonymousClass057.LJ;
            float LJJJLL = ((InterfaceC23370vt) interfaceC24520xk2.LJIILLIIL(c44031o7)).LJJJLL(C91952a2u.LIZ);
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLILLLLZI;
            List<String> list = this.LJLJI;
            InterfaceC24760y8<Integer> interfaceC24760y8 = this.LJLIL;
            InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns = this.LJLJJI;
            int i = this.LJLJJL;
            interfaceC24520xk2.LJJIIJ(-483455358);
            C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
            C32371Ov c32371Ov = C0YW.LIZJ;
            InterfaceC07760Se.LJJJ.getClass();
            InterfaceC273215k LIZ = C09330Yf.LIZ(c32371Ov, C07730Sb.LJIILIIL, interfaceC24520xk2);
            interfaceC24520xk2.LJJIIJ(-1323940314);
            Object LJIILLIIL = interfaceC24520xk2.LJIILLIIL(c44031o7);
            Object LJIILLIIL2 = interfaceC24520xk2.LJIILLIIL(AnonymousClass057.LJIIJ);
            Object LJIILLIIL3 = interfaceC24520xk2.LJIILLIIL(AnonymousClass057.LJIILJJIL);
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
                C24830yF.LIZ(interfaceC24520xk2, LJIILLIIL3, C03720Cq.LJI);
                interfaceC24520xk2.LJIIIIZZ();
                LJIIL.invoke(new C24440xc(interfaceC24520xk2), interfaceC24520xk2, 0);
                interfaceC24520xk2.LJJIIJ(2058660585);
                interfaceC24520xk2.LJJIIJ(-1163856341);
                C92112a5U.LIZ(null, false, null, true, C1DJ.LJ(interfaceC24520xk2, -819889188, new IDqS445S0100000_31(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 0)), C92415aAN.LJLIL, false, C91731ZzL.LIZ, interfaceC24520xk2, 12807168, 71);
                C10160aa.LIZ(null, LJIIIZ, null, false, null, null, null, false, new C92442aAo(list, interfaceC24760y8, interfaceC88472Yns, i, LJJJLL), interfaceC24520xk2, 0, 253);
                interfaceC24520xk2.LJJIJIIJIL();
                interfaceC24520xk2.LJJIJIIJIL();
                interfaceC24520xk2.LJIJ();
                interfaceC24520xk2.LJJIJIIJIL();
                interfaceC24520xk2.LJJIJIIJIL();
            } else {
                C78929UyL.LJIILJJIL();
                throw null;
            }
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
