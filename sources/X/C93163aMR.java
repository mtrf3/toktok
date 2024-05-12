package X;

import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutNavBarState;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.aMR, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final /* synthetic */ class C93163aMR extends TBS implements InterfaceC88472Yns<CheckoutNavBarState, C76800UCe> {
    public C93163aMR(Object obj) {
        super(1, obj, CheckoutViewModel.class, "onNavBarChange", "onNavBarChange(Lcom/bytedance/pipo/checkout/sdk/viewmodel/CheckoutNavBarState;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(CheckoutNavBarState checkoutNavBarState) {
        CheckoutNavBarState p0 = checkoutNavBarState;
        o.LJIIIZ(p0, "p0");
        ((CheckoutViewModel) this.receiver).onNavBarChange(p0);
        return C76800UCe.LIZ;
    }
}
