package com.bytedance.android.livesdk.rank.list.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;

/* loaded from: classes14.dex */
public final class _RankListV2Response_BriefDescription_ProtoDecoder implements InterfaceC31105CIr<RankListV2Response.BriefDescription> {
    public static RankListV2Response.BriefDescription LIZIZ(Q9H q9h) {
        RankListV2Response.BriefDescription briefDescription = new RankListV2Response.BriefDescription();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            briefDescription.icon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        briefDescription.rule = _Text_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    briefDescription.title = _Text_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return briefDescription;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankListV2Response.BriefDescription LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}