package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.eco.SubmitFeedbackResponse;

/* loaded from: classes14.dex */
public final class _SubmitFeedbackResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<SubmitFeedbackResponse.ResponseData> {
    @Override // X.InterfaceC31105CIr
    public final SubmitFeedbackResponse.ResponseData LIZ(Q9H q9h) {
        SubmitFeedbackResponse.ResponseData responseData = new SubmitFeedbackResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return responseData;
    }
}
