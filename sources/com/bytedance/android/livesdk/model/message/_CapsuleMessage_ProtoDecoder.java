package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _CapsuleMessage_ProtoDecoder implements InterfaceC31105CIr<CapsuleMessage> {
    @Override // X.InterfaceC31105CIr
    public final CapsuleMessage LIZ(Q9H q9h) {
        CapsuleMessage capsuleMessage = new CapsuleMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        capsuleMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        capsuleMessage.icon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        capsuleMessage.desc = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        capsuleMessage.buttonText = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        capsuleMessage.schema = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        capsuleMessage.capsuleType = q9h.LJIIJ();
                        break;
                    case 7:
                        capsuleMessage.scene = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        capsuleMessage.bizParams = _CapsuleBizParams_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return capsuleMessage;
            }
        }
    }
}
