package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.gift.model._GiftNotice_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _GiftNoticeMessage_ProtoDecoder implements InterfaceC31105CIr<GiftNoticeMessage> {
    @Override // X.InterfaceC31105CIr
    public final GiftNoticeMessage LIZ(Q9H q9h) {
        GiftNoticeMessage giftNoticeMessage = new GiftNoticeMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        giftNoticeMessage.giftNotice = _GiftNotice_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    giftNoticeMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return giftNoticeMessage;
            }
        }
    }
}
