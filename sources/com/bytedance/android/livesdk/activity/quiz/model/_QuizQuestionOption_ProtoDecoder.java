package com.bytedance.android.livesdk.activity.quiz.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _QuizQuestionOption_ProtoDecoder implements InterfaceC31105CIr<QuizQuestionOption> {
    public static QuizQuestionOption LIZIZ(Q9H q9h) {
        QuizQuestionOption quizQuestionOption = new QuizQuestionOption();
        quizQuestionOption.image = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 2) {
                    if (LJI != 3) {
                        if (LJI != 4) {
                            Q9J.LIZJ(q9h);
                        } else {
                            quizQuestionOption.image.add(_QuizImage_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        quizQuestionOption.content = Q9J.LIZIZ(q9h);
                    }
                } else {
                    quizQuestionOption.optionId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return quizQuestionOption;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final QuizQuestionOption LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
