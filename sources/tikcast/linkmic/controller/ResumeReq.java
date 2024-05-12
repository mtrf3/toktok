package tikcast.linkmic.controller;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import webcast.data.multilive_biz.BizResumeParams;

/* loaded from: classes14.dex */
public final class ResumeReq {

    @InterfaceC65349Pkn("channel_id")
    public long channelId;

    @InterfaceC65349Pkn("common")
    public LinkCommon common;

    @InterfaceC65349Pkn("multi_guest_req_extra")
    public BizResumeParams multiGuestReqExtra;

    @InterfaceC65349Pkn("myself")
    public Player myself;
}
