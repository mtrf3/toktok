package com.bytedance.android.livesdk.activity.quiz.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _QuizAnchorInfo_ProtoDecoder implements InterfaceC31105CIr<QuizAnchorInfo> {
    public static QuizAnchorInfo LIZIZ(Q9H q9h) {
        QuizAnchorInfo quizAnchorInfo = new QuizAnchorInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        quizAnchorInfo.uid = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        quizAnchorInfo.userName = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        quizAnchorInfo.roomId = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        quizAnchorInfo.category = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        quizAnchorInfo.description = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        quizAnchorInfo.avatar = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        quizAnchorInfo.backgroundImage = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        quizAnchorInfo.extra = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return quizAnchorInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final QuizAnchorInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
