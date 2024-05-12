package com.bytedance.android.livesdk.chatroom.model;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes6.dex */
public final class MGetTranslationRequest {

    @InterfaceC65349Pkn("anchor_id")
    public long anchorId;

    @InterfaceC65349Pkn("room_id")
    public long roomId;

    @InterfaceC65349Pkn("sec_anchor_id")
    public String secAnchorId = "";

    @InterfaceC65349Pkn("texts")
    public List<Text> texts = C61878OQg.INSTANCE;

    /* loaded from: classes6.dex */
    public static final class Text {

        @InterfaceC65349Pkn("msg_id")
        public long msgId;

        @InterfaceC65349Pkn("room_message_heat_level")
        public long roomMessageHeatLevel;

        @InterfaceC65349Pkn("text_source")
        public int textSource;

        @InterfaceC65349Pkn("text")
        public String text = "";

        @InterfaceC65349Pkn("at_username")
        public String atUsername = "";

        @InterfaceC65349Pkn("at_nickname")
        public String atNickname = "";

        @InterfaceC65349Pkn("emotes_index")
        public String emotesIndex = "";
    }
}
