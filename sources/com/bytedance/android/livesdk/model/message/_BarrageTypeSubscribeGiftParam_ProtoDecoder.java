package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _BarrageTypeSubscribeGiftParam_ProtoDecoder implements InterfaceC31105CIr<BarrageTypeSubscribeGiftParam> {
    public static BarrageTypeSubscribeGiftParam LIZIZ(Q9H q9h) {
        BarrageTypeSubscribeGiftParam barrageTypeSubscribeGiftParam = new BarrageTypeSubscribeGiftParam();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        barrageTypeSubscribeGiftParam.showGiftSubCount = Q9J.LIZ(q9h);
                    }
                } else {
                    barrageTypeSubscribeGiftParam.giftSubCount = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return barrageTypeSubscribeGiftParam;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BarrageTypeSubscribeGiftParam LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
