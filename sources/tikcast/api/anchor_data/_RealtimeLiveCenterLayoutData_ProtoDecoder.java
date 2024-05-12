package tikcast.api.anchor_data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _RealtimeLiveCenterLayoutData_ProtoDecoder implements InterfaceC31105CIr<RealtimeLiveCenterLayoutData> {
    public static RealtimeLiveCenterLayoutData LIZIZ(Q9H q9h) {
        RealtimeLiveCenterLayoutData realtimeLiveCenterLayoutData = new RealtimeLiveCenterLayoutData();
        realtimeLiveCenterLayoutData.tabList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    realtimeLiveCenterLayoutData.tabList.add(_RealtimeLiveCenterLayoutTab_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return realtimeLiveCenterLayoutData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RealtimeLiveCenterLayoutData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
