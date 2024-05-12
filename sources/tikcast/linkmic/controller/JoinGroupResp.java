package tikcast.linkmic.controller;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import tikcast.linkmic.common.GroupChannelAllUser;
import webcast.data.cohost_biz.BizJoinGroupResponse;

/* loaded from: classes14.dex */
public final class JoinGroupResp {

    @InterfaceC65349Pkn("cohost_resp_extra")
    public BizJoinGroupResponse cohostRespExtra;

    @InterfaceC65349Pkn("common_resp")
    public LinkMicCommonResp commonResp;

    @InterfaceC65349Pkn("group_user")
    public GroupChannelAllUser groupUser;
}
