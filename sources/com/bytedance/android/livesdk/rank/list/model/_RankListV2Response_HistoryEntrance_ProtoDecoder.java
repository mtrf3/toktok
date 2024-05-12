package com.bytedance.android.livesdk.rank.list.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _RankListV2Response_HistoryEntrance_ProtoDecoder implements InterfaceC31105CIr<RankListV2Response.HistoryEntrance> {
    public static RankListV2Response.HistoryEntrance LIZIZ(Q9H q9h) {
        RankListV2Response.HistoryEntrance historyEntrance = new RankListV2Response.HistoryEntrance();
        historyEntrance.ranks = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    historyEntrance.lastPeriodRank = q9h.LJIIJJI();
                                }
                            } else {
                                historyEntrance.ranks.add(_RankListV2Response_RankInfo_ProtoDecoder.LIZIZ(q9h));
                            }
                        } else {
                            historyEntrance.titleText = _Text_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        historyEntrance.entranceText = _Text_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    historyEntrance.ifHasHistory = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return historyEntrance;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankListV2Response.HistoryEntrance LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
