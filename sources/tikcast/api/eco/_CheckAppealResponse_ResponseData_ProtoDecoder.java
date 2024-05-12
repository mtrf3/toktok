package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.eco.CheckAppealResponse;

/* loaded from: classes17.dex */
public final class _CheckAppealResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<CheckAppealResponse.ResponseData> {
    public static CheckAppealResponse.ResponseData LIZIZ(Q9H q9h) {
        CheckAppealResponse.ResponseData responseData = new CheckAppealResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        responseData.live = Q9J.LIZIZ(q9h);
                    }
                } else {
                    responseData.status = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CheckAppealResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
