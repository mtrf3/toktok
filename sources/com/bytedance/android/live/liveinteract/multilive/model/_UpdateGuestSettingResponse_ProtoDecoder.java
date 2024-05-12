package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _UpdateGuestSettingResponse_ProtoDecoder implements InterfaceC31105CIr<UpdateGuestSettingResponse> {
    @Override // X.InterfaceC31105CIr
    public final UpdateGuestSettingResponse LIZ(Q9H q9h) {
        UpdateGuestSettingResponse updateGuestSettingResponse = new UpdateGuestSettingResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        updateGuestSettingResponse.extra = _UpdateGuestSettingResponse_Extra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    updateGuestSettingResponse.data = _UpdateGuestSettingResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return updateGuestSettingResponse;
            }
        }
    }
}
