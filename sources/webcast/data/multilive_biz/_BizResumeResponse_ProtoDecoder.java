package webcast.data.multilive_biz;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BizResumeResponse_ProtoDecoder implements InterfaceC31105CIr<BizResumeResponse> {
    public static BizResumeResponse LIZIZ(Q9H q9h) {
        BizResumeResponse bizResumeResponse = new BizResumeResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    bizResumeResponse.data = _BizResumeResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return bizResumeResponse;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BizResumeResponse LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
