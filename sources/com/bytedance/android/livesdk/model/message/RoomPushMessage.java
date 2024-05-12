package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes6.dex */
public class RoomPushMessage extends CR6 {

    @InterfaceC65349Pkn("action_content")
    public String actionContent;

    @InterfaceC65349Pkn("action_icon")
    public ImageModel actionIcon;

    @InterfaceC65349Pkn("action_type")
    public String actionType = CardStruct.IStatusCode.DEFAULT;

    @InterfaceC65349Pkn("background_image")
    public FlexImageModel backgroundImage;

    @InterfaceC65349Pkn("color")
    public String color;

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("icon")
    public ImageModel icon;

    @InterfaceC65349Pkn("new_background_image")
    public FlexImageModel newBackgroundImage;

    @InterfaceC65349Pkn("push_message_display_time")
    public long pushDisplayTime;

    @InterfaceC65349Pkn("source")
    public String source;

    @InterfaceC65349Pkn("traceid")
    public String traceId;

    @Override // X.CR6
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData != null && commonMessageData.displayText != null) {
            return true;
        }
        return false;
    }

    public RoomPushMessage() {
        this.type = EnumC31509CYf.ROOM_PUSH;
    }
}
