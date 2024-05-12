package com.bytedance.android.livesdk.activity.quiz.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _QuizStatistics_ProtoDecoder implements InterfaceC31105CIr<QuizStatistics> {
    public static QuizStatistics LIZIZ(Q9H q9h) {
        QuizStatistics quizStatistics = new QuizStatistics();
        quizStatistics.optionCount = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    quizStatistics.optionCount.add(_QuizStatistics_OptionCountItem_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return quizStatistics;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final QuizStatistics LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
