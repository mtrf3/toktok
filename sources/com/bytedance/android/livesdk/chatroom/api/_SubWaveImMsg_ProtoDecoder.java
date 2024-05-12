package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _SubWaveImMsg_ProtoDecoder implements InterfaceC31105CIr<SubWaveImMsg> {
    public static SubWaveImMsg LIZIZ(Q9H q9h) {
        SubWaveImMsg subWaveImMsg = new SubWaveImMsg();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                subWaveImMsg.waveReward = _WaveReward_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            subWaveImMsg.subWaveInfoCommon = _SubWaveInfoCommon_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        subWaveImMsg.newComeSubscriberInfo = _SubWaveSubscriberInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    subWaveImMsg.msgType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return subWaveImMsg;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubWaveImMsg LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
