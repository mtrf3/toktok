package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _FanTicketRanklistResponse_ProtoDecoder implements InterfaceC31105CIr<FanTicketRanklistResponse> {
    @Override // X.InterfaceC31105CIr
    public final FanTicketRanklistResponse LIZ(Q9H q9h) {
        FanTicketRanklistResponse fanTicketRanklistResponse = new FanTicketRanklistResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        fanTicketRanklistResponse.extra = _FanTicketRanklistResponse_Extra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    fanTicketRanklistResponse.data = _FanTicketRanklistResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return fanTicketRanklistResponse;
            }
        }
    }
}
