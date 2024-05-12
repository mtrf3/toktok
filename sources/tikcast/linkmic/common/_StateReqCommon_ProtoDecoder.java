package tikcast.linkmic.common;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.linkcore._Player_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _StateReqCommon_ProtoDecoder implements InterfaceC31105CIr<StateReqCommon> {
    public static StateReqCommon LIZIZ(Q9H q9h) {
        StateReqCommon stateReqCommon = new StateReqCommon();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    stateReqCommon.channelId = q9h.LJIIJJI();
                                }
                            } else {
                                stateReqCommon.myself = _Player_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            stateReqCommon.liveId = q9h.LJIIJJI();
                        }
                    } else {
                        stateReqCommon.appId = q9h.LJIIJJI();
                    }
                } else {
                    stateReqCommon.scene = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return stateReqCommon;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final StateReqCommon LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
