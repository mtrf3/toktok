package com.bytedance.android.livesdk.rank.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _RankEntranceV3RequestParams_ProtoDecoder implements InterfaceC31105CIr<RankEntranceV3RequestParams> {
    @Override // X.InterfaceC31105CIr
    public final RankEntranceV3RequestParams LIZ(Q9H q9h) {
        RankEntranceV3RequestParams rankEntranceV3RequestParams = new RankEntranceV3RequestParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        rankEntranceV3RequestParams.roomId = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    rankEntranceV3RequestParams.anchorId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return rankEntranceV3RequestParams;
            }
        }
    }
}
