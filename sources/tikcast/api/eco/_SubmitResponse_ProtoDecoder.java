package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _SubmitResponse_ProtoDecoder implements InterfaceC31105CIr<SubmitResponse> {
    @Override // X.InterfaceC31105CIr
    public final SubmitResponse LIZ(Q9H q9h) {
        SubmitResponse submitResponse = new SubmitResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    submitResponse.data = _SubmitResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return submitResponse;
            }
        }
    }
}
