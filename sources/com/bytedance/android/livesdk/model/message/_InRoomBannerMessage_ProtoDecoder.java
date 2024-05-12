package com.bytedance.android.livesdk.model.message;

import X.CAS;
import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* loaded from: classes6.dex */
public final class _InRoomBannerMessage_ProtoDecoder implements InterfaceC31105CIr<InRoomBannerMessage> {
    @Override // X.InterfaceC31105CIr
    public final InRoomBannerMessage LIZ(Q9H q9h) {
        InRoomBannerMessage inRoomBannerMessage = new InRoomBannerMessage();
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
                                inRoomBannerMessage.actionType = Integer.valueOf(q9h.LJIIJ());
                            }
                        } else {
                            inRoomBannerMessage.position = q9h.LJIIJ();
                        }
                    } else {
                        inRoomBannerMessage.extra = GsonProtectorUtils.parse(CAS.LIZ, Q9J.LIZIZ(q9h)).LJIIZILJ();
                    }
                } else {
                    inRoomBannerMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return inRoomBannerMessage;
            }
        }
    }
}
