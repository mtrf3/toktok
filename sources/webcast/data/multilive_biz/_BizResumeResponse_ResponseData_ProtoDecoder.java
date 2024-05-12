package webcast.data.multilive_biz;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.data.multi_guest_play._ShowContent_ProtoDecoder;
import webcast.data.multilive_biz.BizResumeResponse;

/* loaded from: classes14.dex */
public final class _BizResumeResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<BizResumeResponse.ResponseData> {
    public static BizResumeResponse.ResponseData LIZIZ(Q9H q9h) {
        BizResumeResponse.ResponseData responseData = new BizResumeResponse.ResponseData();
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
                    responseData.isShowing = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BizResumeResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
