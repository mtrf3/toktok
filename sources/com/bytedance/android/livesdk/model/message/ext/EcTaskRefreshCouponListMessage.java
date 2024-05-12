package com.bytedance.android.livesdk.model.message.ext;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes13.dex */
public final class EcTaskRefreshCouponListMessage extends CR6 {

    @InterfaceC65349Pkn("message_entity")
    public EcTaskRefreshCouponListEntity entity;

    @Override // X.CR6, com.ss.ugc.live.sdk.message.data.IMessage
    public final int getIntType() {
        return 100003;
    }

    public EcTaskRefreshCouponListMessage() {
        this.type = EnumC31509CYf.EC_TASK_REFRESH_COUPON_LIST_MESSAGE;
    }
}
