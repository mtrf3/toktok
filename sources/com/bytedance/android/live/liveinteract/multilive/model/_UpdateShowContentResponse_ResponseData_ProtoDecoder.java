package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentResponse;
import webcast.data.multi_guest_play._ShowContent_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _UpdateShowContentResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<UpdateShowContentResponse.ResponseData> {
    public static UpdateShowContentResponse.ResponseData LIZIZ(Q9H q9h) {
        UpdateShowContentResponse.ResponseData responseData = new UpdateShowContentResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        responseData.showContent = _ShowContent_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    responseData.success = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UpdateShowContentResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
