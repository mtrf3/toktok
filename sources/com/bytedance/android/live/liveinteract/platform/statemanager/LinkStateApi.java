package com.bytedance.android.live.liveinteract.platform.statemanager;

import X.AbstractC73638SvC;
import X.C28467BFf;
import X.E8M;
import X.EKC;
import X.EnumC29608Bjg;
import X.InterfaceC195727mC;
import X.InterfaceC65131PhH;
import X.InterfaceC67352kd;
import X.R2P;
import com.bytedance.android.livesdk.chatroom.model.interact.CheckPermissionResponse;
import tikcast.linkmic.controller.AckStateReq;
import tikcast.linkmic.controller.AckStateResp;
import tikcast.linkmic.controller.ChangeStateReq;
import tikcast.linkmic.controller.ChangeStateResp;
import tikcast.linkmic.controller.GetStateReq;
import tikcast.linkmic.controller.GetStateResp;

/* loaded from: classes14.dex */
public interface LinkStateApi {
    @E8M("/tikcast/linkmic/change_state/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @EKC({"content-type: application/json"})
    Object changeState(@InterfaceC195727mC ChangeStateReq changeStateReq, InterfaceC67352kd<? super R2P<ChangeStateResp>> interfaceC67352kd);

    @E8M("/tikcast/linkmic/get_state/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @EKC({"content-type: application/json"})
    Object getState(@InterfaceC195727mC GetStateReq getStateReq, InterfaceC67352kd<? super R2P<GetStateResp>> interfaceC67352kd);

    @E8M("/tikcast/linkmic/ack_state/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @EKC({"content-type: application/json"})
    Object sendMessageAck(@InterfaceC195727mC AckStateReq ackStateReq, InterfaceC67352kd<? super R2P<AckStateResp>> interfaceC67352kd);

    @E8M("/tikcast/linkmic/ack_state/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<C28467BFf<CheckPermissionResponse>> sendMessageAckRx(@InterfaceC195727mC AckStateReq ackStateReq);
}
