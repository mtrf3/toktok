package webcast.api.goody_bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.goody_bag.GetGoodyBagTemplateResponse;

/* loaded from: classes17.dex */
public final class _GetGoodyBagTemplateResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GetGoodyBagTemplateResponse.ResponseData> {
    public static GetGoodyBagTemplateResponse.ResponseData LIZIZ(Q9H q9h) {
        GetGoodyBagTemplateResponse.ResponseData responseData = new GetGoodyBagTemplateResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            responseData.result = _GetGoodyBagTemplateResponse_PreCheckResult_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        responseData.coinTemplate = _GetGoodyBagTemplateResponse_CoinTemplate_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    responseData.commonTemplate = _GetGoodyBagTemplateResponse_CommonTemplate_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetGoodyBagTemplateResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
