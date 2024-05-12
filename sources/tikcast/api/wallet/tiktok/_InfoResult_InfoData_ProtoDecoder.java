package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.HashMap;
import tikcast.api.wallet.tiktok.InfoResult;

/* loaded from: classes17.dex */
public final class _InfoResult_InfoData_ProtoDecoder implements InterfaceC31105CIr<InfoResult.InfoData> {
    public static InfoResult.InfoData LIZIZ(Q9H q9h) {
        InfoResult.InfoData infoData = new InfoResult.InfoData();
        infoData.autoExchangeMap = new HashMap();
        infoData.deprecated4 = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        infoData.diamond = q9h.LJIIJJI();
                        break;
                    case 2:
                        infoData.deprecated1 = q9h.LJIIJJI();
                        break;
                    case 3:
                        infoData.deprecated2 = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        infoData.deprecated3 = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        infoData.deprecated4.add(_CouponDetailData_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 6:
                        infoData.deprecated5 = q9h.LJIIJJI();
                        break;
                    case 7:
                        infoData.autoExchange = Q9J.LIZ(q9h);
                        break;
                    case 8:
                        infoData.exchange = _Exchange_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        long LIZJ2 = q9h.LIZJ();
                        String str = null;
                        Boolean bool = null;
                        while (true) {
                            int LJI2 = q9h.LJI();
                            if (LJI2 != -1) {
                                if (LJI2 != 1) {
                                    if (LJI2 == 2) {
                                        bool = Boolean.valueOf(Q9J.LIZ(q9h));
                                    }
                                } else {
                                    str = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                q9h.LJ(LIZJ2);
                                if (str != null) {
                                    if (bool != null) {
                                        infoData.autoExchangeMap.put(str, bool);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    case 10:
                        infoData.vipOnlyRechargeChannelStatus = q9h.LJIIJ();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        infoData.coinExchangeTaxType = q9h.LJIIJ();
                        break;
                    case 12:
                        infoData.coinExchangeTaxStatus = q9h.LJIIJ();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        infoData.autoExchangeEnable = Q9J.LIZ(q9h);
                        break;
                    case 14:
                        infoData.isPeriodicPayout = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return infoData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final InfoResult.InfoData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
