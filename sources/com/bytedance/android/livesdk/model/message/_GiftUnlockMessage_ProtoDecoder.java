package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model._Gift_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _GiftUnlockMessage_ProtoDecoder implements InterfaceC31105CIr<GiftUnlockMessage> {
    @Override // X.InterfaceC31105CIr
    public final GiftUnlockMessage LIZ(Q9H q9h) {
        GiftUnlockMessage giftUnlockMessage = new GiftUnlockMessage();
        giftUnlockMessage.gifts = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            giftUnlockMessage.bubbleText = _Text_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        giftUnlockMessage.gifts.add(_Gift_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    giftUnlockMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return giftUnlockMessage;
            }
        }
    }
}
