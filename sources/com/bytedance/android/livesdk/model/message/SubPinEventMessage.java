package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.api.SubPinCard;

/* loaded from: classes6.dex */
public final class SubPinEventMessage extends CR6 {

    @InterfaceC65349Pkn("action_type")
    public int actionType;

    @InterfaceC65349Pkn("card")
    public SubPinCard card;

    @InterfaceC65349Pkn("operator_user_id")
    public long operatorUserId;

    public SubPinEventMessage() {
        this.type = EnumC31509CYf.SUB_PIN_EVENT_MESSAGE;
    }
}
