package webcast.api.goody_bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.goody_bag.model._GoodyBagBaseInfo_ProtoDecoder;
import webcast.api.goody_bag.GetRoomGoodyBagResponse;

/* loaded from: classes6.dex */
public final class _GetRoomGoodyBagResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GetRoomGoodyBagResponse.ResponseData> {
    public static GetRoomGoodyBagResponse.ResponseData LIZIZ(Q9H q9h) {
        GetRoomGoodyBagResponse.ResponseData responseData = new GetRoomGoodyBagResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            responseData.joined = Q9J.LIZ(q9h);
                        }
                    } else {
                        responseData.baseInfo = _GoodyBagBaseInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    responseData.goodyBagId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetRoomGoodyBagResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
