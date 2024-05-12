package com.bytedance.android.livesdk.rank.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _SubRankTabInfo_ProtoDecoder implements InterfaceC31105CIr<SubRankTabInfo> {
    public static SubRankTabInfo LIZIZ(Q9H q9h) {
        SubRankTabInfo subRankTabInfo = new SubRankTabInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        subRankTabInfo.title = _Text_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    subRankTabInfo.rankType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return subRankTabInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubRankTabInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
