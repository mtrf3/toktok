package com.bytedance.android.livesdk.activity.quiz.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _QuizRulesIntroduction_ProtoDecoder implements InterfaceC31105CIr<QuizRulesIntroduction> {
    public static QuizRulesIntroduction LIZIZ(Q9H q9h) {
        QuizRulesIntroduction quizRulesIntroduction = new QuizRulesIntroduction();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        quizRulesIntroduction.messageType = q9h.LJIIJ();
                        break;
                    case 2:
                        quizRulesIntroduction.quizId = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        quizRulesIntroduction.quizType = q9h.LJIIJ();
                        break;
                    case 4:
                        quizRulesIntroduction.extra = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        quizRulesIntroduction.rewardAmount = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        quizRulesIntroduction.questionCount = q9h.LJIIJ();
                        break;
                    case 7:
                        quizRulesIntroduction.userCount = q9h.LJIIJ();
                        break;
                    case 8:
                        quizRulesIntroduction.sponsorCode = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        quizRulesIntroduction.displayDurationMs = q9h.LJIIJ();
                        break;
                    default:
                        switch (LJI) {
                            case 51:
                                quizRulesIntroduction.extra1 = Q9J.LIZIZ(q9h);
                                break;
                            case 52:
                                quizRulesIntroduction.extra2 = Q9J.LIZIZ(q9h);
                                break;
                            case 53:
                                quizRulesIntroduction.extra3 = Q9J.LIZIZ(q9h);
                                break;
                            case 54:
                                quizRulesIntroduction.extra4 = Q9J.LIZIZ(q9h);
                                break;
                            case 55:
                                quizRulesIntroduction.extra5 = Q9J.LIZIZ(q9h);
                                break;
                            default:
                                Q9J.LIZJ(q9h);
                                break;
                        }
                }
            } else {
                q9h.LJ(LIZJ);
                return quizRulesIntroduction;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final QuizRulesIntroduction LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
