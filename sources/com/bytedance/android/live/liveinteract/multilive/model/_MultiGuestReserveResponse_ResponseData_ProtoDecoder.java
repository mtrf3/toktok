package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestReserveResponse;
import com.bytedance.android.livesdk.model.message._AudienceReserveUserInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PerceptionMessage_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _MultiGuestReserveResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<MultiGuestReserveResponse.ResponseData> {
    public static MultiGuestReserveResponse.ResponseData LIZIZ(Q9H q9h) {
        MultiGuestReserveResponse.ResponseData responseData = new MultiGuestReserveResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        responseData.reserveUserInfo = _AudienceReserveUserInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    responseData.perceptionInfo = _PerceptionMessage_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MultiGuestReserveResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
