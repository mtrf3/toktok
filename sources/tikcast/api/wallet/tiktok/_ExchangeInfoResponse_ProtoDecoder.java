package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _ExchangeInfoResponse_ProtoDecoder implements InterfaceC31105CIr<ExchangeInfoResponse> {
    @Override // X.InterfaceC31105CIr
    public final ExchangeInfoResponse LIZ(Q9H q9h) {
        ExchangeInfoResponse exchangeInfoResponse = new ExchangeInfoResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    exchangeInfoResponse.data = _ExchangeInfoResponse_ExchangeInfoData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return exchangeInfoResponse;
            }
        }
    }
}
