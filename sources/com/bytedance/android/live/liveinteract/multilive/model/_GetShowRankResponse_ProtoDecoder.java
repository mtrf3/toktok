package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _GetShowRankResponse_ProtoDecoder implements InterfaceC31105CIr<GetShowRankResponse> {
    @Override // X.InterfaceC31105CIr
    public final GetShowRankResponse LIZ(Q9H q9h) {
        GetShowRankResponse getShowRankResponse = new GetShowRankResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    getShowRankResponse.data = _GetShowRankResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getShowRankResponse;
            }
        }
    }
}
