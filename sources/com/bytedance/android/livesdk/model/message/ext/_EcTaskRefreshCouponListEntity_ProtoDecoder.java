package com.bytedance.android.livesdk.model.message.ext;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _EcTaskRefreshCouponListEntity_ProtoDecoder implements InterfaceC31105CIr<EcTaskRefreshCouponListEntity> {
    public static EcTaskRefreshCouponListEntity LIZIZ(Q9H q9h) {
        EcTaskRefreshCouponListEntity ecTaskRefreshCouponListEntity = new EcTaskRefreshCouponListEntity();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    ecTaskRefreshCouponListEntity.toastMsg = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return ecTaskRefreshCouponListEntity;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final EcTaskRefreshCouponListEntity LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
