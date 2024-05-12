package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model._LikeEffect_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _LikeMessage_ProtoDecoder implements InterfaceC31105CIr<LikeMessage> {
    public static LikeMessage LIZIZ(Q9H q9h) {
        LikeMessage likeMessage = new LikeMessage();
        likeMessage.specifiedDisplayText = new ArrayList();
        likeMessage.likeEffect = new ArrayList();
        likeMessage.icons = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        likeMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        likeMessage.count = (int) q9h.LJIIJJI();
                        break;
                    case 3:
                        likeMessage.total = q9h.LJIIJJI();
                        break;
                    case 4:
                        likeMessage.color = (int) q9h.LJIIJJI();
                        break;
                    case 5:
                        likeMessage.user = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        likeMessage.icon = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        likeMessage.icons.add(_ImageModel_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 8:
                        likeMessage.specifiedDisplayText.add(_SpecifiedDisplayText_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 9:
                        likeMessage.effectCnt = q9h.LJIIJJI();
                        break;
                    case 10:
                        likeMessage.likeEffect.add(_LikeEffect_ProtoDecoder.LIZIZ(q9h));
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return likeMessage;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LikeMessage LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
