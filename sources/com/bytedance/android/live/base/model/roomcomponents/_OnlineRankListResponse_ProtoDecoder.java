package com.bytedance.android.live.base.model.roomcomponents;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.rank.api.model._Rank_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class _OnlineRankListResponse_ProtoDecoder implements InterfaceC31105CIr<OnlineRankListResponse> {
    public static OnlineRankListResponse LIZIZ(Q9H q9h) {
        OnlineRankListResponse onlineRankListResponse = new OnlineRankListResponse();
        onlineRankListResponse.ranks = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        onlineRankListResponse.ranks.add(_Rank_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 2:
                        onlineRankListResponse.selfInfo = _Rank_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        onlineRankListResponse.currency = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        onlineRankListResponse.isBroadcastMENAT = Q9J.LIZ(q9h);
                        break;
                    case 5:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 6:
                        onlineRankListResponse.total = (int) q9h.LJIIJJI();
                        break;
                    case 7:
                        onlineRankListResponse.ruleUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        onlineRankListResponse.config = _OnlineRankConfig_ProtoDecoder.LIZIZ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return onlineRankListResponse;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final OnlineRankListResponse LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
