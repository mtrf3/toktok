package com.bytedance.android.livesdk.model.message.ext;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes13.dex */
public final class _EcTaskRefreshCouponListMessage_ProtoDecoder implements InterfaceC31105CIr<EcTaskRefreshCouponListMessage> {
    @Override // X.InterfaceC31105CIr
    public final EcTaskRefreshCouponListMessage LIZ(Q9H q9h) {
        EcTaskRefreshCouponListMessage ecTaskRefreshCouponListMessage = new EcTaskRefreshCouponListMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        ecTaskRefreshCouponListMessage.entity = _EcTaskRefreshCouponListEntity_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    ecTaskRefreshCouponListMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return ecTaskRefreshCouponListMessage;
            }
        }
    }
}
