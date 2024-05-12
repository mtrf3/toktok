package com.bytedance.android.livesdk.gift.model;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.gift.model.WishListResponse;
import com.bytedance.android.livesdkapi.message.CommonMessageData;

/* loaded from: classes6.dex */
public class WishListUpdateMessage extends CR6 {

    @InterfaceC65349Pkn("list")
    public WishListResponse.WishList list;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData != null && commonMessageData.displayText != null) {
            return true;
        }
        return false;
    }

    @Override // X.CR6
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData != null && commonMessageData.displayText != null) {
            return true;
        }
        return false;
    }

    public WishListUpdateMessage() {
        this.type = EnumC31509CYf.WISH_LIST_UPDATE_MESSAGE;
    }
}
