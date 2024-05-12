package com.bytedance.android.livesdk.rank.list.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import webcast.api.ranklist._LynxRankView_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _RankListV2Response_Data_ProtoDecoder implements InterfaceC31105CIr<RankListV2Response.Data> {
    public static RankListV2Response.Data LIZIZ(Q9H q9h) {
        RankListV2Response.Data data = new RankListV2Response.Data();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        data.lynxRankView = _LynxRankView_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    data.rankView = _RankListV2Response_RankView_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankListV2Response.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
