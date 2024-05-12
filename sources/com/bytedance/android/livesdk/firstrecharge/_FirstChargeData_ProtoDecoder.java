package com.bytedance.android.livesdk.firstrecharge;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.wallet._Diamond_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _FirstChargeData_ProtoDecoder implements InterfaceC31105CIr<FirstChargeData> {
    public static FirstChargeData LIZIZ(Q9H q9h) {
        FirstChargeData firstChargeData = new FirstChargeData();
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
                                firstChargeData.giftShowStyle = q9h.LJIIJ();
                            }
                        } else {
                            firstChargeData.diamond = _Diamond_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        firstChargeData.rule = _FirstChargeGuideEffectRule_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    firstChargeData.isFirstCharge = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return firstChargeData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FirstChargeData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
