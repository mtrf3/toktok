package webcast.api.interaction.pictionary;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.interaction.pictionary.ReviewWordResponse;

/* loaded from: classes6.dex */
public final class _ReviewWordResponse_ReviewWordExtra_ProtoDecoder implements InterfaceC31105CIr<ReviewWordResponse.ReviewWordExtra> {
    public static ReviewWordResponse.ReviewWordExtra LIZIZ(Q9H q9h) {
        ReviewWordResponse.ReviewWordExtra reviewWordExtra = new ReviewWordResponse.ReviewWordExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    reviewWordExtra.now = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return reviewWordExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ReviewWordResponse.ReviewWordExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
