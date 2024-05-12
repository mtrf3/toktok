package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _GuestMicCameraManageResponse_ProtoDecoder implements InterfaceC31105CIr<GuestMicCameraManageResponse> {
    @Override // X.InterfaceC31105CIr
    public final GuestMicCameraManageResponse LIZ(Q9H q9h) {
        GuestMicCameraManageResponse guestMicCameraManageResponse = new GuestMicCameraManageResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        guestMicCameraManageResponse.extra = _GuestMicCameraManageResponse_Extra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    guestMicCameraManageResponse.data = _GuestMicCameraManageResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return guestMicCameraManageResponse;
            }
        }
    }
}
