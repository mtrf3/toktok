package com.bytedance.android.livesdk.activity.quiz.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.activity.quiz.model.QuizRewardRule;

/* loaded from: classes17.dex */
public final class _QuizRewardRule_RewardItem_ProtoDecoder implements InterfaceC31105CIr<QuizRewardRule.RewardItem> {
    public static QuizRewardRule.RewardItem LIZIZ(Q9H q9h) {
        QuizRewardRule.RewardItem rewardItem = new QuizRewardRule.RewardItem();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        rewardItem.rewardAmount = Q9J.LIZIZ(q9h);
                    }
                } else {
                    rewardItem.rewardName = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return rewardItem;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final QuizRewardRule.RewardItem LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
