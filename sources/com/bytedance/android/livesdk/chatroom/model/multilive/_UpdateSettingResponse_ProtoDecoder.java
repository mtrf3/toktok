package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _UpdateSettingResponse_ProtoDecoder implements InterfaceC31105CIr<UpdateSettingResponse> {
    @Override // X.InterfaceC31105CIr
    public final UpdateSettingResponse LIZ(Q9H q9h) {
        UpdateSettingResponse updateSettingResponse = new UpdateSettingResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        updateSettingResponse.extra = _UpdateSettingResponse_Extra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    updateSettingResponse.data = _UpdateRoomLayoutSettings_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return updateSettingResponse;
            }
        }
    }
}
