package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _LiveStreamSubGoalGift_ProtoDecoder implements InterfaceC31105CIr<LiveStreamSubGoalGift> {
    public static LiveStreamSubGoalGift LIZIZ(Q9H q9h) {
        LiveStreamSubGoalGift liveStreamSubGoalGift = new LiveStreamSubGoalGift();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                liveStreamSubGoalGift.type = q9h.LJIIJ();
                            }
                        } else {
                            liveStreamSubGoalGift.diamondCount = q9h.LJIIJJI();
                        }
                    } else {
                        liveStreamSubGoalGift.icon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    liveStreamSubGoalGift.name = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return liveStreamSubGoalGift;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LiveStreamSubGoalGift LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
