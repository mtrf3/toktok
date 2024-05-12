package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _LikeInfo_ProtoDecoder implements InterfaceC31105CIr<LikeInfo> {
    public static LikeInfo LIZIZ(Q9H q9h) {
        LikeInfo likeInfo = new LikeInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        likeInfo.showCnt = Integer.valueOf(q9h.LJIIJ());
                    }
                } else {
                    likeInfo.clickCnt = Integer.valueOf(q9h.LJIIJ());
                }
            } else {
                q9h.LJ(LIZJ);
                return likeInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LikeInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
