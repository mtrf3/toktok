package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _MicPositionData_ProtoDecoder implements InterfaceC31105CIr<MicPositionData> {
    public static MicPositionData LIZIZ(Q9H q9h) {
        MicPositionData micPositionData = new MicPositionData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        micPositionData.linkPosition = _LinkPosition_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    micPositionData.type = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return micPositionData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MicPositionData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
