package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.eco.SubmitResponse;

/* loaded from: classes17.dex */
public final class _SubmitResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<SubmitResponse.ResponseData> {
    public static SubmitResponse.ResponseData LIZIZ(Q9H q9h) {
        SubmitResponse.ResponseData responseData = new SubmitResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.success = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubmitResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
