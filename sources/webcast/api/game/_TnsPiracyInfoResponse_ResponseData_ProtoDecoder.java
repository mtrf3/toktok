package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.game.TnsPiracyInfoResponse;

/* loaded from: classes14.dex */
public final class _TnsPiracyInfoResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<TnsPiracyInfoResponse.ResponseData> {
    @Override // X.InterfaceC31105CIr
    public final TnsPiracyInfoResponse.ResponseData LIZ(Q9H q9h) {
        TnsPiracyInfoResponse.ResponseData responseData = new TnsPiracyInfoResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return responseData;
    }
}
