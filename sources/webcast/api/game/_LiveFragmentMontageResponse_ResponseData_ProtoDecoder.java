package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.game.LiveFragmentMontageResponse;

/* loaded from: classes17.dex */
public final class _LiveFragmentMontageResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<LiveFragmentMontageResponse.ResponseData> {
    public static LiveFragmentMontageResponse.ResponseData LIZIZ(Q9H q9h) {
        LiveFragmentMontageResponse.ResponseData responseData = new LiveFragmentMontageResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.fragmentId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LiveFragmentMontageResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
