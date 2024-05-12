package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._BadgeStruct_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _LiveIntroMessage_ProtoDecoder implements InterfaceC31105CIr<LiveIntroMessage> {
    @Override // X.InterfaceC31105CIr
    public final LiveIntroMessage LIZ(Q9H q9h) {
        LiveIntroMessage liveIntroMessage = new LiveIntroMessage();
        liveIntroMessage.badges = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        liveIntroMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        liveIntroMessage.id = q9h.LJIIJJI();
                        break;
                    case 3:
                        liveIntroMessage.auditStatus = q9h.LJIIJ();
                        break;
                    case 4:
                        liveIntroMessage.content = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        liveIntroMessage.user = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        liveIntroMessage.introMode = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 7:
                        liveIntroMessage.badges.add(_BadgeStruct_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 8:
                        liveIntroMessage.contentLanguage = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return liveIntroMessage;
            }
        }
    }
}
