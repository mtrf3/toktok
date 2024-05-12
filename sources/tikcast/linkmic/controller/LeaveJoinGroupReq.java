package tikcast.linkmic.controller;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import tikcast.linkmic.common.GroupPlayer;
import webcast.data.cohost_biz.BizLeaveJoinGroupParams;

/* loaded from: classes14.dex */
public final class LeaveJoinGroupReq {

    @InterfaceC65349Pkn("cohost_req_extra")
    public BizLeaveJoinGroupParams cohostReqExtra;

    @InterfaceC65349Pkn("common")
    public LinkCommon common;

    @InterfaceC65349Pkn("cur_group_channel_id")
    public long curGroupChannelId;

    @InterfaceC65349Pkn("group_channel_id")
    public long groupChannelId;

    @InterfaceC65349Pkn("leaver")
    public GroupPlayer leaver;

    @InterfaceC65349Pkn("myself")
    public GroupPlayer myself;
}
