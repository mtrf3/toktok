package com.bytedance.android.livesdk.activity.quiz.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _QuizRewardRule_ProtoDecoder implements InterfaceC31105CIr<QuizRewardRule> {
    public static QuizRewardRule LIZIZ(Q9H q9h) {
        QuizRewardRule quizRewardRule = new QuizRewardRule();
        quizRewardRule.rewardList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            quizRewardRule.rewardList.add(_QuizRewardRule_RewardItem_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        quizRewardRule.sendAmount = q9h.LJIIJ();
                    }
                } else {
                    quizRewardRule.settlerCode = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return quizRewardRule;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final QuizRewardRule LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}