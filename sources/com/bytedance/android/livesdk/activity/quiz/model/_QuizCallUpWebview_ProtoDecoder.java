package com.bytedance.android.livesdk.activity.quiz.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _QuizCallUpWebview_ProtoDecoder implements InterfaceC31105CIr<QuizCallUpWebview> {
    public static QuizCallUpWebview LIZIZ(Q9H q9h) {
        QuizCallUpWebview quizCallUpWebview = new QuizCallUpWebview();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        quizCallUpWebview.messageType = q9h.LJIIJ();
                        break;
                    case 2:
                        quizCallUpWebview.quizId = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        quizCallUpWebview.quizType = q9h.LJIIJ();
                        break;
                    case 4:
                        quizCallUpWebview.extra = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        quizCallUpWebview.userDataVersion = q9h.LJIIJ();
                        break;
                    case 6:
                        quizCallUpWebview.sponsorCode = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        quizCallUpWebview.displayDurationMs = q9h.LJIIJ();
                        break;
                    default:
                        switch (LJI) {
                            case 51:
                                quizCallUpWebview.extra1 = Q9J.LIZIZ(q9h);
                                break;
                            case 52:
                                quizCallUpWebview.extra2 = Q9J.LIZIZ(q9h);
                                break;
                            case 53:
                                quizCallUpWebview.extra3 = Q9J.LIZIZ(q9h);
                                break;
                            case 54:
                                quizCallUpWebview.extra4 = Q9J.LIZIZ(q9h);
                                break;
                            case 55:
                                quizCallUpWebview.extra5 = Q9J.LIZIZ(q9h);
                                break;
                            default:
                                Q9J.LIZJ(q9h);
                                break;
                        }
                }
            } else {
                q9h.LJ(LIZJ);
                return quizCallUpWebview;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final QuizCallUpWebview LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
