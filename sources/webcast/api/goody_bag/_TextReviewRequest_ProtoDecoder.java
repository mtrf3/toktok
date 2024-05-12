package webcast.api.goody_bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _TextReviewRequest_ProtoDecoder implements InterfaceC31105CIr<TextReviewRequest> {
    @Override // X.InterfaceC31105CIr
    public final TextReviewRequest LIZ(Q9H q9h) {
        TextReviewRequest textReviewRequest = new TextReviewRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        textReviewRequest.roomId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    textReviewRequest.text = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return textReviewRequest;
            }
        }
    }
}
