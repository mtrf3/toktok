package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.activity.quiz.model._QuizUserIdentityInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _ActivityQuizUserIdentityMessage_ProtoDecoder implements InterfaceC31105CIr<ActivityQuizUserIdentityMessage> {
    @Override // X.InterfaceC31105CIr
    public final ActivityQuizUserIdentityMessage LIZ(Q9H q9h) {
        ActivityQuizUserIdentityMessage activityQuizUserIdentityMessage = new ActivityQuizUserIdentityMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        activityQuizUserIdentityMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        activityQuizUserIdentityMessage.primaryId = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        activityQuizUserIdentityMessage.version = q9h.LJIIJJI();
                        break;
                    case 4:
                        activityQuizUserIdentityMessage.retainDeviceId = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        activityQuizUserIdentityMessage.timestamp = q9h.LJIIJJI();
                        break;
                    case 6:
                        activityQuizUserIdentityMessage.body = _QuizUserIdentityInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return activityQuizUserIdentityMessage;
            }
        }
    }
}
