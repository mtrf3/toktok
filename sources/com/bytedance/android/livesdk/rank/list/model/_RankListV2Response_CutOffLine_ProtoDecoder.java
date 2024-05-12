package com.bytedance.android.livesdk.rank.list.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;

/* loaded from: classes14.dex */
public final class _RankListV2Response_CutOffLine_ProtoDecoder implements InterfaceC31105CIr<RankListV2Response.CutOffLine> {
    public static RankListV2Response.CutOffLine LIZIZ(Q9H q9h) {
        RankListV2Response.CutOffLine cutOffLine = new RankListV2Response.CutOffLine();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        cutOffLine.content = _Text_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    cutOffLine.cutOffIndex = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return cutOffLine;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankListV2Response.CutOffLine LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
