package com.bytedance.android.livesdk.rank.list.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;

/* loaded from: classes14.dex */
public final class _RankListV2Response_Bulletin_ProtoDecoder implements InterfaceC31105CIr<RankListV2Response.Bulletin> {
    public static RankListV2Response.Bulletin LIZIZ(Q9H q9h) {
        RankListV2Response.Bulletin bulletin = new RankListV2Response.Bulletin();
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
                                bulletin.noticeType = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            bulletin.icon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        bulletin.enable = Q9J.LIZ(q9h);
                    }
                } else {
                    bulletin.content = _Text_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return bulletin;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankListV2Response.Bulletin LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
