package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _ScreenMessage_ProtoDecoder implements InterfaceC31105CIr<ScreenMessage> {
    @Override // X.InterfaceC31105CIr
    public final ScreenMessage LIZ(Q9H q9h) {
        ScreenMessage screenMessage = new ScreenMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        screenMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        screenMessage.userInfo = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        screenMessage.chatType = (int) q9h.LJIIJJI();
                        break;
                    case 4:
                        screenMessage.content = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        screenMessage.priority = (int) q9h.LJIIJJI();
                        break;
                    case 6:
                        screenMessage.effect = _CeremonyEffect_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        screenMessage.backgroundImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        screenMessage.ceremonyEffect = _CeremonyEffect_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        screenMessage.background = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 10:
                        screenMessage.publicAreaCommon = _PublicAreaCommon_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return screenMessage;
            }
        }
    }
}
