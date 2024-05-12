package X;

import kotlin.jvm.internal.o;

/* renamed from: X.V5j, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79171V5j extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC09320Ye, InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ InterfaceC88472Yns<C23360vs, C76800UCe> LJLIL;
    public final /* synthetic */ InterfaceC09420Yo LJLILLLLZI;
    public final /* synthetic */ InterfaceC88473Ynt<C0YY, InterfaceC24520xk, Integer, C76800UCe> LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C79171V5j(InterfaceC88472Yns<? super C23360vs, C76800UCe> interfaceC88472Yns, InterfaceC09420Yo interfaceC09420Yo, InterfaceC88473Ynt<? super C0YY, ? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88473Ynt, int i) {
        super(3);
        this.LJLIL = interfaceC88472Yns;
        this.LJLILLLLZI = interfaceC09420Yo;
        this.LJLJI = interfaceC88473Ynt;
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC09320Ye interfaceC09320Ye, InterfaceC24520xk interfaceC24520xk, Integer num) {
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
        if ((intValue & 91) != 18 || !interfaceC24520xk2.LIZ()) {
            this.LJLIL.invoke(new C23360vs(BoxWithConstraints.LIZJ()));
            InterfaceC07790Sh LIZLLL = C09290Yb.LIZLLL(InterfaceC07790Sh.LJJJI, C21380sg.LIZIZ, C21380sg.LIZJ);
            InterfaceC09420Yo paddingValues = this.LJLILLLLZI;
            o.LJIIIZ(LIZLLL, "<this>");
            o.LJIIIZ(paddingValues, "paddingValues");
            InterfaceC07790Sh LLLIIIL = LIZLLL.LLLIIIL(new C51071zT(paddingValues));
            C32301Oo c32301Oo = C0YW.LJ;
            InterfaceC07760Se.LJJJ.getClass();
            C31621Ly c31621Ly = C07730Sb.LJIIJJI;
            InterfaceC88473Ynt<C0YY, InterfaceC24520xk, Integer, C76800UCe> interfaceC88473Ynt = this.LJLJI;
            int i2 = ((this.LJLJJI << 3) & 7168) | 432;
            interfaceC24520xk2.LJJIIJ(693286680);
            InterfaceC273215k LIZ = C0YX.LIZ(c32301Oo, c31621Ly, interfaceC24520xk2);
            interfaceC24520xk2.LJJIIJ(-1323940314);
            Object LJIILLIIL = interfaceC24520xk2.LJIILLIIL(AnonymousClass057.LJ);
            Object LJIILLIIL2 = interfaceC24520xk2.LJIILLIIL(AnonymousClass057.LJIIJ);
            InterfaceC015404g interfaceC015404g = (InterfaceC015404g) interfaceC24520xk2.LJIILLIIL(AnonymousClass057.LJIILJJIL);
            InterfaceC03730Cr.LJ.getClass();
            C46041rM c46041rM = C03720Cq.LIZIZ;
            C40431iJ LJIIL = C56509MFt.LJIIL(LLLIIIL);
            int i3 = ((((i2 << 3) & 112) << 9) & 7168) | 6;
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
                LJIIL.invoke(V1I.LIZIZ(interfaceC24520xk2, interfaceC015404g, C03720Cq.LJI, interfaceC24520xk2), interfaceC24520xk2, Integer.valueOf((i3 >> 3) & 112));
                interfaceC24520xk2.LJJIIJ(2058660585);
                interfaceC24520xk2.LJJIIJ(-678309503);
                if (((i3 >> 9) & 14 & 11) != 2 || !interfaceC24520xk2.LIZ()) {
                    interfaceC88473Ynt.invoke(C32391Ox.LIZ, interfaceC24520xk2, Integer.valueOf(((i2 >> 6) & 112) | 6));
                } else {
                    interfaceC24520xk2.LIZLLL();
                }
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
