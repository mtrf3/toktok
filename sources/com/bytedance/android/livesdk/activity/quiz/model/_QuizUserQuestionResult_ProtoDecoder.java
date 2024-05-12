package com.bytedance.android.livesdk.activity.quiz.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _QuizUserQuestionResult_ProtoDecoder implements InterfaceC31105CIr<QuizUserQuestionResult> {
    public static QuizUserQuestionResult LIZIZ(Q9H q9h) {
        QuizUserQuestionResult quizUserQuestionResult = new QuizUserQuestionResult();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        quizUserQuestionResult.correctAnswer = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        quizUserQuestionResult.userAnswer = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        quizUserQuestionResult.questionId = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        quizUserQuestionResult.questionNo = q9h.LJIIJ();
                        break;
                    case 5:
                        quizUserQuestionResult.simpleUserAnswer = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        quizUserQuestionResult.isUseRespawn = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return quizUserQuestionResult;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final QuizUserQuestionResult LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
