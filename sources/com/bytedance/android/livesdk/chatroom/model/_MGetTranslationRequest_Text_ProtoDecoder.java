package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.MGetTranslationRequest;

/* loaded from: classes6.dex */
public final class _MGetTranslationRequest_Text_ProtoDecoder implements InterfaceC31105CIr<MGetTranslationRequest.Text> {
    public static MGetTranslationRequest.Text LIZIZ(Q9H q9h) {
        MGetTranslationRequest.Text text = new MGetTranslationRequest.Text();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        text.text = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        text.textSource = q9h.LJIIJ();
                        break;
                    case 3:
                        text.msgId = q9h.LJIIJJI();
                        break;
                    case 4:
                        text.roomMessageHeatLevel = q9h.LJIIJJI();
                        break;
                    case 5:
                        text.atUsername = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        text.atNickname = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        text.emotesIndex = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return text;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MGetTranslationRequest.Text LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
