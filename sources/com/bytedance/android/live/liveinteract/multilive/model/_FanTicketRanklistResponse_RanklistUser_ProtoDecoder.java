package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model.FanTicketRanklistResponse;

/* loaded from: classes14.dex */
public final class _FanTicketRanklistResponse_RanklistUser_ProtoDecoder implements InterfaceC31105CIr<FanTicketRanklistResponse.RanklistUser> {
    public static FanTicketRanklistResponse.RanklistUser LIZIZ(Q9H q9h) {
        FanTicketRanklistResponse.RanklistUser ranklistUser = new FanTicketRanklistResponse.RanklistUser();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            ranklistUser.index = q9h.LJIIJJI();
                        }
                    } else {
                        ranklistUser.score = q9h.LJIIJJI();
                    }
                } else {
                    ranklistUser.user = _User_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return ranklistUser;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FanTicketRanklistResponse.RanklistUser LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
