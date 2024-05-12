package X;

import kotlin.jvm.internal.o;

/* renamed from: X.25M, reason: invalid class name */
/* loaded from: classes.dex */
public final class C25M extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC07790Sh, InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ InterfaceC21550sx LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C25M(float f, InterfaceC21550sx interfaceC21550sx, boolean z, int i, int i2, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr) {
        super(3);
        this.LJLIL = f;
        this.LJLILLLLZI = interfaceC21550sx;
        this.LJLJI = z;
        this.LJLJJI = i;
        this.LJLJJL = interfaceC88471Ynr;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC07790Sh interfaceC07790Sh, InterfaceC24520xk interfaceC24520xk, Integer num) {
        int i;
        InterfaceC07790Sh modifier = interfaceC07790Sh;
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        int intValue = num.intValue();
        o.LJIIIZ(modifier, "modifier");
        if ((intValue & 14) == 0) {
            if (interfaceC24520xk2.LJIJJ(modifier)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if ((intValue & 91) != 18 || !interfaceC24520xk2.LIZ()) {
            InterfaceC07790Sh LJIIL = C78866UxK.LJIIL(modifier, this.LJLIL);
            InterfaceC21550sx interfaceC21550sx = this.LJLILLLLZI;
            boolean z = this.LJLJI;
            int i2 = this.LJLJJI;
            InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> interfaceC88471Ynr = this.LJLJJL;
            interfaceC24520xk2.LJJIIJ(733328855);
            InterfaceC07760Se.LJJJ.getClass();
            InterfaceC273215k LIZJ = C0YZ.LIZJ(C07730Sb.LIZIZ, false, interfaceC24520xk2);
            interfaceC24520xk2.LJJIIJ(-1323940314);
            Object LJIILLIIL = interfaceC24520xk2.LJIILLIIL(AnonymousClass057.LJ);
            Object LJIILLIIL2 = interfaceC24520xk2.LJIILLIIL(AnonymousClass057.LJIIJ);
            InterfaceC015404g interfaceC015404g = (InterfaceC015404g) interfaceC24520xk2.LJIILLIIL(AnonymousClass057.LJIILJJIL);
            InterfaceC03730Cr.LJ.getClass();
            C46041rM c46041rM = C03720Cq.LIZIZ;
            C40431iJ LJIIL2 = C56509MFt.LJIIL(LJIIL);
            if (interfaceC24520xk2.LJJ() instanceof InterfaceC24420xa) {
                interfaceC24520xk2.LJIJI();
                if (interfaceC24520xk2.LJIJJLI()) {
                    interfaceC24520xk2.LJJI(c46041rM);
                } else {
                    interfaceC24520xk2.LIZIZ();
                }
                interfaceC24520xk2.LJJIIZI();
                C24830yF.LIZ(interfaceC24520xk2, LIZJ, C03720Cq.LJ);
                C24830yF.LIZ(interfaceC24520xk2, LJIILLIIL, C03720Cq.LIZLLL);
                C24830yF.LIZ(interfaceC24520xk2, LJIILLIIL2, C03720Cq.LJFF);
                C17280m4.LIZIZ(0, LJIIL2, V1I.LIZIZ(interfaceC24520xk2, interfaceC015404g, C03720Cq.LJI, interfaceC24520xk2), interfaceC24520xk2, 2058660585, -2137368960);
                interfaceC24520xk2.LJJIIJ(1188063364);
                C21640t6.LIZIZ(((C11850dJ) interfaceC21550sx.LIZJ(z, interfaceC24520xk2).getValue()).LIZ, C21350sd.LIZJ(interfaceC24520xk2).LJI, null, interfaceC88471Ynr, interfaceC24520xk2, (i2 >> 6) & 7168, 4);
                interfaceC24520xk2.LJJIJIIJIL();
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
