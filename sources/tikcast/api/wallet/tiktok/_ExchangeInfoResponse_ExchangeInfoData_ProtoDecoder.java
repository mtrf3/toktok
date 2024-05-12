package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.wallet.tiktok.ExchangeInfoResponse;

/* loaded from: classes14.dex */
public final class _ExchangeInfoResponse_ExchangeInfoData_ProtoDecoder implements InterfaceC31105CIr<ExchangeInfoResponse.ExchangeInfoData> {
    public static ExchangeInfoResponse.ExchangeInfoData LIZIZ(Q9H q9h) {
        ExchangeInfoResponse.ExchangeInfoData exchangeInfoData = new ExchangeInfoResponse.ExchangeInfoData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        exchangeInfoData.exchange = _Exchange_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        exchangeInfoData.exchangeEntranceTitle = q9h.LJIIJ();
                        break;
                    case 3:
                        exchangeInfoData.exchangeEntranceSubtitle = q9h.LJIIJ();
                        break;
                    case 4:
                        exchangeInfoData.exchangeEntranceIcon = q9h.LJIIJ();
                        break;
                    case 5:
                        exchangeInfoData.exchangePanelHint = q9h.LJIIJ();
                        break;
                    case 6:
                        exchangeInfoData.isFirstExchange = Q9J.LIZ(q9h);
                        break;
                    case 7:
                        exchangeInfoData.w9TaxStatus = q9h.LJIIJJI();
                        break;
                    case 8:
                        exchangeInfoData.autoExchangeEnable = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return exchangeInfoData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ExchangeInfoResponse.ExchangeInfoData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
