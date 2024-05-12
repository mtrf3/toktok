package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.api.partnership.FeedbackTagResponse;

/* loaded from: classes17.dex */
public final class _FeedbackTagResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<FeedbackTagResponse.ResponseData> {
    public static FeedbackTagResponse.ResponseData LIZIZ(Q9H q9h) {
        FeedbackTagResponse.ResponseData responseData = new FeedbackTagResponse.ResponseData();
        responseData.tags = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.tags.add(_FeedbackTagResponse_ResponseData_FeedbackTag_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FeedbackTagResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
