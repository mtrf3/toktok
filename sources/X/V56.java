package X;

import com.ss.android.ugc.aweme.paidcontent.fragments.ReplyFragment;

/* loaded from: classes14.dex */
public final class V56 extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ ReplyFragment LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V56(String str, ReplyFragment replyFragment) {
        super(2);
        this.LJLIL = str;
        this.LJLILLLLZI = replyFragment;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if ((num.intValue() & 11) != 2 || !interfaceC24520xk2.LIZ()) {
            interfaceC24520xk2.LJJIIJ(-492369756);
            Object LJIILL = interfaceC24520xk2.LJIILL();
            InterfaceC24520xk.LIZ.getClass();
            if (LJIILL == C24500xi.LIZIZ) {
                LJIILL = C78966Uyw.LJJJIL("");
                interfaceC24520xk2.LJJIII(LJIILL);
            }
            interfaceC24520xk2.LJJIJIIJIL();
            InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) LJIILL;
            C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
            InterfaceC07790Sh LJIL = C70657RoD.LJIL(C09290Yb.LJII(c1m1), 12, 0.0f, 0.0f, 0.0f, 14);
            String str = this.LJLIL;
            ReplyFragment replyFragment = this.LJLILLLLZI;
            interfaceC24520xk2.LJJIIJ(693286680);
            C32361Ou c32361Ou = C0YW.LIZ;
            InterfaceC07760Se.LJJJ.getClass();
            InterfaceC273215k LIZ = C0YX.LIZ(c32361Ou, C07730Sb.LJIIJ, interfaceC24520xk2);
            interfaceC24520xk2.LJJIIJ(-1323940314);
            Object LJIILLIIL = interfaceC24520xk2.LJIILLIIL(AnonymousClass057.LJ);
            Object LJIILLIIL2 = interfaceC24520xk2.LJIILLIIL(AnonymousClass057.LJIIJ);
            InterfaceC015404g interfaceC015404g = (InterfaceC015404g) interfaceC24520xk2.LJIILLIIL(AnonymousClass057.LJIILJJIL);
            InterfaceC03730Cr.LJ.getClass();
            C46041rM c46041rM = C03720Cq.LIZIZ;
            C40431iJ LJIIL = C56509MFt.LJIIL(LJIL);
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
                C17280m4.LIZIZ(0, LJIIL, V1I.LIZIZ(interfaceC24520xk2, interfaceC015404g, C03720Cq.LJI, interfaceC24520xk2), interfaceC24520xk2, 2058660585, -678309503);
                V2G.LIZ(new V2I(String.valueOf(str)), "profile_avatar", C78999UzT.LJI(C32391Ox.LIZ.LIZ(C78840Uwu.LJI(C09290Yb.LJIIJJI(c1m1, 36), C17480mO.LIZ), C07730Sb.LJIIJJI), C79043V0l.LIZ((float) 0.5d, C79212V6y.LIZ(interfaceC24520xk2).LJII()), C11710d5.LIZ), null, null, 0.0f, null, null, null, interfaceC24520xk2, 48, 504);
                V59.LIZ((String) interfaceC35811ar.getValue(), new A4P(interfaceC35811ar, replyFragment), null, interfaceC24520xk2, 0, 4);
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
