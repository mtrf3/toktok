package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _GetLinkMicAdResponse_ProtoDecoder implements InterfaceC31105CIr<GetLinkMicAdResponse> {
    @Override // X.InterfaceC31105CIr
    public final GetLinkMicAdResponse LIZ(Q9H q9h) {
        GetLinkMicAdResponse getLinkMicAdResponse = new GetLinkMicAdResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    getLinkMicAdResponse.data = _GetLinkMicAdResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getLinkMicAdResponse;
            }
        }
    }
}
