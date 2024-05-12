package tikcast.linkmic.controller;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.linkmic.common._LayoutState_ProtoDecoder;
import tikcast.linkmic.common._StateReqCommon_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _ChangeStateReq_ProtoDecoder implements InterfaceC31105CIr<ChangeStateReq> {
    @Override // X.InterfaceC31105CIr
    public final ChangeStateReq LIZ(Q9H q9h) {
        ChangeStateReq changeStateReq = new ChangeStateReq();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        changeStateReq.common = _StateReqCommon_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        changeStateReq.stateType = q9h.LJIIJ();
                        break;
                    case 3:
                        changeStateReq.clientTime = q9h.LJIIJJI();
                        break;
                    case 4:
                        changeStateReq.layoutState = _LayoutState_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        changeStateReq.onlineUserState = q9h.LJIIJ();
                        break;
                    case 6:
                        changeStateReq.audioMuted = q9h.LJIIJ();
                        break;
                    case 7:
                        changeStateReq.videoMuted = q9h.LJIIJ();
                        break;
                    case 8:
                        changeStateReq.networkState = q9h.LJIIJ();
                        break;
                    case 9:
                        changeStateReq.backgroundStickerId = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return changeStateReq;
            }
        }
    }
}
