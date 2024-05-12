package com.bytedance.android.livesdk.goal.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.gift.model._LiveStreamSubGoal_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _SubGoalRecommendInfo_ProtoDecoder implements InterfaceC31105CIr<SubGoalRecommendInfo> {
    public static SubGoalRecommendInfo LIZIZ(Q9H q9h) {
        SubGoalRecommendInfo subGoalRecommendInfo = new SubGoalRecommendInfo();
        subGoalRecommendInfo.items = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    subGoalRecommendInfo.streamGoalRecExtra = _StreamGoalRecExtra_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                subGoalRecommendInfo.subscriptionRecExtra = _SubscriptionGoalRecExtra_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            subGoalRecommendInfo.description = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        subGoalRecommendInfo.items.add(_LiveStreamSubGoal_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    subGoalRecommendInfo.type = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return subGoalRecommendInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubGoalRecommendInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
