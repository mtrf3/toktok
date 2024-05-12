package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class GiftUpdateMessage extends CR6 {

    @InterfaceC65349Pkn("update_type")
    public int updateType;

    public GiftUpdateMessage() {
        this.type = EnumC31509CYf.GIFT_UPDATE;
    }
}
