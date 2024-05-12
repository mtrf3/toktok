package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _GiftGlobalMessage_ProtoDecoder implements InterfaceC31105CIr<GiftGlobalMessage> {
    @Override // X.InterfaceC31105CIr
    public final GiftGlobalMessage LIZ(Q9H q9h) {
        GiftGlobalMessage giftGlobalMessage = new GiftGlobalMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                giftGlobalMessage.mNotifyMessage = _RoomNotifyMessage_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            giftGlobalMessage.mLeftIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        giftGlobalMessage.mFromUserId = q9h.LJIIJJI();
                    }
                } else {
                    giftGlobalMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return giftGlobalMessage;
            }
        }
    }
}
