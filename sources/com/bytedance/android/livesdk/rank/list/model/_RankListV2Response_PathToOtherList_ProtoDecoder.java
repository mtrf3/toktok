package com.bytedance.android.livesdk.rank.list.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;

/* loaded from: classes14.dex */
public final class _RankListV2Response_PathToOtherList_ProtoDecoder implements InterfaceC31105CIr<RankListV2Response.PathToOtherList> {
    public static RankListV2Response.PathToOtherList LIZIZ(Q9H q9h) {
        RankListV2Response.PathToOtherList pathToOtherList = new RankListV2Response.PathToOtherList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            pathToOtherList.schema = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        pathToOtherList.description = _Text_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    pathToOtherList.existFlowPath = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return pathToOtherList;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankListV2Response.PathToOtherList LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
