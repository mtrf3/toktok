package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _BarrageTypeFansLevelParam_ProtoDecoder implements InterfaceC31105CIr<BarrageTypeFansLevelParam> {
    public static BarrageTypeFansLevelParam LIZIZ(Q9H q9h) {
        BarrageTypeFansLevelParam barrageTypeFansLevelParam = new BarrageTypeFansLevelParam();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 4) {
                            Q9J.LIZJ(q9h);
                        } else {
                            barrageTypeFansLevelParam.user = _User_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        barrageTypeFansLevelParam.displayConfig = q9h.LJIIJ();
                    }
                } else {
                    barrageTypeFansLevelParam.currentGrade = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return barrageTypeFansLevelParam;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BarrageTypeFansLevelParam LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
