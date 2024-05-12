package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _SubmitCPFeedbackRequest_ProtoDecoder implements InterfaceC31105CIr<SubmitCPFeedbackRequest> {
    @Override // X.InterfaceC31105CIr
    public final SubmitCPFeedbackRequest LIZ(Q9H q9h) {
        SubmitCPFeedbackRequest submitCPFeedbackRequest = new SubmitCPFeedbackRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    submitCPFeedbackRequest.images = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                submitCPFeedbackRequest.content = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            submitCPFeedbackRequest.feedbackSubId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        submitCPFeedbackRequest.roomId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    submitCPFeedbackRequest.gameId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return submitCPFeedbackRequest;
            }
        }
    }
}
