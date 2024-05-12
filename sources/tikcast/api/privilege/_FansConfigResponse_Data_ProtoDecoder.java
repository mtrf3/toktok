package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import tikcast.api.privilege.FansConfigResponse;
import webcast.data._FansConfig_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _FansConfigResponse_Data_ProtoDecoder implements InterfaceC31105CIr<FansConfigResponse.Data> {
    public static FansConfigResponse.Data LIZIZ(Q9H q9h) {
        FansConfigResponse.Data data = new FansConfigResponse.Data();
        data.fansConfig = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    data.fansConfig.add(_FansConfig_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansConfigResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
