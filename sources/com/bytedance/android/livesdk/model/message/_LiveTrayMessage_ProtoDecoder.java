package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _LiveTrayMessage_ProtoDecoder implements InterfaceC31105CIr<LiveTrayMessage> {
    @Override // X.InterfaceC31105CIr
    public final LiveTrayMessage LIZ(Q9H q9h) {
        LiveTrayMessage liveTrayMessage = new LiveTrayMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        liveTrayMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        liveTrayMessage.user = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        liveTrayMessage.title = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        liveTrayMessage.describe = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        liveTrayMessage.comboCount = (int) q9h.LJIIJJI();
                        break;
                    case 6:
                        liveTrayMessage.groupCount = (int) q9h.LJIIJJI();
                        break;
                    case 7:
                        liveTrayMessage.image = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return liveTrayMessage;
            }
        }
    }
}
