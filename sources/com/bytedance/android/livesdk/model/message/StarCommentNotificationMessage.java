package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;

/* loaded from: classes6.dex */
public final class StarCommentNotificationMessage extends CR6 {

    @InterfaceC65349Pkn("msg_id")
    public long msgId;

    @InterfaceC65349Pkn("operator")
    public User operator;

    @InterfaceC65349Pkn("star_comment_action")
    public int starCommentAction;

    @InterfaceC65349Pkn("star_comment_message")
    public StarCommentMessage starCommentMessage;

    public StarCommentNotificationMessage() {
        this.type = EnumC31509CYf.STAR_COMMENT_NOTIFICATION_MESSAGE;
    }
}
