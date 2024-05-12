package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _SubWaveInfo_ProtoDecoder implements InterfaceC31105CIr<SubWaveInfo> {
    public static SubWaveInfo LIZIZ(Q9H q9h) {
        SubWaveInfo subWaveInfo = new SubWaveInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            subWaveInfo.subWaveInfoCommon = _SubWaveInfoCommon_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        subWaveInfo.userWaveReward = _WaveReward_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    subWaveInfo.isUserWaveMember = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return subWaveInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubWaveInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
