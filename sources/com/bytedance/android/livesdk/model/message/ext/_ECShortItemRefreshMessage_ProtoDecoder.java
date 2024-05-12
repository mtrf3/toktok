package com.bytedance.android.livesdk.model.message.ext;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes13.dex */
public final class _ECShortItemRefreshMessage_ProtoDecoder implements InterfaceC31105CIr<ECShortItemRefreshMessage> {
    @Override // X.InterfaceC31105CIr
    public final ECShortItemRefreshMessage LIZ(Q9H q9h) {
        ECShortItemRefreshMessage eCShortItemRefreshMessage = new ECShortItemRefreshMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        eCShortItemRefreshMessage.entity = _ShortItemRefreshEntity_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    eCShortItemRefreshMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return eCShortItemRefreshMessage;
            }
        }
    }
}
