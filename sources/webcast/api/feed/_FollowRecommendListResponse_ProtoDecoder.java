package webcast.api.feed;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _FollowRecommendListResponse_ProtoDecoder implements InterfaceC31105CIr<FollowRecommendListResponse> {
    @Override // X.InterfaceC31105CIr
    public final FollowRecommendListResponse LIZ(Q9H q9h) {
        FollowRecommendListResponse followRecommendListResponse = new FollowRecommendListResponse();
        followRecommendListResponse.data = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        followRecommendListResponse.extra = _FollowRecommendListExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    followRecommendListResponse.data.add(_FollowRecommendItem_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return followRecommendListResponse;
            }
        }
    }
}