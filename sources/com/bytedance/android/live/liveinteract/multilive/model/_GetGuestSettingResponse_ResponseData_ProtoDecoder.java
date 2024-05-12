package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.liveinteract.multilive.model.GetGuestSettingResponse;

/* loaded from: classes14.dex */
public final class _GetGuestSettingResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GetGuestSettingResponse.ResponseData> {
    public static GetGuestSettingResponse.ResponseData LIZIZ(Q9H q9h) {
        GetGuestSettingResponse.ResponseData responseData = new GetGuestSettingResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            responseData.guestCameraStatus = q9h.LJIIJ();
                        }
                    } else {
                        responseData.rankListShowAction = q9h.LJIIJ();
                    }
                } else {
                    responseData.flowDistribute = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetGuestSettingResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
