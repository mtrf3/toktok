package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _PartnershipInfo_ProtoDecoder implements InterfaceC31105CIr<PartnershipInfo> {
    public static PartnershipInfo LIZIZ(Q9H q9h) {
        PartnershipInfo partnershipInfo = new PartnershipInfo();
        partnershipInfo.taskIdList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        partnershipInfo.partnershipRoom = Boolean.valueOf(Q9J.LIZ(q9h));
                        break;
                    case 2:
                        partnershipInfo.promotingTaskId = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        partnershipInfo.taskIdList.add(Q9J.LIZIZ(q9h));
                        break;
                    case 4:
                        partnershipInfo.promotingGameId = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        partnershipInfo.showTaskId = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        partnershipInfo.promotingDropsId = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        partnershipInfo.promotingRoom = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return partnershipInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PartnershipInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
