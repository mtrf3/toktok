package com.bytedance.android.livesdk.goal.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _OwnerSettingRequestParams_ProtoDecoder implements InterfaceC31105CIr<OwnerSettingRequestParams> {
    @Override // X.InterfaceC31105CIr
    public final OwnerSettingRequestParams LIZ(Q9H q9h) {
        OwnerSettingRequestParams ownerSettingRequestParams = new OwnerSettingRequestParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    ownerSettingRequestParams.capsuleGuide = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return ownerSettingRequestParams;
            }
        }
    }
}
