package X;

import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutAction;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.aMh, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final /* synthetic */ class C93179aMh extends TBS implements InterfaceC88472Yns<CheckoutAction, C76800UCe> {
    public C93179aMh(Object obj) {
        super(1, obj, CheckoutViewModel.class, "dispatch", "dispatch(Lcom/bytedance/pipo/checkout/sdk/viewmodel/CheckoutAction;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(CheckoutAction checkoutAction) {
        CheckoutAction p0 = checkoutAction;
        o.LJIIIZ(p0, "p0");
        ((CheckoutViewModel) this.receiver).dispatch(p0);
        return C76800UCe.LIZ;
    }
}
