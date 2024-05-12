package X;

import android.view.View;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutNavBarState;
import kotlin.jvm.internal.o;

/* renamed from: X.aGr, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92817aGr extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC07790Sh, InterfaceC24520xk, Integer, InterfaceC07790Sh> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C1OH LJLJI;
    public final /* synthetic */ CheckoutNavBarState LJLJJI;
    public final /* synthetic */ C92158a6E LJLJJL;
    public final /* synthetic */ InterfaceC91773a01 LJLJJLL;
    public final /* synthetic */ View LJLJL;
    public final /* synthetic */ InterfaceC70422pa LJLJLJ;
    public final /* synthetic */ C92283a8F LJLJLLL;
    public final /* synthetic */ InterfaceC65784Pro LJLL;
    public final /* synthetic */ C05P LJLLI;
    public final /* synthetic */ InterfaceC65784Pro LJLLILLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92817aGr(boolean z, String str, C1OH c1oh, CheckoutNavBarState checkoutNavBarState, C92158a6E c92158a6E, InterfaceC91773a01 interfaceC91773a01, View view, InterfaceC70422pa interfaceC70422pa, C92283a8F c92283a8F, InterfaceC65784Pro interfaceC65784Pro, C05P c05p, InterfaceC65784Pro interfaceC65784Pro2) {
        super(3);
        this.LJLIL = z;
        this.LJLILLLLZI = str;
        this.LJLJI = c1oh;
        this.LJLJJI = checkoutNavBarState;
        this.LJLJJL = c92158a6E;
        this.LJLJJLL = interfaceC91773a01;
        this.LJLJL = view;
        this.LJLJLJ = interfaceC70422pa;
        this.LJLJLLL = c92283a8F;
        this.LJLL = interfaceC65784Pro;
        this.LJLLI = c05p;
        this.LJLLILLLL = interfaceC65784Pro2;
    }

    public final InterfaceC07790Sh invoke(InterfaceC07790Sh composed, InterfaceC24520xk interfaceC24520xk, int i) {
        o.LJIIIZ(composed, "$this$composed");
        interfaceC24520xk.LJJIIJ(-286680064);
        Object obj = this.LJLJI;
        interfaceC24520xk.LJJIIJ(-492369756);
        Object LJIILL = interfaceC24520xk.LJIILL();
        InterfaceC24520xk.LIZ.getClass();
        if (LJIILL == C24500xi.LIZIZ) {
            interfaceC24520xk.LJJIII(obj);
        } else {
            obj = LJIILL;
        }
        interfaceC24520xk.LJJIJIIJIL();
        InterfaceC07790Sh LIZJ = C07720Sa.LIZJ(composed, (C1OH) obj, null, this.LJLIL, this.LJLILLLLZI, null, new C92816aGq(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLLILLLL), 16);
        interfaceC24520xk.LJJIJIIJIL();
        return LIZJ;
    }

    @Override // X.InterfaceC88473Ynt
    public /* bridge */ /* synthetic */ InterfaceC07790Sh invoke(InterfaceC07790Sh interfaceC07790Sh, InterfaceC24520xk interfaceC24520xk, Integer num) {
        return invoke(interfaceC07790Sh, interfaceC24520xk, num.intValue());
    }
}
