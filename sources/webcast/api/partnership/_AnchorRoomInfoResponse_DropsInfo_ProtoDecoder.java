package webcast.api.partnership;

import X.C29991Fr;
import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.api.partnership.AnchorRoomInfoResponse;

/* loaded from: classes6.dex */
public final class _AnchorRoomInfoResponse_DropsInfo_ProtoDecoder implements InterfaceC31105CIr<AnchorRoomInfoResponse.DropsInfo> {
    public static AnchorRoomInfoResponse.DropsInfo LIZIZ(Q9H q9h) {
        AnchorRoomInfoResponse.DropsInfo dropsInfo = new AnchorRoomInfoResponse.DropsInfo();
        dropsInfo.dropsIdList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    dropsInfo.promotingDropsName = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                dropsInfo.promotingDropsId = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            dropsInfo.hasSign = Q9J.LIZ(q9h);
                        }
                    } else {
                        C29991Fr.LIZ(q9h, dropsInfo.dropsIdList);
                    }
                } else {
                    dropsInfo.showDrops = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return dropsInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorRoomInfoResponse.DropsInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
