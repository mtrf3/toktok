package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentResponse;
import webcast.data.multi_guest_play._ShowContent_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _GetShowContentResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GetShowContentResponse.ResponseData> {
    public static GetShowContentResponse.ResponseData LIZIZ(Q9H q9h) {
        GetShowContentResponse.ResponseData responseData = new GetShowContentResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.showContent = _ShowContent_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetShowContentResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
