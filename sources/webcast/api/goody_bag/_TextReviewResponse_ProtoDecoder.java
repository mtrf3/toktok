package webcast.api.goody_bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _TextReviewResponse_ProtoDecoder implements InterfaceC31105CIr<TextReviewResponse> {
    @Override // X.InterfaceC31105CIr
    public final TextReviewResponse LIZ(Q9H q9h) {
        TextReviewResponse textReviewResponse = new TextReviewResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    textReviewResponse.data = _TextReviewResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return textReviewResponse;
            }
        }
    }
}
