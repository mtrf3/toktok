package tikcast.api.perception;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message._PerceptionDialogInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PunishEventInfo_ProtoDecoder;
import tikcast.api.perception.ViolationStatusResponse;

/* loaded from: classes6.dex */
public final class _ViolationStatusResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<ViolationStatusResponse.ResponseData> {
    public static ViolationStatusResponse.ResponseData LIZIZ(Q9H q9h) {
        ViolationStatusResponse.ResponseData responseData = new ViolationStatusResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            responseData.punishEvent = _PunishEventInfo_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        responseData.perceptionDialog = _PerceptionDialogInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    responseData.status = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ViolationStatusResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
