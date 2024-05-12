package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.api.partnership.OpenAuthCheckResponse;

/* loaded from: classes17.dex */
public final class _OpenAuthCheckResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<OpenAuthCheckResponse.ResponseData> {
    public static OpenAuthCheckResponse.ResponseData LIZIZ(Q9H q9h) {
        OpenAuthCheckResponse.ResponseData responseData = new OpenAuthCheckResponse.ResponseData();
        responseData.scopes = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            responseData.scopes.add(Q9J.LIZIZ(q9h));
                        }
                    } else {
                        responseData.openId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    responseData.isAuth = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final OpenAuthCheckResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
