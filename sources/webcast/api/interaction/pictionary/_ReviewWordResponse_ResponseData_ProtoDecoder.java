package webcast.api.interaction.pictionary;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.interaction.pictionary.ReviewWordResponse;

/* loaded from: classes6.dex */
public final class _ReviewWordResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<ReviewWordResponse.ResponseData> {
    public static ReviewWordResponse.ResponseData LIZIZ(Q9H q9h) {
        ReviewWordResponse.ResponseData responseData = new ReviewWordResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.word = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ReviewWordResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
