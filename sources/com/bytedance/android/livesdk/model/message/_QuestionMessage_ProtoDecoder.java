package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _QuestionMessage_ProtoDecoder implements InterfaceC31105CIr<QuestionMessage> {
    @Override // X.InterfaceC31105CIr
    public final QuestionMessage LIZ(Q9H q9h) {
        QuestionMessage questionMessage = new QuestionMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        questionMessage.question = _Question_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    questionMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return questionMessage;
            }
        }
    }
}
