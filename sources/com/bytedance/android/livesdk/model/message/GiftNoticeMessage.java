package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.gift.model.GiftNotice;

/* loaded from: classes6.dex */
public final class GiftNoticeMessage extends CR6 {

    @InterfaceC65349Pkn("gift_notice")
    public GiftNotice giftNotice;

    public GiftNoticeMessage() {
        this.type = EnumC31509CYf.GIFT_NOTICE_MESSAGE;
    }
}
