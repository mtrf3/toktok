package X;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.internal.IDqS178S0200000_31;

/* renamed from: X.aGN, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92787aGN extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ C1ZD LJLIL;
    public final /* synthetic */ InterfaceC24760y8<Boolean> LJLILLLLZI;
    public final /* synthetic */ InterfaceC11790dD LJLJI;
    public final /* synthetic */ C11850dJ LJLJJI;
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> LJLJJL;
    public final /* synthetic */ ViewGroup LJLJJLL;
    public final /* synthetic */ ComposeView LJLJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92787aGN(C1ZD c1zd, InterfaceC35811ar interfaceC35811ar, InterfaceC11790dD interfaceC11790dD, C11850dJ c11850dJ, C40431iJ c40431iJ, ViewGroup viewGroup, ComposeView composeView, InterfaceC65784Pro interfaceC65784Pro) {
        super(2);
        this.LJLIL = c1zd;
        this.LJLILLLLZI = interfaceC35811ar;
        this.LJLJI = interfaceC11790dD;
        this.LJLJJI = c11850dJ;
        this.LJLJJL = c40431iJ;
        this.LJLJJLL = viewGroup;
        this.LJLJL = composeView;
        this.LJLJLJ = interfaceC65784Pro;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            interfaceC24520xk2.LJJIIJ(-492369756);
            Object LJIILL = interfaceC24520xk2.LJIILL();
            InterfaceC24520xk.LIZ.getClass();
            C24490xh c24490xh = C24500xi.LIZIZ;
            if (LJIILL == c24490xh) {
                LJIILL = C78966Uyw.LJJJIL(Boolean.FALSE);
                interfaceC24520xk2.LJJIII(LJIILL);
            }
            interfaceC24520xk2.LJJIJIIJIL();
            InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) LJIILL;
            C1ZD c1zd = this.LJLIL;
            InterfaceC24760y8<Boolean> interfaceC24760y8 = this.LJLILLLLZI;
            interfaceC24520xk2.LJJIIJ(511388516);
            boolean LJIJJ = interfaceC24520xk2.LJIJJ(c1zd) | interfaceC24520xk2.LJIJJ(interfaceC24760y8);
            Object LJIILL2 = interfaceC24520xk2.LJIILL();
            if (LJIJJ || LJIILL2 == c24490xh) {
                LJIILL2 = new IDqS178S0200000_31(c1zd, (C1ZD) interfaceC24760y8, (InterfaceC24760y8<Boolean>) 16);
                interfaceC24520xk2.LJJIII(LJIILL2);
            }
            interfaceC24520xk2.LJJIJIIJIL();
            C44001o4 LJIJI = C78966Uyw.LJIJI((InterfaceC65784Pro) LJIILL2);
            C24610xt.LJ(this.LJLIL.LIZLLL(), new C93105aLV(this.LJLIL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC35811ar, null), interfaceC24520xk2);
            C91898a22.LIZ(this.LJLIL, ((Boolean) LJIJI.getValue()).booleanValue(), this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC24520xk2, 0, 0);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
