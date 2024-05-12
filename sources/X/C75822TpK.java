package X;

import com.bytedance.android.live.liveinteract.platform.statemanager.LinkStateApi;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ISessionAbility;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import tikcast.linkmic.common.StateReqCommon;
import tikcast.linkmic.controller.AckStateReq;
import tikcast.linkmic.controller.ChangeStateReq;
import tikcast.linkmic.controller.ChangeStateResp;
import tikcast.linkmic.controller.GetStateReq;
import tikcast.linkmic.controller.GetStateResp;

/* renamed from: X.TpK, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75822TpK implements InterfaceC75826TpO {
    public final /* synthetic */ ISessionAbility LJLIL;

    public final StateReqCommon LJJJIL() {
        int i;
        long j;
        String LLLLLLIL;
        Long LJJIZ;
        InterfaceC06390Mx LIZ = CN1.LIZ(IHostAppContext.class);
        ISessionAbility iSessionAbility = this.LJLIL;
        IHostAppContext iHostAppContext = (IHostAppContext) LIZ;
        StateReqCommon stateReqCommon = new StateReqCommon();
        if (iSessionAbility != null) {
            i = iSessionAbility.scene();
        } else {
            i = 4;
        }
        stateReqCommon.scene = i;
        long j2 = 0;
        if (iSessionAbility != null && (LLLLLLIL = iSessionAbility.LLLLLLIL()) != null && (LJJIZ = C38350F3i.LJJIZ(LLLLLLIL)) != null) {
            j = LJJIZ.longValue();
        } else {
            j = 0;
        }
        stateReqCommon.channelId = j;
        stateReqCommon.appId = iHostAppContext.appId();
        stateReqCommon.liveId = iHostAppContext.liveId();
        Room LJJIL = C29306Beo.LJJIL(DataChannelGlobal.LJLJJI);
        if (LJJIL != null) {
            j2 = LJJIL.getId();
        }
        stateReqCommon.myself = new Player(j2, C025908h.LIZ());
        return stateReqCommon;
    }

    public C75822TpK(ISessionAbility iSessionAbility) {
        this.LJLIL = iSessionAbility;
    }

    @Override // X.InterfaceC75826TpO
    public final Object LJJJJZI(long j, InterfaceC67352kd<? super R2P<GetStateResp>> interfaceC67352kd) {
        LinkStateApi linkStateApi = (LinkStateApi) Q7L.LIZIZ(LinkStateApi.class);
        GetStateReq getStateReq = new GetStateReq();
        getStateReq.common = LJJJIL();
        getStateReq.clientVersion = j;
        return linkStateApi.getState(getStateReq, interfaceC67352kd);
    }

    @Override // X.InterfaceC75826TpO
    public final Object LJLLI(long j, InterfaceC67352kd interfaceC67352kd) {
        LinkStateApi linkStateApi = (LinkStateApi) Q7L.LIZIZ(LinkStateApi.class);
        AckStateReq ackStateReq = new AckStateReq();
        ackStateReq.common = LJJJIL();
        ackStateReq.msgId = j;
        ackStateReq.msgType = 1;
        ackStateReq.clientReceiveTime = C30725C4b.LIZ();
        return linkStateApi.sendMessageAck(ackStateReq, interfaceC67352kd);
    }

    @Override // X.InterfaceC75826TpO
    public final Object changeState(ChangeStateReq changeStateReq, InterfaceC67352kd<? super R2P<ChangeStateResp>> interfaceC67352kd) {
        changeStateReq.common = LJJJIL();
        changeStateReq.clientTime = C30725C4b.LIZ();
        return ((LinkStateApi) Q7L.LIZIZ(LinkStateApi.class)).changeState(changeStateReq, interfaceC67352kd);
    }
}
