package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.partnership.FeedbackTagResponse;

/* loaded from: classes17.dex */
public final class _FeedbackTagResponse_ResponseData_FeedbackTag_FeedbackSubTag_ProtoDecoder implements InterfaceC31105CIr<FeedbackTagResponse.ResponseData.FeedbackTag.FeedbackSubTag> {
    public static FeedbackTagResponse.ResponseData.FeedbackTag.FeedbackSubTag LIZIZ(Q9H q9h) {
        FeedbackTagResponse.ResponseData.FeedbackTag.FeedbackSubTag feedbackSubTag = new FeedbackTagResponse.ResponseData.FeedbackTag.FeedbackSubTag();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        feedbackSubTag.name = Q9J.LIZIZ(q9h);
                    }
                } else {
                    feedbackSubTag.id = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return feedbackSubTag;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FeedbackTagResponse.ResponseData.FeedbackTag.FeedbackSubTag LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
