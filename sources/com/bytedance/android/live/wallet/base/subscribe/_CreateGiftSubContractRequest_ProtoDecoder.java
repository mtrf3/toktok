package com.bytedance.android.live.wallet.base.subscribe;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _CreateGiftSubContractRequest_ProtoDecoder implements InterfaceC31105CIr<CreateGiftSubContractRequest> {
    @Override // X.InterfaceC31105CIr
    public final CreateGiftSubContractRequest LIZ(Q9H q9h) {
        CreateGiftSubContractRequest createGiftSubContractRequest = new CreateGiftSubContractRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        createGiftSubContractRequest.toUid = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        createGiftSubContractRequest.tplId = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        createGiftSubContractRequest.deviceTz = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        createGiftSubContractRequest.subRegion = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        createGiftSubContractRequest.iapCountryCode = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        createGiftSubContractRequest.roomId = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        createGiftSubContractRequest.currency = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        createGiftSubContractRequest.priceAmountMicros = q9h.LJIIJJI();
                        break;
                    case 9:
                        createGiftSubContractRequest.count = q9h.LJIIJJI();
                        break;
                    case 10:
                        createGiftSubContractRequest.orderSource = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return createGiftSubContractRequest;
            }
        }
    }
}
