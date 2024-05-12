package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.liveinteract.multilive.model.GetMultiGuestBonusResponse;

/* loaded from: classes14.dex */
public final class _GetMultiGuestBonusResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GetMultiGuestBonusResponse.ResponseData> {
    public static GetMultiGuestBonusResponse.ResponseData LIZIZ(Q9H q9h) {
        GetMultiGuestBonusResponse.ResponseData responseData = new GetMultiGuestBonusResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        responseData.multiGuestBonusValue = q9h.LJIIJJI();
                    }
                } else {
                    responseData.multiGuestBonusValueString = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetMultiGuestBonusResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
