package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.partnership.OpenAuthCheckRequest;

/* loaded from: classes17.dex */
public final class _OpenAuthCheckRequest_DropsParam_ProtoDecoder implements InterfaceC31105CIr<OpenAuthCheckRequest.DropsParam> {
    public static OpenAuthCheckRequest.DropsParam LIZIZ(Q9H q9h) {
        OpenAuthCheckRequest.DropsParam dropsParam = new OpenAuthCheckRequest.DropsParam();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            dropsParam.needAuthMsg = Q9J.LIZ(q9h);
                        }
                    } else {
                        dropsParam.needUnauthMsg = Q9J.LIZ(q9h);
                    }
                } else {
                    dropsParam.dropsId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return dropsParam;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final OpenAuthCheckRequest.DropsParam LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
