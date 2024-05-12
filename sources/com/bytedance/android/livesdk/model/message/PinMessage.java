package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;

/* loaded from: classes6.dex */
public final class PinMessage extends CR6 {

    @InterfaceC65349Pkn("action")
    public int action;

    @InterfaceC65349Pkn("chat_message")
    public ChatMessage chatMessage;

    @InterfaceC65349Pkn("display_duration")
    public long displayDuration;

    @InterfaceC65349Pkn("gift_message")
    public GiftMessage giftMessage;

    @InterfaceC65349Pkn("like_message")
    public LikeMessage likeMessage;

    @InterfaceC65349Pkn("member_message")
    public MemberMessage memberMessage;

    @InterfaceC65349Pkn("method")
    public String method;

    @InterfaceC65349Pkn("operator")
    public User operator;

    @InterfaceC65349Pkn("pin_msg_id")
    public long pinId;

    @InterfaceC65349Pkn("pin_time")
    public long pinTime;

    @InterfaceC65349Pkn("social_message")
    public SocialMessage socialMessage;

    public PinMessage() {
        this.type = EnumC31509CYf.PIN_MESSAGE;
        this.action = 1;
    }
}
