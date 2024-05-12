package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class FollowCardMessage extends CR6 {

    @InterfaceC65349Pkn("follow_card_id")
    public Long followCardId;

    @InterfaceC65349Pkn("max_random")
    public Long maxRandom;

    public FollowCardMessage() {
        this.type = EnumC31509CYf.FOLLOW_CARD_MESSAGE;
    }
}
