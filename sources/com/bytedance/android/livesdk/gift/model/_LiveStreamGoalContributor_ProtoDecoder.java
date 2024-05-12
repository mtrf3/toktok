package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _LiveStreamGoalContributor_ProtoDecoder implements InterfaceC31105CIr<LiveStreamGoalContributor> {
    public static LiveStreamGoalContributor LIZIZ(Q9H q9h) {
        LiveStreamGoalContributor liveStreamGoalContributor = new LiveStreamGoalContributor();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        liveStreamGoalContributor.userId = q9h.LJIIJJI();
                        break;
                    case 2:
                        liveStreamGoalContributor.avatar = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        liveStreamGoalContributor.displayId = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        liveStreamGoalContributor.score = q9h.LJIIJJI();
                        break;
                    case 5:
                        liveStreamGoalContributor.userIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        liveStreamGoalContributor.inRoom = Q9J.LIZ(q9h);
                        break;
                    case 7:
                        liveStreamGoalContributor.isFriend = Q9J.LIZ(q9h);
                        break;
                    case 8:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 9:
                        liveStreamGoalContributor.followByOwner = Q9J.LIZ(q9h);
                        break;
                    case 10:
                        liveStreamGoalContributor.isFistContribute = Q9J.LIZ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return liveStreamGoalContributor;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LiveStreamGoalContributor LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
