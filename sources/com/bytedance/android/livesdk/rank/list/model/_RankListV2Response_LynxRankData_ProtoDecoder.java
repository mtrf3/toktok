package com.bytedance.android.livesdk.rank.list.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;

/* loaded from: classes14.dex */
public final class _RankListV2Response_LynxRankData_ProtoDecoder implements InterfaceC31105CIr<RankListV2Response.LynxRankData> {
    public static RankListV2Response.LynxRankData LIZIZ(Q9H q9h) {
        RankListV2Response.LynxRankData lynxRankData = new RankListV2Response.LynxRankData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    lynxRankData.lynxRankView = _RankListV2Response_RankView_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return lynxRankData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankListV2Response.LynxRankData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
