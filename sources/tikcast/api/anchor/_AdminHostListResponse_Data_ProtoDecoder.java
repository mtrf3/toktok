package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import tikcast.api.anchor.AdminHostListResponse;

/* loaded from: classes6.dex */
public final class _AdminHostListResponse_Data_ProtoDecoder implements InterfaceC31105CIr<AdminHostListResponse.Data> {
    public static AdminHostListResponse.Data LIZIZ(Q9H q9h) {
        AdminHostListResponse.Data data = new AdminHostListResponse.Data();
        data.hostList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    data.hostList.add(_HostInfo_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AdminHostListResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
