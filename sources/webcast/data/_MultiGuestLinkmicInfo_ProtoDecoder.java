package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _MultiGuestLinkmicInfo_ProtoDecoder implements InterfaceC31105CIr<MultiGuestLinkmicInfo> {
    public static MultiGuestLinkmicInfo LIZIZ(Q9H q9h) {
        MultiGuestLinkmicInfo multiGuestLinkmicInfo = new MultiGuestLinkmicInfo();
        multiGuestLinkmicInfo.linkedUsers = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 8) {
                        if (LJI != 9) {
                            Q9J.LIZJ(q9h);
                        } else {
                            multiGuestLinkmicInfo.fanTicketIconUrl = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        multiGuestLinkmicInfo.requestUserStatus = (int) q9h.LJIIJJI();
                    }
                } else {
                    multiGuestLinkmicInfo.linkedUsers.add(_MultiGuestLinkmicInfo_ListUser_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return multiGuestLinkmicInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MultiGuestLinkmicInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
