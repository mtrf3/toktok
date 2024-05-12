package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.privilege.GetFansDataResponse;
import webcast.data._SlotFansRecord_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _GetFansDataResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GetFansDataResponse.ResponseData> {
    public static GetFansDataResponse.ResponseData LIZIZ(Q9H q9h) {
        GetFansDataResponse.ResponseData responseData = new GetFansDataResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 5) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.slotFansRecord = _SlotFansRecord_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetFansDataResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
