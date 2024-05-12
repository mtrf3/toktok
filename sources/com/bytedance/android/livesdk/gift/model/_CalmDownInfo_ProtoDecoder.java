package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _CalmDownInfo_ProtoDecoder implements InterfaceC31105CIr<CalmDownInfo> {
    public static CalmDownInfo LIZIZ(Q9H q9h) {
        CalmDownInfo calmDownInfo = new CalmDownInfo();
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
                                calmDownInfo.mShowPopup = (int) q9h.LJIIJJI();
                            }
                        } else {
                            calmDownInfo.mThresholdValue = q9h.LJIIJJI();
                        }
                    } else {
                        calmDownInfo.mTotalTime = (int) q9h.LJIIJJI();
                    }
                } else {
                    calmDownInfo.mRemainTime = (int) q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return calmDownInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CalmDownInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
