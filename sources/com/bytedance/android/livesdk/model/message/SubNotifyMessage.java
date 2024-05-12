package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.DIX;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.message.CommonMessageData;

/* loaded from: classes6.dex */
public final class SubNotifyMessage extends CR6 {

    @InterfaceC65349Pkn("exhibition_type")
    public int exhibitionType;

    @InterfaceC65349Pkn("is_custom")
    public boolean isCustom;

    @InterfaceC65349Pkn("is_send")
    public boolean isSend;

    @InterfaceC65349Pkn("old_subscribe_status")
    public int oldSubscribeStatus;

    @InterfaceC65349Pkn("sub_month")
    public Long subMonth;

    @InterfaceC65349Pkn("message_type")
    public int subscribeMessageType;

    @InterfaceC65349Pkn("subscribe_type")
    public int subscribeType;

    @InterfaceC65349Pkn("subscribing_status")
    public int subscribingStatus;

    @InterfaceC65349Pkn("user")
    public User user;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        if (this.baseMessage != null) {
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

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        sb.append(", exhibition_type=");
        sb.append(this.exhibitionType);
        if (this.subMonth != null) {
            sb.append(", sub_month=");
            sb.append(this.subMonth);
        }
        sb.append(", subscribe_type=");
        sb.append(this.subscribeType);
        sb.append(", old_subscribe_status=");
        sb.append(this.oldSubscribeStatus);
        return DIX.LIZLLL(sb, 0, 2, "SubNotifyMessage{", '}');
    }

    public SubNotifyMessage() {
        this.type = EnumC31509CYf.SUB_NOTIFY_MESSAGE;
    }
}
