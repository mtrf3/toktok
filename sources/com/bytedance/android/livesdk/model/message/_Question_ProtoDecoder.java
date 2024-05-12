package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _Question_ProtoDecoder implements InterfaceC31105CIr<Question> {
    public static Question LIZIZ(Q9H q9h) {
        Question question = new Question();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    if (LJI != 20) {
                                        if (LJI != 21) {
                                            Q9J.LIZJ(q9h);
                                        } else {
                                            question.answerFrom = q9h.LJIIJ();
                                        }
                                    } else {
                                        question.createFrom = q9h.LJIIJ();
                                    }
                                } else {
                                    question.user = _User_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                question.createTime = q9h.LJIIJJI();
                            }
                        } else {
                            question.answerStatus = q9h.LJIIJ();
                        }
                    } else {
                        question.content = Q9J.LIZIZ(q9h);
                    }
                } else {
                    question.questionId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return question;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final Question LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
