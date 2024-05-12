package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _SocialMessage_ProtoDecoder implements InterfaceC31105CIr<SocialMessage> {
    public static SocialMessage LIZIZ(Q9H q9h) {
        SocialMessage socialMessage = new SocialMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        socialMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        socialMessage.user = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        socialMessage.shareType = q9h.LJIIJJI();
                        break;
                    case 4:
                        socialMessage.action = q9h.LJIIJJI();
                        break;
                    case 5:
                        socialMessage.shareTarget = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        socialMessage.followCount = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 7:
                        socialMessage.shareDisplayStyle = q9h.LJIIJJI();
                        break;
                    case 8:
                        socialMessage.shareCount = (int) q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return socialMessage;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SocialMessage LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
