package webcast.api.feed;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _FollowRecommendListExtra_ProtoDecoder implements InterfaceC31105CIr<FollowRecommendListExtra> {
    public static FollowRecommendListExtra LIZIZ(Q9H q9h) {
        FollowRecommendListExtra followRecommendListExtra = new FollowRecommendListExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    followRecommendListExtra.now = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return followRecommendListExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FollowRecommendListExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
