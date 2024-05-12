package com.bytedance.android.livesdk.activity.quiz.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _QuizImage_ProtoDecoder implements InterfaceC31105CIr<QuizImage> {
    public static QuizImage LIZIZ(Q9H q9h) {
        QuizImage quizImage = new QuizImage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    quizImage.url = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return quizImage;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final QuizImage LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
