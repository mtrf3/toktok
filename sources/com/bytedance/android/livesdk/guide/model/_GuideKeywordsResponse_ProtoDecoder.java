package com.bytedance.android.livesdk.guide.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _GuideKeywordsResponse_ProtoDecoder implements InterfaceC31105CIr<GuideKeywordsResponse> {
    @Override // X.InterfaceC31105CIr
    public final GuideKeywordsResponse LIZ(Q9H q9h) {
        GuideKeywordsResponse guideKeywordsResponse = new GuideKeywordsResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    guideKeywordsResponse.data = _GuideKeywordsResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return guideKeywordsResponse;
            }
        }
    }
}
