package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.sub.GiftSubInfoResponse;

/* loaded from: classes17.dex */
public final class _GiftSubInfoResponse_Data_ProtoDecoder implements InterfaceC31105CIr<GiftSubInfoResponse.Data> {
    public static GiftSubInfoResponse.Data LIZIZ(Q9H q9h) {
        GiftSubInfoResponse.Data data = new GiftSubInfoResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    data.info = _GiftSubInfoData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftSubInfoResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
