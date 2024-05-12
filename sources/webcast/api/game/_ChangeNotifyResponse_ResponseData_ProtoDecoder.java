package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.game.ChangeNotifyResponse;

/* loaded from: classes14.dex */
public final class _ChangeNotifyResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<ChangeNotifyResponse.ResponseData> {
    @Override // X.InterfaceC31105CIr
    public final ChangeNotifyResponse.ResponseData LIZ(Q9H q9h) {
        ChangeNotifyResponse.ResponseData responseData = new ChangeNotifyResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return responseData;
    }
}
