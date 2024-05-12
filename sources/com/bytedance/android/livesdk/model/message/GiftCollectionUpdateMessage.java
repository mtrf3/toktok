package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdkapi.message.CommonMessageData;

/* loaded from: classes6.dex */
public class GiftCollectionUpdateMessage extends CR6 {

    @InterfaceC65349Pkn("gift_collection")
    public GiftCollection giftCollection;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    @Override // X.CR6
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData != null && commonMessageData.displayText != null) {
            return true;
        }
        return false;
    }

    public GiftCollectionUpdateMessage() {
        this.type = EnumC31509CYf.GIFT_COLLECTION_UPDATE_MESSAGE;
    }
}
