package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _QuestionSwitchMessage_ProtoDecoder implements InterfaceC31105CIr<QuestionSwitchMessage> {
    @Override // X.InterfaceC31105CIr
    public final QuestionSwitchMessage LIZ(Q9H q9h) {
        QuestionSwitchMessage questionSwitchMessage = new QuestionSwitchMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        questionSwitchMessage.on = Q9J.LIZ(q9h);
                    }
                } else {
                    questionSwitchMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return questionSwitchMessage;
            }
        }
    }
}
