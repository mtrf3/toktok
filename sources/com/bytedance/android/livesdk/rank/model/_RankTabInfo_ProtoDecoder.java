package com.bytedance.android.livesdk.rank.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _RankTabInfo_ProtoDecoder implements InterfaceC31105CIr<RankTabInfo> {
    public static RankTabInfo LIZIZ(Q9H q9h) {
        RankTabInfo rankTabInfo = new RankTabInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 3) {
                        if (LJI != 4) {
                            Q9J.LIZJ(q9h);
                        } else {
                            rankTabInfo.listLynxType = q9h.LJIIJJI();
                        }
                    } else {
                        rankTabInfo.title = _Text_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    rankTabInfo.rankType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return rankTabInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankTabInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
