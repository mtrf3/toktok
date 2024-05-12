package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.message.CommonMessageData;

/* loaded from: classes6.dex */
public class SocialMessage extends CR6 {

    @InterfaceC65349Pkn("action")
    public long action;

    @InterfaceC65349Pkn("follow_count")
    public Long followCount;

    @InterfaceC65349Pkn("share_count")
    public int shareCount;

    @InterfaceC65349Pkn("share_display_style")
    public long shareDisplayStyle;

    @InterfaceC65349Pkn("share_target")
    public String shareTarget;

    @InterfaceC65349Pkn("share_type")
    public long shareType;

    @InterfaceC65349Pkn("user")
    public User user;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        if (this.user != null) {
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

    public SocialMessage() {
        this.type = EnumC31509CYf.SOCIAL;
    }
}
