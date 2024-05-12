package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _DropsTaskEditRequest_ProtoDecoder implements InterfaceC31105CIr<DropsTaskEditRequest> {
    @Override // X.InterfaceC31105CIr
    public final DropsTaskEditRequest LIZ(Q9H q9h) {
        DropsTaskEditRequest dropsTaskEditRequest = new DropsTaskEditRequest();
        dropsTaskEditRequest.editDatas = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            dropsTaskEditRequest.roomId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        dropsTaskEditRequest.editDatas.add(_DropsTaskEditRequest_EditData_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    dropsTaskEditRequest.dropsId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return dropsTaskEditRequest;
            }
        }
    }
}
