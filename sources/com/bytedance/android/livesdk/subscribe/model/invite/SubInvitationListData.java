package com.bytedance.android.livesdk.subscribe.model.invite;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class SubInvitationListData {

    @InterfaceC65349Pkn("invitation_codes")
    public List<SubInvitationCode> invitationCodeList;

    @InterfaceC65349Pkn("inviter_infos")
    public Map<String, User> invitersInfo;

    @InterfaceC65349Pkn("self_info")
    public User selfInfo;

    @InterfaceC65349Pkn("switcher")
    public SubInvitationFunctionSwitcher switcher;

    @InterfaceC65349Pkn("total_count")
    public long totalCount;
}
