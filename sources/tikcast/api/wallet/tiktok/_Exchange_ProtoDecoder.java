package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes14.dex */
public final class _Exchange_ProtoDecoder implements InterfaceC31105CIr<Exchange> {
    public static Exchange LIZIZ(Q9H q9h) {
        Exchange exchange = new Exchange();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        exchange.enable = Q9J.LIZ(q9h);
                        break;
                    case 2:
                        exchange.revenue = q9h.LJIIJJI();
                        break;
                    case 3:
                        exchange.currency = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        exchange.region = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        exchange.unitPrice = q9h.LJIIJJI();
                        break;
                    case 6:
                        exchange.priceDot = q9h.LJIIJJI();
                        break;
                    case 7:
                        exchange.hasShortVideoGift = Q9J.LIZ(q9h);
                        break;
                    case 8:
                        exchange.isUgRegionUser = Q9J.LIZ(q9h);
                        break;
                    case 9:
                        exchange.showExchangeTooltip = Q9J.LIZ(q9h);
                        break;
                    case 10:
                        exchange.showExchangeAmountAdjustedText = Q9J.LIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        exchange.exchangeInputOption = q9h.LJIIJ();
                        break;
                    case 12:
                        exchange.coins = q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        exchange.behaviorData = _BehaviorData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 14:
                        exchange.abRetentionPopup = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return exchange;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final Exchange LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
