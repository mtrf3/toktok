package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.V5i, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79170V5i extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ InterfaceC07790Sh LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJLL;
    public final /* synthetic */ InterfaceC24760y8<Boolean> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79170V5i(InterfaceC07790Sh interfaceC07790Sh, boolean z, Context context, InterfaceC65784Pro interfaceC65784Pro, int i, InterfaceC65784Pro interfaceC65784Pro2, InterfaceC35811ar interfaceC35811ar) {
        super(2);
        this.LJLIL = interfaceC07790Sh;
        this.LJLILLLLZI = z;
        this.LJLJI = context;
        this.LJLJJI = interfaceC65784Pro;
        this.LJLJJL = i;
        this.LJLJJLL = interfaceC65784Pro2;
        this.LJLJL = interfaceC35811ar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC07790Sh LIZLLL;
        float f;
        InterfaceC07790Sh LIZIZ;
        InterfaceC07790Sh LIZIZ2;
        String string;
        int i;
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if ((num.intValue() & 11) != 2 || !interfaceC24520xk2.LIZ()) {
            LIZLLL = C78996UzQ.LIZLLL(this.LJLIL, ((C11850dJ) C79212V6y.LIZ(interfaceC24520xk2).LJJII.getValue()).LIZ, C11710d5.LIZ);
            float f2 = 16;
            float f3 = 12;
            if (this.LJLILLLLZI) {
                f = 0;
            } else {
                f = f3;
            }
            InterfaceC07790Sh LJIJJLI = C70657RoD.LJIJJLI(LIZLLL, f2, f3, f2, f);
            Context context = this.LJLJI;
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJI;
            int i2 = this.LJLJJL;
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = this.LJLJJLL;
            InterfaceC24760y8<Boolean> interfaceC24760y8 = this.LJLJL;
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
            C40431iJ LJIIL = C56509MFt.LJIIL(LJIJJLI);
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
                C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
                LIZIZ = C32391Ox.LIZ.LIZIZ(c1m1, true);
                String string2 = context.getString(R.string.bb6);
                EnumC79196V6i enumC79196V6i = EnumC79196V6i.SECONDARY;
                EnumC79195V6h enumC79195V6h = EnumC79195V6h.LARGE;
                o.LJIIIZ(interfaceC65784Pro, "<this>");
                interfaceC24520xk2.LJJIIJ(-1486339845);
                interfaceC24520xk2.LJJIIJ(-1908146605);
                interfaceC24520xk2.LJJIIJ(-492369756);
                Object LJIILL = interfaceC24520xk2.LJIILL();
                InterfaceC24520xk.LIZ.getClass();
                if (LJIILL == C24500xi.LIZIZ) {
                    LJIILL = C78966Uyw.LJJJIL(0L);
                    interfaceC24520xk2.LJJIII(LJIILL);
                }
                interfaceC24520xk2.LJJIJIIJIL();
                C68032lj c68032lj = new C68032lj(300L, interfaceC65784Pro, (InterfaceC35811ar) LJIILL);
                interfaceC24520xk2.LJJIJIIJIL();
                interfaceC24520xk2.LJJIJIIJIL();
                o.LJIIIIZZ(string2, "getString(R.string.addPl…playlistBottomSheet_btn1)");
                C79169V5h.LIZIZ(c68032lj, string2, LIZIZ, false, false, 0L, false, null, Integer.valueOf(R.raw.icon_arrow_turn_up_right), null, enumC79195V6h, enumC79196V6i, null, null, false, null, interfaceC24520xk2, 0, 54, 62200);
                C79057V0z.LJ(C09290Yb.LJIILIIL(c1m1, 8), interfaceC24520xk2, 6);
                LIZIZ2 = C32391Ox.LIZ.LIZIZ(c1m1, true);
                if (interfaceC24760y8.getValue().booleanValue()) {
                    string = context.getString(R.string.bb8);
                } else {
                    string = context.getString(R.string.bb7);
                }
                long LJIIIIZZ = C79043V0l.LJIIIIZZ(10);
                if (interfaceC24760y8.getValue().booleanValue()) {
                    i = R.raw.icon_bookmark_fill;
                } else {
                    i = R.raw.icon_bookmark;
                }
                o.LJIIIIZZ(string, "if (isCollected)\n       …playlistBottomSheet_btn2)");
                C79169V5h.LIZIZ(interfaceC65784Pro2, string, LIZIZ2, false, false, LJIIIIZZ, false, null, Integer.valueOf(i), null, enumC79195V6h, enumC79196V6i, null, null, false, null, interfaceC24520xk2, ((i2 >> 9) & 14) | 196608, 54, 62168);
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
