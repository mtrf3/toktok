package com.ss.android.ugc.aweme.paidcontent.viewmodel;

import X.A37;
import X.A4M;
import X.A6F;
import X.A8I;
import X.C221108m2;
import X.C25643A4p;
import X.C25647A4t;
import X.C62822Ol8;
import X.C77770Ufe;
import X.C78613UtF;
import X.EnumC25627A3z;
import X.XKX;
import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.wallet.model.IapProductBuyParam;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.model.PriceInfo;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidContentDetailPaymentViewModel extends AssemViewModel<A37> {
    public final C77770Ufe LJLIL = new C77770Ufe(new A6F(this), new C25647A4t(this));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final A37 defaultState() {
        return new A37(0);
    }

    public final void gv0(long j, EnumC25627A3z entrySource, Long l) {
        o.LJIIIZ(entrySource, "entrySource");
        setState(A4M.LJLIL);
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), C78613UtF.LIZJ, null, new C25643A4p(j, entrySource, l, this, null), 2);
    }

    public final void hv0(String createdOrderId, PriceInfo priceInfo, Context context) {
        int i;
        String str;
        o.LJIIIZ(createdOrderId, "createdOrderId");
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-iapViewModel>(...)");
        A8I a8i = (A8I) value;
        IapProductBuyParam iapProductBuyParam = new IapProductBuyParam();
        if (priceInfo != null) {
            i = (int) priceInfo.getDiamondId();
        } else {
            i = 0;
        }
        iapProductBuyParam.diamondId = i;
        iapProductBuyParam.source = 14;
        if (priceInfo != null) {
            str = priceInfo.getIapId();
        } else {
            str = null;
        }
        iapProductBuyParam.productId = String.valueOf(str);
        iapProductBuyParam.way = 0;
        iapProductBuyParam.orderId = createdOrderId;
        iapProductBuyParam.tradeType = 1;
        iapProductBuyParam.businessType = 3;
        a8i.fW(context, iapProductBuyParam);
    }
}
