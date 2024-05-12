package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes6.dex */
public class MarqueeAnnouncementMessage extends CR6 {

    @InterfaceC65349Pkn("message_entity")
    public List<MessageEntity> messageEntity;

    @InterfaceC65349Pkn("message_scene")
    public String messageScene;

    /* loaded from: classes6.dex */
    public static class MessageEntity {

        @InterfaceC65349Pkn("notify")
        public RoomNotifyMessage notifyMessage;
    }

    public MarqueeAnnouncementMessage() {
        this.type = EnumC31509CYf.MARQUEE_ANNOUNCEMENT_MESSAGE;
    }
}
