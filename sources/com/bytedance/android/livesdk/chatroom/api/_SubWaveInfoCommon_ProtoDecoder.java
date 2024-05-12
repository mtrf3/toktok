package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _SubWaveInfoCommon_ProtoDecoder implements InterfaceC31105CIr<SubWaveInfoCommon> {
    public static SubWaveInfoCommon LIZIZ(Q9H q9h) {
        SubWaveInfoCommon subWaveInfoCommon = new SubWaveInfoCommon();
        subWaveInfoCommon.thanksList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        subWaveInfoCommon.subWaveSettings = _AnchorSubWaveCurrentSettings_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        subWaveInfoCommon.waveSubCount = q9h.LJIIJJI();
                        break;
                    case 3:
                        subWaveInfoCommon.totalSubCount = q9h.LJIIJJI();
                        break;
                    case 4:
                        subWaveInfoCommon.startTime = q9h.LJIIJJI();
                        break;
                    case 5:
                        subWaveInfoCommon.endTime = q9h.LJIIJJI();
                        break;
                    case 6:
                        subWaveInfoCommon.waveStatus = q9h.LJIIJ();
                        break;
                    case 7:
                        subWaveInfoCommon.thanksList.add(_SubWaveSubscriberInfo_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 8:
                        subWaveInfoCommon.waveTargetSubCount = q9h.LJIIJJI();
                        break;
                    case 9:
                        subWaveInfoCommon.waveOpenRecordId = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return subWaveInfoCommon;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubWaveInfoCommon LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
