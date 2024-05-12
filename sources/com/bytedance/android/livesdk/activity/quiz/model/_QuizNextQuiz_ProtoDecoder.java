package com.bytedance.android.livesdk.activity.quiz.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _QuizNextQuiz_ProtoDecoder implements InterfaceC31105CIr<QuizNextQuiz> {
    public static QuizNextQuiz LIZIZ(Q9H q9h) {
        QuizNextQuiz quizNextQuiz = new QuizNextQuiz();
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
                                    quizNextQuiz.endTime = q9h.LJIIJJI();
                                }
                            } else {
                                quizNextQuiz.liveEventId = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            quizNextQuiz.quizId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        quizNextQuiz.rewardAmount = Q9J.LIZIZ(q9h);
                    }
                } else {
                    quizNextQuiz.time = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return quizNextQuiz;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final QuizNextQuiz LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
