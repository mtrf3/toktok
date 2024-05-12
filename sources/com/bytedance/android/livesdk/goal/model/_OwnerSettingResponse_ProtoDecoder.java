package com.bytedance.android.livesdk.goal.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _OwnerSettingResponse_ProtoDecoder implements InterfaceC31105CIr<OwnerSettingResponse> {
    @Override // X.InterfaceC31105CIr
    public final OwnerSettingResponse LIZ(Q9H q9h) {
        OwnerSettingResponse ownerSettingResponse = new OwnerSettingResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    ownerSettingResponse.data = _OwnerSettingResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return ownerSettingResponse;
            }
        }
    }
}
