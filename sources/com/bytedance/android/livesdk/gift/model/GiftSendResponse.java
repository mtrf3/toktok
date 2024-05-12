package com.bytedance.android.livesdk.gift.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.Extra;
import webcast.data.RechargeCustomError;

/* loaded from: classes14.dex */
public final class GiftSendResponse extends F9E {

    @InterfaceC65349Pkn("data")
    public SendGiftResult data;

    @InterfaceC65349Pkn("extra")
    public GiftExtra extra;

    /* loaded from: classes14.dex */
    public static final class GiftExtra extends Extra {

        @InterfaceC65349Pkn("custom_error")
        public RechargeCustomError customError;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        SendGiftResult sendGiftResult = this.data;
        return new Object[]{sendGiftResult, sendGiftResult};
    }
}
