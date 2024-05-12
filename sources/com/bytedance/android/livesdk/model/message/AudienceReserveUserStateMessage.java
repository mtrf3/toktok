package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class AudienceReserveUserStateMessage extends CR6 {

    @InterfaceC65349Pkn("audience_cancel_content")
    public AudienceCancelContent audienceCancelContent;

    @InterfaceC65349Pkn("audience_reply_content")
    public AudienceReplyContent audienceReplyContent;

    @InterfaceC65349Pkn("audience_reserve_content")
    public AudienceReserveContent audienceReserveContent;

    @InterfaceC65349Pkn("audience_reserve_user_info")
    public AudienceReserveUserInfo audienceReserveUserInfo;

    @InterfaceC65349Pkn("room_id")
    public long roomId;

    @InterfaceC65349Pkn("type")
    public int type;

    public AudienceReserveUserStateMessage() {
        super.type = EnumC31509CYf.AUDIENCE_RESERVE_USER_STATE_MESSAGE;
    }
}
