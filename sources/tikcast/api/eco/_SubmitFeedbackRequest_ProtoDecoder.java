package tikcast.api.eco;

import X.C29991Fr;
import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _SubmitFeedbackRequest_ProtoDecoder implements InterfaceC31105CIr<SubmitFeedbackRequest> {
    @Override // X.InterfaceC31105CIr
    public final SubmitFeedbackRequest LIZ(Q9H q9h) {
        SubmitFeedbackRequest submitFeedbackRequest = new SubmitFeedbackRequest();
        submitFeedbackRequest.feedbackDetailIdList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        submitFeedbackRequest.violationId = q9h.LJIIJJI();
                        break;
                    case 2:
                        submitFeedbackRequest.feedbackDetailId = q9h.LJIIJJI();
                        break;
                    case 3:
                        submitFeedbackRequest.punishRecordId = q9h.LJIIJJI();
                        break;
                    case 4:
                        submitFeedbackRequest.submitFeedbackScene = q9h.LJIIJ();
                        break;
                    case 5:
                        submitFeedbackRequest.feedbackType = q9h.LJIIJ();
                        break;
                    case 6:
                        submitFeedbackRequest.id = q9h.LJIIJJI();
                        break;
                    case 7:
                        C29991Fr.LIZ(q9h, submitFeedbackRequest.feedbackDetailIdList);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return submitFeedbackRequest;
            }
        }
    }
}
