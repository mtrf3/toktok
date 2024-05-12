package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;

/* loaded from: classes6.dex */
public class LinkMicAnchorGuideMessage extends CR6 {

    @InterfaceC65349Pkn("available_friend_number")
    public int availableFriendNumber;

    @InterfaceC65349Pkn("button_content")
    public String buttonContent;

    @InterfaceC65349Pkn("button_show_type")
    public int buttonShowType;

    @InterfaceC65349Pkn("connect_type")
    public int connectType;

    @InterfaceC65349Pkn("guide_content")
    public String guideContent;

    @InterfaceC65349Pkn("guide_type")
    public int guideType;

    @InterfaceC65349Pkn("is_followed_by_rival")
    public boolean isFollowRival;

    @InterfaceC65349Pkn("log_id")
    public String logId;

    @InterfaceC65349Pkn("opt_pair_info")
    public OptPairInfo optPairInfo;

    @InterfaceC65349Pkn("reserve_info")
    public ReserveInfo reserveInfo;

    @InterfaceC65349Pkn("user")
    public User user;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    public LinkMicAnchorGuideMessage() {
        this.type = EnumC31509CYf.LINK_CO_HOST_GUIDE;
    }
}
