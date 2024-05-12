package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _GetGuestSettingResponse_ProtoDecoder implements InterfaceC31105CIr<GetGuestSettingResponse> {
    @Override // X.InterfaceC31105CIr
    public final GetGuestSettingResponse LIZ(Q9H q9h) {
        GetGuestSettingResponse getGuestSettingResponse = new GetGuestSettingResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    getGuestSettingResponse.data = _GetGuestSettingResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getGuestSettingResponse;
            }
        }
    }
}
