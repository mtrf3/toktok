package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateGuestSettingResponse;

/* loaded from: classes14.dex */
public final class _UpdateGuestSettingResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<UpdateGuestSettingResponse.ResponseData> {
    public static UpdateGuestSettingResponse.ResponseData LIZIZ(Q9H q9h) {
        UpdateGuestSettingResponse.ResponseData responseData = new UpdateGuestSettingResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.updateResult = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UpdateGuestSettingResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
