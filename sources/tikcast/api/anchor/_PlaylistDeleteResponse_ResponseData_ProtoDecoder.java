package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.anchor.PlaylistDeleteResponse;

/* loaded from: classes17.dex */
public final class _PlaylistDeleteResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<PlaylistDeleteResponse.ResponseData> {
    public static PlaylistDeleteResponse.ResponseData LIZIZ(Q9H q9h) {
        PlaylistDeleteResponse.ResponseData responseData = new PlaylistDeleteResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.total = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PlaylistDeleteResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
