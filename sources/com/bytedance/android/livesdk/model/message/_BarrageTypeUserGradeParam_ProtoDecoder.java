package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _BarrageTypeUserGradeParam_ProtoDecoder implements InterfaceC31105CIr<BarrageTypeUserGradeParam> {
    public static BarrageTypeUserGradeParam LIZIZ(Q9H q9h) {
        BarrageTypeUserGradeParam barrageTypeUserGradeParam = new BarrageTypeUserGradeParam();
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
                                barrageTypeUserGradeParam.user = _User_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            barrageTypeUserGradeParam.userId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        barrageTypeUserGradeParam.displayConfig = q9h.LJIIJ();
                    }
                } else {
                    barrageTypeUserGradeParam.currentGrade = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return barrageTypeUserGradeParam;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BarrageTypeUserGradeParam LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
