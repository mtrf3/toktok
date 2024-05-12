package webcast.api.interaction.pictionary;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _ReviewWordResponse_ProtoDecoder implements InterfaceC31105CIr<ReviewWordResponse> {
    @Override // X.InterfaceC31105CIr
    public final ReviewWordResponse LIZ(Q9H q9h) {
        ReviewWordResponse reviewWordResponse = new ReviewWordResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        reviewWordResponse.extra = _ReviewWordResponse_ReviewWordExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    reviewWordResponse.data = _ReviewWordResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return reviewWordResponse;
            }
        }
    }
}
