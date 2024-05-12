package webcast.api.feed;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _FollowRecommendItem_ProtoDecoder implements InterfaceC31105CIr<FollowRecommendItem> {
    public static FollowRecommendItem LIZIZ(Q9H q9h) {
        FollowRecommendItem followRecommendItem = new FollowRecommendItem();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        followRecommendItem.recommendReason = Q9J.LIZIZ(q9h);
                    }
                } else {
                    followRecommendItem.data = _Room_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return followRecommendItem;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FollowRecommendItem LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
