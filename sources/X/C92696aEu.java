package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aEu, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92696aEu extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC09320Ye, InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ InterfaceC07790Sh LJLIL;
    public final /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ InterfaceC88473Ynt<C23390vv, InterfaceC24520xk, Integer, C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92696aEu(InterfaceC07790Sh interfaceC07790Sh, float f, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, int i, InterfaceC88473Ynt<? super C23390vv, ? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88473Ynt) {
        super(3);
        this.LJLIL = interfaceC07790Sh;
        this.LJLILLLLZI = f;
        this.LJLJI = interfaceC88471Ynr;
        this.LJLJJI = i;
        this.LJLJJL = interfaceC88473Ynt;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC09320Ye interfaceC09320Ye, InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC07790Sh LIZLLL;
        int i;
        InterfaceC09320Ye BoxWithConstraints = interfaceC09320Ye;
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        int intValue = num.intValue();
        o.LJIIIZ(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((intValue & 14) == 0) {
            if (interfaceC24520xk2.LJIJJ(BoxWithConstraints)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if (((intValue & 91) ^ 18) != 0 || !interfaceC24520xk2.LIZ()) {
            InterfaceC07790Sh LJIIIZ = C09290Yb.LJIIIZ(this.LJLIL, BoxWithConstraints.LIZ(), 0.0f, 2);
            float f = this.LJLILLLLZI;
            InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> interfaceC88471Ynr = this.LJLJI;
            int i2 = this.LJLJJI;
            InterfaceC88473Ynt<C23390vv, InterfaceC24520xk, Integer, C76800UCe> interfaceC88473Ynt = this.LJLJJL;
            interfaceC24520xk2.LJJIIJ(-483455358);
            C32371Ov c32371Ov = C0YW.LIZJ;
            InterfaceC07760Se.LJJJ.getClass();
            InterfaceC273215k LIZ = C09330Yf.LIZ(c32371Ov, C07730Sb.LJIILIIL, interfaceC24520xk2);
            interfaceC24520xk2.LJJIIJ(-1323940314);
            Object LJIILLIIL = interfaceC24520xk2.LJIILLIIL(AnonymousClass057.LJ);
            Object LJIILLIIL2 = interfaceC24520xk2.LJIILLIIL(AnonymousClass057.LJIIJ);
            Object LJIILLIIL3 = interfaceC24520xk2.LJIILLIIL(AnonymousClass057.LJIILJJIL);
            InterfaceC03730Cr.LJ.getClass();
            C46041rM c46041rM = C03720Cq.LIZIZ;
            C40431iJ LJIIL = C56509MFt.LJIIL(LJIIIZ);
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
                LIZLLL = C78996UzQ.LIZLLL(C09290Yb.LJII(C09290Yb.LJIIIIZZ(InterfaceC07790Sh.LJJJI, f)), C91671ZyN.LIZ(interfaceC24520xk2).LIZIZ, C11710d5.LIZ);
                C79057V0z.LJ(LIZLLL, interfaceC24520xk2, 0);
                int i3 = i2 >> 9;
                interfaceC88471Ynr.invoke(interfaceC24520xk2, Integer.valueOf(i3 & 14));
                interfaceC88473Ynt.invoke(new C23390vv(BoxWithConstraints.LIZ()), interfaceC24520xk2, Integer.valueOf(i3 & 112));
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
