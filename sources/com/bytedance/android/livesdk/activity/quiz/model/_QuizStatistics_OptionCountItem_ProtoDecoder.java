package com.bytedance.android.livesdk.activity.quiz.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.activity.quiz.model.QuizStatistics;

/* loaded from: classes17.dex */
public final class _QuizStatistics_OptionCountItem_ProtoDecoder implements InterfaceC31105CIr<QuizStatistics.OptionCountItem> {
    public static QuizStatistics.OptionCountItem LIZIZ(Q9H q9h) {
        QuizStatistics.OptionCountItem optionCountItem = new QuizStatistics.OptionCountItem();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        optionCountItem.count = q9h.LJIIJ();
                    }
                } else {
                    optionCountItem.optionId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return optionCountItem;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final QuizStatistics.OptionCountItem LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
