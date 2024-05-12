package com.bytedance.android.livesdk.activity.quiz.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _QuizFinalResult_ProtoDecoder implements InterfaceC31105CIr<QuizFinalResult> {
    public static QuizFinalResult LIZIZ(Q9H q9h) {
        QuizFinalResult quizFinalResult = new QuizFinalResult();
        quizFinalResult.nextQuiz = new ArrayList();
        quizFinalResult.settledReward = new ArrayList();
        quizFinalResult.anchorList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        quizFinalResult.messageType = q9h.LJIIJ();
                        break;
                    case 2:
                        quizFinalResult.quizId = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        quizFinalResult.quizType = q9h.LJIIJ();
                        break;
                    case 4:
                        quizFinalResult.extra = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        quizFinalResult.settledReward.add(_QuizRewardRule_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 6:
                        quizFinalResult.nextQuiz.add(_QuizNextQuiz_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 7:
                        quizFinalResult.rewardAmount = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        quizFinalResult.questionCount = q9h.LJIIJ();
                        break;
                    case 9:
                        quizFinalResult.anchorList.add(_QuizAnchorInfo_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 10:
                        quizFinalResult.sponsorCode = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        quizFinalResult.displayDurationMs = q9h.LJIIJ();
                        break;
                    default:
                        switch (LJI) {
                            case 51:
                                quizFinalResult.extra1 = Q9J.LIZIZ(q9h);
                                break;
                            case 52:
                                quizFinalResult.extra2 = Q9J.LIZIZ(q9h);
                                break;
                            case 53:
                                quizFinalResult.extra3 = Q9J.LIZIZ(q9h);
                                break;
                            case 54:
                                quizFinalResult.extra4 = Q9J.LIZIZ(q9h);
                                break;
                            case 55:
                                quizFinalResult.extra5 = Q9J.LIZIZ(q9h);
                                break;
                            default:
                                Q9J.LIZJ(q9h);
                                break;
                        }
                }
            } else {
                q9h.LJ(LIZJ);
                return quizFinalResult;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final QuizFinalResult LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
