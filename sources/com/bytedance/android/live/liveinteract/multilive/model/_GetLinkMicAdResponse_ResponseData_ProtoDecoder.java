package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.liveinteract.multilive.model.GetLinkMicAdResponse;
import tikcast.linkmic.common._LinkMicAdContent_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _GetLinkMicAdResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GetLinkMicAdResponse.ResponseData> {
    public static GetLinkMicAdResponse.ResponseData LIZIZ(Q9H q9h) {
        GetLinkMicAdResponse.ResponseData responseData = new GetLinkMicAdResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.linkAdContent = _LinkMicAdContent_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetLinkMicAdResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
