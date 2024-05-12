package webcast.api.goody_bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.goody_bag.model._GoodyBagCoinDetail_ProtoDecoder;
import com.bytedance.android.livesdk.goody_bag.model._GoodyBagCommonDetail_ProtoDecoder;
import com.bytedance.android.livesdk.goody_bag.model._GoodyBagUserInfo_ProtoDecoder;
import java.util.ArrayList;
import webcast.api.goody_bag.GetGoodyBagDetailResponse;

/* loaded from: classes6.dex */
public final class _GetGoodyBagDetailResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GetGoodyBagDetailResponse.ResponseData> {
    public static GetGoodyBagDetailResponse.ResponseData LIZIZ(Q9H q9h) {
        GetGoodyBagDetailResponse.ResponseData responseData = new GetGoodyBagDetailResponse.ResponseData();
        responseData.audience = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        responseData.goodyBagId = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        responseData.biz = q9h.LJIIJ();
                        break;
                    case 3:
                        responseData.joined = Q9J.LIZ(q9h);
                        break;
                    case 4:
                        responseData.audience.add(_GoodyBagUserInfo_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 5:
                        responseData.commonDetail = _GoodyBagCommonDetail_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        responseData.coinDetail = _GoodyBagCoinDetail_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetGoodyBagDetailResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
