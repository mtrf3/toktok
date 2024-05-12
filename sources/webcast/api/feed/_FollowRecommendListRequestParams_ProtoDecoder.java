package webcast.api.feed;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _FollowRecommendListRequestParams_ProtoDecoder implements InterfaceC31105CIr<FollowRecommendListRequestParams> {
    @Override // X.InterfaceC31105CIr
    public final FollowRecommendListRequestParams LIZ(Q9H q9h) {
        FollowRecommendListRequestParams followRecommendListRequestParams = new FollowRecommendListRequestParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    followRecommendListRequestParams.reqFrom = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return followRecommendListRequestParams;
            }
        }
    }
}
