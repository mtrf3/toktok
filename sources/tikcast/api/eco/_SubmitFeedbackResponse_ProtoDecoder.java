package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.eco.SubmitFeedbackResponse;

/* loaded from: classes14.dex */
public final class _SubmitFeedbackResponse_ProtoDecoder implements InterfaceC31105CIr<SubmitFeedbackResponse> {
    @Override // X.InterfaceC31105CIr
    public final SubmitFeedbackResponse LIZ(Q9H q9h) {
        SubmitFeedbackResponse submitFeedbackResponse = new SubmitFeedbackResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        submitFeedbackResponse.extra = _SubmitFeedbackResponse_ResponseExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    SubmitFeedbackResponse.ResponseData responseData = new SubmitFeedbackResponse.ResponseData();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    submitFeedbackResponse.data = responseData;
                }
            } else {
                q9h.LJ(LIZJ);
                return submitFeedbackResponse;
            }
        }
    }
}
