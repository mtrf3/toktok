package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.wallet.tiktok.PayoutOnboardingDetailResult;

/* loaded from: classes6.dex */
public final class _PayoutOnboardingDetailResult_Data_ProtoDecoder implements InterfaceC31105CIr<PayoutOnboardingDetailResult.Data> {
    public static PayoutOnboardingDetailResult.Data LIZIZ(Q9H q9h) {
        PayoutOnboardingDetailResult.Data data = new PayoutOnboardingDetailResult.Data();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        data.piBindStatus = q9h.LJIIJ();
                        break;
                    case 2:
                        data.maskedInstrumentIdentity = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        data.userTaxStatus = q9h.LJIIJ();
                        break;
                    case 4:
                        data.confirmed = Q9J.LIZ(q9h);
                        break;
                    case 5:
                        data.kycStatus = q9h.LJIIJ();
                        break;
                    case 6:
                        data.kycFailReason = q9h.LJIIJ();
                        break;
                    case 7:
                        data.defaultPiStatus = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PayoutOnboardingDetailResult.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
