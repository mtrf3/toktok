package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _UnlockVoucherResult_ProtoDecoder implements InterfaceC31105CIr<UnlockVoucherResult> {
    @Override // X.InterfaceC31105CIr
    public final UnlockVoucherResult LIZ(Q9H q9h) {
        UnlockVoucherResult unlockVoucherResult = new UnlockVoucherResult();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    unlockVoucherResult.resp = _UnlockVoucherResult_Response_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return unlockVoucherResult;
            }
        }
    }
}
