package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _PayoutOnboardingDetailParams_ProtoDecoder implements InterfaceC31105CIr<PayoutOnboardingDetailParams> {
    @Override // X.InterfaceC31105CIr
    public final PayoutOnboardingDetailParams LIZ(Q9H q9h) {
        PayoutOnboardingDetailParams payoutOnboardingDetailParams = new PayoutOnboardingDetailParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    payoutOnboardingDetailParams.source = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return payoutOnboardingDetailParams;
            }
        }
    }
}
