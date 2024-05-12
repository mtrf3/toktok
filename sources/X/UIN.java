package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.data.model.exchange.UpdateBillingAddressData;

/* loaded from: classes14.dex */
public final class UIN<T> implements InterfaceC64592gB {
    public static final UIN<T> LJLIL = new UIN<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        if (((UpdateBillingAddressData) ((BaseResponse) obj).data).isSaved) {
        } else {
            throw new UIM("is saved false");
        }
    }
}
