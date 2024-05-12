package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes6.dex */
public final class GiftBoostCardMessage extends CR6 {

    @InterfaceC65349Pkn("cards")
    public List<BoostCard> mCards;

    public GiftBoostCardMessage() {
        this.type = EnumC31509CYf.GIFT_BOOST_CARD_MESSAGE;
    }
}
