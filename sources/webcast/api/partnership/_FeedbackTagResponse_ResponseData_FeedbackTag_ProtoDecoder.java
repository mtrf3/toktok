package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.api.partnership.FeedbackTagResponse;

/* loaded from: classes17.dex */
public final class _FeedbackTagResponse_ResponseData_FeedbackTag_ProtoDecoder implements InterfaceC31105CIr<FeedbackTagResponse.ResponseData.FeedbackTag> {
    public static FeedbackTagResponse.ResponseData.FeedbackTag LIZIZ(Q9H q9h) {
        FeedbackTagResponse.ResponseData.FeedbackTag feedbackTag = new FeedbackTagResponse.ResponseData.FeedbackTag();
        feedbackTag.subTags = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            feedbackTag.subTags.add(_FeedbackTagResponse_ResponseData_FeedbackTag_FeedbackSubTag_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        feedbackTag.name = Q9J.LIZIZ(q9h);
                    }
                } else {
                    feedbackTag.id = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return feedbackTag;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FeedbackTagResponse.ResponseData.FeedbackTag LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
