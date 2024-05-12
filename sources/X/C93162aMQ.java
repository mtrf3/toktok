package X;

import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel;

/* renamed from: X.aMQ, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final /* synthetic */ class C93162aMQ extends TBS implements InterfaceC65784Pro<String> {
    public C93162aMQ(Object obj) {
        super(0, obj, CheckoutViewModel.class, "formattedAmount", "formattedAmount()Ljava/lang/String;", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        return ((CheckoutViewModel) this.receiver).formattedAmount();
    }
}
