package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.game.DualDeviceUpdateResponse;

/* loaded from: classes14.dex */
public final class _DualDeviceUpdateResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<DualDeviceUpdateResponse.ResponseData> {
    @Override // X.InterfaceC31105CIr
    public final DualDeviceUpdateResponse.ResponseData LIZ(Q9H q9h) {
        DualDeviceUpdateResponse.ResponseData responseData = new DualDeviceUpdateResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return responseData;
    }
}
