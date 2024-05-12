package com.bytedance.android.livesdk.subscribe.model.invite;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;

/* loaded from: classes6.dex */
public final class GetInvitationStatusResponse {

    @InterfaceC65349Pkn("code_data")
    public SubInvitationCode inviteCodeData;

    @InterfaceC65349Pkn("invitation_status")
    public SubInvitationInviteeStatus inviteeStatus;

    @InterfaceC65349Pkn("inviter_info")
    public User inviterInfo;

    @InterfaceC65349Pkn("self_info")
    public User selfInfo;

    @InterfaceC65349Pkn("switcher")
    public SubInvitationFunctionSwitcher switcher;
}
