package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.message.CommonMessageData;

/* loaded from: classes6.dex */
public class RichChatMessage extends CR6 {

    @InterfaceC65349Pkn("action_content")
    public String actionContent;

    @InterfaceC65349Pkn("action_type")
    public String actionType;

    @InterfaceC65349Pkn("color")
    public String color;

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("icon")
    public ImageModel icon;

    @InterfaceC65349Pkn("push_message_display_time")
    public long pushDisplayTime;

    @InterfaceC65349Pkn("traceid")
    public String traceId;

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

    public RichChatMessage() {
        this.type = EnumC31509CYf.ROOM_RICH_CHAT_MESSAGE;
    }
}
