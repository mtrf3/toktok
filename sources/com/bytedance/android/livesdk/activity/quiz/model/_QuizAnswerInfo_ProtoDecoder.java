package com.bytedance.android.livesdk.activity.quiz.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _QuizAnswerInfo_ProtoDecoder implements InterfaceC31105CIr<QuizAnswerInfo> {
    public static QuizAnswerInfo LIZIZ(Q9H q9h) {
        QuizAnswerInfo quizAnswerInfo = new QuizAnswerInfo();
        quizAnswerInfo.image = new ArrayList();
        quizAnswerInfo.correctAnswerImage = new ArrayList();
        quizAnswerInfo.nextQuiz = new ArrayList();
        quizAnswerInfo.options = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        quizAnswerInfo.messageType = q9h.LJIIJ();
                        break;
                    case 2:
                        quizAnswerInfo.quizId = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        quizAnswerInfo.quizType = q9h.LJIIJ();
                        break;
                    case 4:
                        quizAnswerInfo.extra = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        quizAnswerInfo.participantsCount = q9h.LJIIJJI();
                        break;
                    case 6:
                        quizAnswerInfo.questionId = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        quizAnswerInfo.questionNo = q9h.LJIIJ();
                        break;
                    case 8:
                        quizAnswerInfo.questionCount = q9h.LJIIJ();
                        break;
                    case 9:
                        quizAnswerInfo.questionType = q9h.LJIIJ();
                        break;
                    case 10:
                        quizAnswerInfo.title = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        quizAnswerInfo.image.add(_QuizImage_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 12:
                        quizAnswerInfo.options.add(_QuizQuestionOption_ProtoDecoder.LIZIZ(q9h));
                        break;
                    default:
                        switch (LJI) {
                            case 15:
                                quizAnswerInfo.correctAnswer = Q9J.LIZIZ(q9h);
                                break;
                            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                                quizAnswerInfo.statistics = _QuizStatistics_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 17:
                                quizAnswerInfo.nextQuiz.add(_QuizNextQuiz_ProtoDecoder.LIZIZ(q9h));
                                break;
                            case 18:
                                quizAnswerInfo.rewardAmount = Q9J.LIZIZ(q9h);
                                break;
                            case 19:
                                quizAnswerInfo.correctAnswerImage.add(_QuizImage_ProtoDecoder.LIZIZ(q9h));
                                break;
                            case 20:
                                quizAnswerInfo.sponsorCode = Q9J.LIZIZ(q9h);
                                break;
                            case 21:
                                quizAnswerInfo.displayDurationMs = q9h.LJIIJ();
                                break;
                            default:
                                switch (LJI) {
                                    case 51:
                                        quizAnswerInfo.extra1 = Q9J.LIZIZ(q9h);
                                        break;
                                    case 52:
                                        quizAnswerInfo.extra2 = Q9J.LIZIZ(q9h);
                                        break;
                                    case 53:
                                        quizAnswerInfo.extra3 = Q9J.LIZIZ(q9h);
                                        break;
                                    case 54:
                                        quizAnswerInfo.extra4 = Q9J.LIZIZ(q9h);
                                        break;
                                    case 55:
                                        quizAnswerInfo.extra5 = Q9J.LIZIZ(q9h);
                                        break;
                                    default:
                                        Q9J.LIZJ(q9h);
                                        break;
                                }
                        }
                }
            } else {
                q9h.LJ(LIZJ);
                return quizAnswerInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final QuizAnswerInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
