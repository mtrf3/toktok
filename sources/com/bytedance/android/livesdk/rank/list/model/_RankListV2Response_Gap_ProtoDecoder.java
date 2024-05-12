package com.bytedance.android.livesdk.rank.list.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;

/* loaded from: classes14.dex */
public final class _RankListV2Response_Gap_ProtoDecoder implements InterfaceC31105CIr<RankListV2Response.Gap> {
    public static RankListV2Response.Gap LIZIZ(Q9H q9h) {
        RankListV2Response.Gap gap = new RankListV2Response.Gap();
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
                                gap.banInfo = q9h.LJIIJ();
                            }
                        } else {
                            gap.displayType = q9h.LJIIJ();
                        }
                    } else {
                        gap.gapScore = q9h.LJIIJJI();
                    }
                } else {
                    gap.gapDescription = _Text_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return gap;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankListV2Response.Gap LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
