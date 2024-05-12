package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;

/* loaded from: classes6.dex */
public class LinkMicAudienceNoticeMessage extends CR6 {

    @InterfaceC65349Pkn("notice_guide")
    public LinkMicAudienceInviteGuide inviteGuide;

    @InterfaceC65349Pkn("notice_type")
    public int noticeType;

    @InterfaceC65349Pkn("turn_on_guide")
    public LinkMicAudienceTurnOnGuide turnOnGuide;

    /* loaded from: classes6.dex */
    public static class LinkMicAudienceInviteGuide {

        @InterfaceC65349Pkn("button_content")
        public LinkMicAudienceNoticeText buttonContent;

        @InterfaceC65349Pkn("content")
        public LinkMicAudienceNoticeText content;

        @InterfaceC65349Pkn("user")
        public User user;
    }

    /* loaded from: classes6.dex */
    public static class LinkMicAudienceNoticeText {

        @InterfaceC65349Pkn("text")
        public String text;
    }

    /* loaded from: classes6.dex */
    public static class LinkMicAudienceTurnOnGuide {

        @InterfaceC65349Pkn("button_content")
        public LinkMicAudienceNoticeText buttonContent;

        @InterfaceC65349Pkn("content")
        public LinkMicAudienceNoticeText content;
    }

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    public LinkMicAudienceNoticeMessage() {
        this.type = EnumC31509CYf.LINK_AUDIENCE_NOTICE;
    }
}
