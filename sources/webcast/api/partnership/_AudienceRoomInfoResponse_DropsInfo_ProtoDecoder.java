package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.partnership.AudienceRoomInfoResponse;

/* loaded from: classes6.dex */
public final class _AudienceRoomInfoResponse_DropsInfo_ProtoDecoder implements InterfaceC31105CIr<AudienceRoomInfoResponse.DropsInfo> {
    public static AudienceRoomInfoResponse.DropsInfo LIZIZ(Q9H q9h) {
        AudienceRoomInfoResponse.DropsInfo dropsInfo = new AudienceRoomInfoResponse.DropsInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            dropsInfo.giftIcon = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        dropsInfo.rewardCount = q9h.LJIIJJI();
                    }
                } else {
                    dropsInfo.promotingDropsId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return dropsInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AudienceRoomInfoResponse.DropsInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
