package X;

/* renamed from: X.aIY, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92922aIY extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92922aIY(boolean z, boolean z2, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, int i, boolean z3, boolean z4) {
        super(2);
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = interfaceC88471Ynr;
        this.LJLJJI = i;
        this.LJLJJL = z3;
        this.LJLJJLL = z4;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            if (!this.LJLIL) {
                InterfaceC07760Se.LJJJ.getClass();
                C31621Ly c31621Ly = C07730Sb.LJIIJJI;
                boolean z = this.LJLILLLLZI;
                InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> interfaceC88471Ynr = this.LJLJI;
                int i = this.LJLJJI;
                boolean z2 = this.LJLJJL;
                boolean z3 = this.LJLJJLL;
                interfaceC24520xk2.LJJIIJ(693286680);
                C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
                InterfaceC273215k LIZ = C0YX.LIZ(C0YW.LIZ, c31621Ly, interfaceC24520xk2);
                interfaceC24520xk2.LJJIIJ(-1323940314);
                Object LJIILLIIL = interfaceC24520xk2.LJIILLIIL(AnonymousClass057.LJ);
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
                    interfaceC24520xk2.LJJIIJ(-678309503);
                    if (z) {
                        interfaceC24520xk2.LJJIIJ(222191704);
                        interfaceC24520xk2.LJJIIJ(222191747);
                        if (interfaceC88471Ynr != null) {
                            interfaceC88471Ynr.invoke(interfaceC24520xk2, Integer.valueOf((i >> 27) & 14));
                        }
                        interfaceC24520xk2.LJJIJIIJIL();
                        C92010a3q.LIZ(null, interfaceC24520xk2, 0, 1);
                        interfaceC24520xk2.LJJIJIIJIL();
                    } else {
                        interfaceC24520xk2.LJJIIJ(222191826);
                        interfaceC24520xk2.LJJIIJ(222191852);
                        if (z2) {
                            C91993a3Z.LIZ(interfaceC24520xk2, 0);
                        }
                        interfaceC24520xk2.LJJIJIIJIL();
                        if (z3) {
                            C92010a3q.LIZ(null, interfaceC24520xk2, 0, 1);
                        }
                        interfaceC24520xk2.LJJIJIIJIL();
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
            }
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
