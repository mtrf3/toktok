package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _QuestionSelectMessage_ProtoDecoder implements InterfaceC31105CIr<QuestionSelectMessage> {
    @Override // X.InterfaceC31105CIr
    public final QuestionSelectMessage LIZ(Q9H q9h) {
        QuestionSelectMessage questionSelectMessage = new QuestionSelectMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        questionSelectMessage.question = _Question_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    questionSelectMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return questionSelectMessage;
            }
        }
    }
}
