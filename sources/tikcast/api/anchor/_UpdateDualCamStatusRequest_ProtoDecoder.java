package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _UpdateDualCamStatusRequest_ProtoDecoder implements InterfaceC31105CIr<UpdateDualCamStatusRequest> {
    @Override // X.InterfaceC31105CIr
    public final UpdateDualCamStatusRequest LIZ(Q9H q9h) {
        UpdateDualCamStatusRequest updateDualCamStatusRequest = new UpdateDualCamStatusRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                updateDualCamStatusRequest.offTime = q9h.LJIIJJI();
                            }
                        } else {
                            updateDualCamStatusRequest.onTime = q9h.LJIIJJI();
                        }
                    } else {
                        updateDualCamStatusRequest.action = q9h.LJIIJ();
                    }
                } else {
                    updateDualCamStatusRequest.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return updateDualCamStatusRequest;
            }
        }
    }
}
