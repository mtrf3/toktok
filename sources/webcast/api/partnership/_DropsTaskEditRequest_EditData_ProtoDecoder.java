package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.partnership.DropsTaskEditRequest;

/* loaded from: classes17.dex */
public final class _DropsTaskEditRequest_EditData_ProtoDecoder implements InterfaceC31105CIr<DropsTaskEditRequest.EditData> {
    public static DropsTaskEditRequest.EditData LIZIZ(Q9H q9h) {
        DropsTaskEditRequest.EditData editData = new DropsTaskEditRequest.EditData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        editData.taskId = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        editData.giftId = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        editData.type = q9h.LJIIJ();
                        break;
                    case 4:
                        editData.viewDuration = q9h.LJIIJ();
                        break;
                    case 5:
                        editData.commentContent = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        editData.commentTimes = q9h.LJIIJ();
                        break;
                    case 7:
                        editData.totalNum = q9h.LJIIJJI();
                        break;
                    case 8:
                        editData.status = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return editData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final DropsTaskEditRequest.EditData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
