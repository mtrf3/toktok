package com.bytedance.android.live.wallet.base.subscribe;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes17.dex */
public final class _CreateContractRequest_ProtoDecoder implements InterfaceC31105CIr<CreateContractRequest> {
    @Override // X.InterfaceC31105CIr
    public final CreateContractRequest LIZ(Q9H q9h) {
        CreateContractRequest createContractRequest = new CreateContractRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        createContractRequest.toUid = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        createContractRequest.tplId = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        createContractRequest.deviceTz = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        createContractRequest.skuName = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        createContractRequest.subRegion = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        createContractRequest.iapCountryCode = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        createContractRequest.roomId = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        createContractRequest.currency = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        createContractRequest.priceAmountMicros = q9h.LJIIJJI();
                        break;
                    case 10:
                        createContractRequest.orderSource = q9h.LJIIJ();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        createContractRequest.offerId = Q9J.LIZIZ(q9h);
                        break;
                    case 12:
                        createContractRequest.offerToken = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return createContractRequest;
            }
        }
    }
}
