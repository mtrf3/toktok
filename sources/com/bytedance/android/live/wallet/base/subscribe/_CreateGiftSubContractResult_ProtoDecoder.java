package com.bytedance.android.live.wallet.base.subscribe;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _CreateGiftSubContractResult_ProtoDecoder implements InterfaceC31105CIr<CreateGiftSubContractResult> {
    public static CreateGiftSubContractResult LIZIZ(Q9H q9h) {
        CreateGiftSubContractResult createGiftSubContractResult = new CreateGiftSubContractResult();
        createGiftSubContractResult.successContractIds = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        createGiftSubContractResult.successContractIds.add(Q9J.LIZIZ(q9h));
                        break;
                    case 2:
                        createGiftSubContractResult.bizContent = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        createGiftSubContractResult.timestamp = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        createGiftSubContractResult.merchantId = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        createGiftSubContractResult.clientMpUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        createGiftSubContractResult.pbRequestBody = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        createGiftSubContractResult.pbGenericProductId = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        createGiftSubContractResult.giftSubId = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return createGiftSubContractResult;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CreateGiftSubContractResult LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
