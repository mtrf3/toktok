package com.bytedance.android.livesdk.guide.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _GuideInfoRequest_ProtoDecoder implements InterfaceC31105CIr<GuideInfoRequest> {
    @Override // X.InterfaceC31105CIr
    public final GuideInfoRequest LIZ(Q9H q9h) {
        GuideInfoRequest guideInfoRequest = new GuideInfoRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    guideInfoRequest.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return guideInfoRequest;
            }
        }
    }
}
