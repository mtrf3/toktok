package X;

import android.view.View;
import androidx.compose.ui.platform.g1;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutNavBarState;
import com.zhiliaoapp.musically.R;

/* renamed from: X.aGl, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92811aGl extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ CheckoutNavBarState LJLIL;
    public final /* synthetic */ C92158a6E LJLILLLLZI;
    public final /* synthetic */ InterfaceC91773a01 LJLJI;
    public final /* synthetic */ View LJLJJI;
    public final /* synthetic */ InterfaceC70422pa LJLJJL;
    public final /* synthetic */ C92283a8F LJLJJLL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92811aGl(CheckoutNavBarState checkoutNavBarState, C92158a6E c92158a6E, InterfaceC91773a01 interfaceC91773a01, View view, InterfaceC70422pa interfaceC70422pa, C92283a8F c92283a8F, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(2);
        this.LJLIL = checkoutNavBarState;
        this.LJLILLLLZI = c92158a6E;
        this.LJLJI = interfaceC91773a01;
        this.LJLJJI = view;
        this.LJLJJL = interfaceC70422pa;
        this.LJLJJLL = c92283a8F;
        this.LJLJL = interfaceC65784Pro;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            AbstractC16010k1 LJJIIZ = C79081V1x.LJJIIZ(R.drawable.jl, interfaceC24520xk2);
            C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
            CheckoutNavBarState checkoutNavBarState = this.LJLIL;
            C92158a6E c92158a6E = this.LJLILLLLZI;
            InterfaceC91773a01 interfaceC91773a01 = this.LJLJI;
            View view = this.LJLJJI;
            InterfaceC70422pa interfaceC70422pa = this.LJLJJL;
            C92283a8F c92283a8F = this.LJLJJLL;
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJL;
            C0SR.LIZ(LJJIIZ, null, C07770Sf.LIZ(c1m1, g1.LIZ, new C92820aGu(true, null, new C42191l9(), checkoutNavBarState, c92158a6E, interfaceC91773a01, view, interfaceC70422pa, c92283a8F, interfaceC65784Pro)), null, null, 0.0f, C11860dK.LIZIZ(C91671ZyN.LIZ(interfaceC24520xk2).LIZJ), interfaceC24520xk2, 56, 56);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
