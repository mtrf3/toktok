package tikcast.linkmic.controller;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import com.bytedance.android.livesdk.model.message.linkcore.MicPositionData;
import com.bytedance.android.livesdk.model.message.linkcore.RTCExtraInfo;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.GroupChannelAllUser;
import webcast.data.cohost_biz.BizRechargeResponse;

/* loaded from: classes14.dex */
public final class RechargeResp {

    @InterfaceC65349Pkn("cohost_resp_extra")
    public BizRechargeResponse cohostRespExtra;

    @InterfaceC65349Pkn("common_resp")
    public LinkMicCommonResp commonResp;

    @InterfaceC65349Pkn("group_user")
    public GroupChannelAllUser groupUser;

    @InterfaceC65349Pkn("my_info")
    public RTCExtraInfo myInfo;

    @InterfaceC65349Pkn("target_pos")
    public MicPositionData targetPos;

    @InterfaceC65349Pkn("my_linkmic_id")
    public String myLinkmicId = "";

    @InterfaceC65349Pkn("target_linkmic_id")
    public String targetLinkmicId = "";

    @InterfaceC65349Pkn("group_ext_info")
    public List<RTCExtraInfo> groupExtInfo = new ArrayList();
}
