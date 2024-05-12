package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinChannelResponse;

/* loaded from: classes14.dex */
public final class JoinChannelResp extends LinkMicUplinkBaseResp {

    @InterfaceC65349Pkn("linkLayerListUser")
    public LinkLayerListUser linkLayerListUser;

    @InterfaceC65349Pkn("multi_guest_resp_extra")
    public BizJoinChannelResponse multiGuestRespExtra;

    public JoinChannelResp() {
        super(null, 1, null);
    }
}
