package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _PayoutOnboardingDetailResult_ProtoDecoder implements InterfaceC31105CIr<PayoutOnboardingDetailResult> {
    @Override // X.InterfaceC31105CIr
    public final PayoutOnboardingDetailResult LIZ(Q9H q9h) {
        PayoutOnboardingDetailResult payoutOnboardingDetailResult = new PayoutOnboardingDetailResult();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    payoutOnboardingDetailResult.data = _PayoutOnboardingDetailResult_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return payoutOnboardingDetailResult;
            }
        }
    }
}
