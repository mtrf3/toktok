package com.bytedance.android.livesdk.subscribe.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes17.dex */
public final class _WebappSubInfo_ProtoDecoder implements InterfaceC31105CIr<WebappSubInfo> {
    public static WebappSubInfo LIZIZ(Q9H q9h) {
        WebappSubInfo webappSubInfo = new WebappSubInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        webappSubInfo.paymentReference = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        webappSubInfo.nonce = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        webappSubInfo.address = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        webappSubInfo.taxMoney = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        webappSubInfo.taxRate = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        webappSubInfo.needBillingAddress = Q9J.LIZ(q9h);
                        break;
                    case 7:
                        webappSubInfo.notifyUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        webappSubInfo.totalMoney = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        webappSubInfo.showTax = Q9J.LIZ(q9h);
                        break;
                    case 10:
                        webappSubInfo.region = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        webappSubInfo.orderId = Q9J.LIZIZ(q9h);
                        break;
                    case 12:
                        webappSubInfo.cashierUrl = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        webappSubInfo.mechantId = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return webappSubInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final WebappSubInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
