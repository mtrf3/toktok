package com.bytedance.android.livesdk.gift.assets;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _ResourceModel_ProtoDecoder implements InterfaceC31105CIr<ResourceModel> {
    public static ResourceModel LIZIZ(Q9H q9h) {
        ResourceModel resourceModel = new ResourceModel();
        resourceModel.urlList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        resourceModel.uri = Q9J.LIZIZ(q9h);
                    }
                } else {
                    resourceModel.urlList.add(Q9J.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return resourceModel;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ResourceModel LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
