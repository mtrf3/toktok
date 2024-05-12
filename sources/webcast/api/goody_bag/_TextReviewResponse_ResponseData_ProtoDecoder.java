package webcast.api.goody_bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.goody_bag.TextReviewResponse;

/* loaded from: classes17.dex */
public final class _TextReviewResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<TextReviewResponse.ResponseData> {
    public static TextReviewResponse.ResponseData LIZIZ(Q9H q9h) {
        TextReviewResponse.ResponseData responseData = new TextReviewResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.pass = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TextReviewResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
