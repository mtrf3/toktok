package com.bytedance.android.livesdk.rank.list.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _RankListV2RequestParams_ProtoDecoder implements InterfaceC31105CIr<RankListV2RequestParams> {
    @Override // X.InterfaceC31105CIr
    public final RankListV2RequestParams LIZ(Q9H q9h) {
        RankListV2RequestParams rankListV2RequestParams = new RankListV2RequestParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 5) {
                                if (LJI != 6) {
                                    if (LJI != 7) {
                                        Q9J.LIZJ(q9h);
                                    } else {
                                        rankListV2RequestParams.leaguePhase = q9h.LJIIJ();
                                    }
                                } else {
                                    rankListV2RequestParams.useSimpleUser = Q9J.LIZ(q9h);
                                }
                            } else {
                                rankListV2RequestParams.gapInterval = q9h.LJIIJJI();
                            }
                        } else {
                            rankListV2RequestParams.rankType = q9h.LJIIJ();
                        }
                    } else {
                        rankListV2RequestParams.roomId = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    rankListV2RequestParams.anchorId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return rankListV2RequestParams;
            }
        }
    }
}
