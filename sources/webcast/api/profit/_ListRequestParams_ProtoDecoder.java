package webcast.api.profit;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes17.dex */
public final class _ListRequestParams_ProtoDecoder implements InterfaceC31105CIr<ListRequestParams> {
    @Override // X.InterfaceC31105CIr
    public final ListRequestParams LIZ(Q9H q9h) {
        ListRequestParams listRequestParams = new ListRequestParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        listRequestParams.accountId = q9h.LJIIJJI();
                        break;
                    case 2:
                        listRequestParams.liveId = q9h.LJIIJJI();
                        break;
                    case 3:
                        listRequestParams.type = q9h.LJIIJJI();
                        break;
                    case 4:
                        listRequestParams.entrance = q9h.LJIIJJI();
                        break;
                    case 5:
                        listRequestParams.channel = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        listRequestParams.shortId = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        listRequestParams.currency = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        listRequestParams.roomId = q9h.LJIIJJI();
                        break;
                    case 9:
                        listRequestParams.anchorId = q9h.LJIIJJI();
                        break;
                    case 10:
                        listRequestParams.fetchFullPackages = Q9J.LIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        listRequestParams.recommendStrategyParam = Q9J.LIZIZ(q9h);
                        break;
                    case 12:
                        listRequestParams.iapCountryCode = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return listRequestParams;
            }
        }
    }
}
