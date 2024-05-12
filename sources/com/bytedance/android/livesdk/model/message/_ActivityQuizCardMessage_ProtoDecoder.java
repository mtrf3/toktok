package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.activity.quiz.model._QuizAnswerInfo_ProtoDecoder;
import com.bytedance.android.livesdk.activity.quiz.model._QuizCallUpWebview_ProtoDecoder;
import com.bytedance.android.livesdk.activity.quiz.model._QuizFinalResult_ProtoDecoder;
import com.bytedance.android.livesdk.activity.quiz.model._QuizQuestionInfo_ProtoDecoder;
import com.bytedance.android.livesdk.activity.quiz.model._QuizRulesIntroduction_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes17.dex */
public final class _ActivityQuizCardMessage_ProtoDecoder implements InterfaceC31105CIr<ActivityQuizCardMessage> {
    @Override // X.InterfaceC31105CIr
    public final ActivityQuizCardMessage LIZ(Q9H q9h) {
        ActivityQuizCardMessage activityQuizCardMessage = new ActivityQuizCardMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        activityQuizCardMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        activityQuizCardMessage.schema = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        activityQuizCardMessage.primaryId = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        activityQuizCardMessage.timestamp = q9h.LJIIJJI();
                        break;
                    case 5:
                        activityQuizCardMessage.question = _QuizQuestionInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        activityQuizCardMessage.answer = _QuizAnswerInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        activityQuizCardMessage.finalResult = _QuizFinalResult_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        activityQuizCardMessage.callUpWebview = _QuizCallUpWebview_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        activityQuizCardMessage.rulesIntroduction = _QuizRulesIntroduction_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 10:
                        activityQuizCardMessage.seiDelayMultiple = Float.intBitsToFloat(q9h.LJIIIIZZ());
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        activityQuizCardMessage.seiDelayBias = q9h.LJIIJJI();
                        break;
                    case 12:
                        activityQuizCardMessage.expiredTime = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return activityQuizCardMessage;
            }
        }
    }
}
