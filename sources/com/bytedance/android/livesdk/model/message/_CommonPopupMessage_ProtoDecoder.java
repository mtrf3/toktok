package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _CommonPopupMessage_ProtoDecoder implements InterfaceC31105CIr<CommonPopupMessage> {
    @Override // X.InterfaceC31105CIr
    public final CommonPopupMessage LIZ(Q9H q9h) {
        CommonPopupMessage commonPopupMessage = new CommonPopupMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            commonPopupMessage.anchorPopup = Q9J.LIZ(q9h);
                        }
                    } else {
                        commonPopupMessage.schemaUrl = Q9J.LIZIZ(q9h);
                    }
                } else {
                    commonPopupMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return commonPopupMessage;
            }
        }
    }
}