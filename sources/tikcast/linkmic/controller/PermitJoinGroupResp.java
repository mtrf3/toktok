package tikcast.linkmic.controller;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import com.bytedance.android.livesdk.model.message.linkcore.RTCExtraInfo;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.GroupChannelAllUser;
import webcast.data.cohost_biz.BizPermitJoinGroupResponse;

/* loaded from: classes14.dex */
public final class PermitJoinGroupResp {

    @InterfaceC65349Pkn("cohost_resp_extra")
    public BizPermitJoinGroupResponse cohostRespExtra;

    @InterfaceC65349Pkn("common_resp")
    public LinkMicCommonResp commonResp;

    @InterfaceC65349Pkn("group_rtc_info")
    public List<RTCExtraInfo> groupRtcInfo = new ArrayList();

    @InterfaceC65349Pkn("group_user")
    public GroupChannelAllUser groupUser;
}
