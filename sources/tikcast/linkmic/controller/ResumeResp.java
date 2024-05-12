package tikcast.linkmic.controller;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.linkcore.AllListUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import java.util.List;
import webcast.data.multilive_biz.BizResumeResponse;

/* loaded from: classes14.dex */
public final class ResumeResp {

    @InterfaceC65349Pkn("channel_id")
    public long channelId;

    @InterfaceC65349Pkn("common_resp")
    public LinkMicCommonResp commonResp;

    @InterfaceC65349Pkn("linked_user_info")
    public List<LinkedUserInfo> linkedUserInfo;

    @InterfaceC65349Pkn("list")
    public AllListUser list;

    @InterfaceC65349Pkn("multi_guest_resp_extra")
    public BizResumeResponse multiGuestRespExtra;

    @InterfaceC65349Pkn("reject_enlarge_linkmic_id_list")
    public List<String> rejectEnlargeLinkmicIdList;

    @InterfaceC65349Pkn("self_link_mic_id")
    public String selfLinkMicId = "";
}
