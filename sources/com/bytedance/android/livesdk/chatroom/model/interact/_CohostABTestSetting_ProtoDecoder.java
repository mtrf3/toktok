package com.bytedance.android.livesdk.chatroom.model.interact;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _CohostABTestSetting_ProtoDecoder implements InterfaceC31105CIr<CohostABTestSetting> {
    public static CohostABTestSetting LIZIZ(Q9H q9h) {
        CohostABTestSetting cohostABTestSetting = new CohostABTestSetting();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        cohostABTestSetting.value = _CohostABTestList_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    cohostABTestSetting.key = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return cohostABTestSetting;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CohostABTestSetting LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
