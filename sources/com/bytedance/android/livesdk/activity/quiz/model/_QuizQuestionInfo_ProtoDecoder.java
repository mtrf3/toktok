package com.bytedance.android.livesdk.activity.quiz.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _QuizQuestionInfo_ProtoDecoder implements InterfaceC31105CIr<QuizQuestionInfo> {
    public static QuizQuestionInfo LIZIZ(Q9H q9h) {
        QuizQuestionInfo quizQuestionInfo = new QuizQuestionInfo();
        quizQuestionInfo.image = new ArrayList();
        quizQuestionInfo.nextQuiz = new ArrayList();
        quizQuestionInfo.options = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        quizQuestionInfo.messageType = q9h.LJIIJ();
                        break;
                    case 2:
                        quizQuestionInfo.quizId = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        quizQuestionInfo.quizType = q9h.LJIIJ();
                        break;
                    case 4:
                        quizQuestionInfo.extra = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        quizQuestionInfo.participantsCount = q9h.LJIIJ();
                        break;
                    case 6:
                        quizQuestionInfo.questionId = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        quizQuestionInfo.questionNo = q9h.LJIIJ();
                        break;
                    case 8:
                        quizQuestionInfo.questionCount = q9h.LJIIJ();
                        break;
                    case 9:
                        quizQuestionInfo.questionType = q9h.LJIIJ();
                        break;
                    case 10:
                        quizQuestionInfo.title = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        quizQuestionInfo.image.add(_QuizImage_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 12:
                        quizQuestionInfo.options.add(_QuizQuestionOption_ProtoDecoder.LIZIZ(q9h));
                        break;
                    default:
                        switch (LJI) {
                            case 15:
                                quizQuestionInfo.rewardAmount = Q9J.LIZIZ(q9h);
                                break;
                            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                                quizQuestionInfo.questionDurationMs = q9h.LJIIJ();
                                break;
                            case 17:
                                quizQuestionInfo.nextQuiz.add(_QuizNextQuiz_ProtoDecoder.LIZIZ(q9h));
                                break;
                            case 18:
                                quizQuestionInfo.sponsorCode = Q9J.LIZIZ(q9h);
                                break;
                            case 19:
                                quizQuestionInfo.displayDurationMs = q9h.LJIIJ();
                                break;
                            default:
                                switch (LJI) {
                                    case 51:
                                        quizQuestionInfo.extra1 = Q9J.LIZIZ(q9h);
                                        break;
                                    case 52:
                                        quizQuestionInfo.extra2 = Q9J.LIZIZ(q9h);
                                        break;
                                    case 53:
                                        quizQuestionInfo.extra3 = Q9J.LIZIZ(q9h);
                                        break;
                                    case 54:
                                        quizQuestionInfo.extra4 = Q9J.LIZIZ(q9h);
                                        break;
                                    case 55:
                                        quizQuestionInfo.extra5 = Q9J.LIZIZ(q9h);
                                        break;
                                    default:
                                        Q9J.LIZJ(q9h);
                                        break;
                                }
                        }
                }
            } else {
                q9h.LJ(LIZJ);
                return quizQuestionInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final QuizQuestionInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
