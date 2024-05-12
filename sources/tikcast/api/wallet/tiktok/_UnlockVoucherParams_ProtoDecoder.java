package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _UnlockVoucherParams_ProtoDecoder implements InterfaceC31105CIr<UnlockVoucherParams> {
    @Override // X.InterfaceC31105CIr
    public final UnlockVoucherParams LIZ(Q9H q9h) {
        UnlockVoucherParams unlockVoucherParams = new UnlockVoucherParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        unlockVoucherParams.paymentOrderId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    unlockVoucherParams.voucherToken = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return unlockVoucherParams;
            }
        }
    }
}
