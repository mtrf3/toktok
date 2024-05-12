package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.wallet.tiktok.UpdateABSStatusResponse;

/* loaded from: classes17.dex */
public final class _UpdateABSStatusResponse_ABSData_ProtoDecoder implements InterfaceC31105CIr<UpdateABSStatusResponse.ABSData> {
    public static UpdateABSStatusResponse.ABSData LIZIZ(Q9H q9h) {
        UpdateABSStatusResponse.ABSData aBSData = new UpdateABSStatusResponse.ABSData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    aBSData.success = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return aBSData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UpdateABSStatusResponse.ABSData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
