package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.liveinteract.multilive.model.GuestMicCameraManageResponse;

/* loaded from: classes14.dex */
public final class _GuestMicCameraManageResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GuestMicCameraManageResponse.ResponseData> {
    public static GuestMicCameraManageResponse.ResponseData LIZIZ(Q9H q9h) {
        GuestMicCameraManageResponse.ResponseData responseData = new GuestMicCameraManageResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        responseData.expirationTime = q9h.LJIIJJI();
                    }
                } else {
                    responseData.ratelimit = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GuestMicCameraManageResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
