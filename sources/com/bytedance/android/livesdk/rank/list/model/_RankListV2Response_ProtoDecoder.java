package com.bytedance.android.livesdk.rank.list.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _RankListV2Response_ProtoDecoder implements InterfaceC31105CIr<RankListV2Response> {
    @Override // X.InterfaceC31105CIr
    public final RankListV2Response LIZ(Q9H q9h) {
        RankListV2Response rankListV2Response = new RankListV2Response();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    rankListV2Response.data = _RankListV2Response_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return rankListV2Response;
            }
        }
    }
}
