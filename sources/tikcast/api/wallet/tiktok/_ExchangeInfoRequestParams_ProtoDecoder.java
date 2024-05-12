package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _ExchangeInfoRequestParams_ProtoDecoder implements InterfaceC31105CIr<ExchangeInfoRequestParams> {
    @Override // X.InterfaceC31105CIr
    public final ExchangeInfoRequestParams LIZ(Q9H q9h) {
        ExchangeInfoRequestParams exchangeInfoRequestParams = new ExchangeInfoRequestParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    exchangeInfoRequestParams.getExchangeResultOnly = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return exchangeInfoRequestParams;
            }
        }
    }
}
