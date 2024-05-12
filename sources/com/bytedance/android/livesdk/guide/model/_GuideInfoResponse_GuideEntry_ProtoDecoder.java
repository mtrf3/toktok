package com.bytedance.android.livesdk.guide.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.guide.model.GuideInfoResponse;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _GuideInfoResponse_GuideEntry_ProtoDecoder implements InterfaceC31105CIr<GuideInfoResponse.GuideEntry> {
    public static GuideInfoResponse.GuideEntry LIZIZ(Q9H q9h) {
        GuideInfoResponse.GuideEntry guideEntry = new GuideInfoResponse.GuideEntry();
        guideEntry.guidePageResources = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 10) {
                    Q9J.LIZJ(q9h);
                } else {
                    guideEntry.guidePageResources.add(_GuideInfoResponse_GuidePageResource_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return guideEntry;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GuideInfoResponse.GuideEntry LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
