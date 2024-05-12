package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.api.partnership._LabelFilterInfo_ProtoDecoder;
import webcast.api.partnership._PunishInfo_ProtoDecoder;
import webcast.api.partnership._TaskPriceUpdate_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _AnchorPartnershipInfoResponse_ProtoDecoder implements InterfaceC31105CIr<AnchorPartnershipInfoResponse> {
    @Override // X.InterfaceC31105CIr
    public final AnchorPartnershipInfoResponse LIZ(Q9H q9h) {
        AnchorPartnershipInfoResponse anchorPartnershipInfoResponse = new AnchorPartnershipInfoResponse();
        anchorPartnershipInfoResponse.punishInfo = new ArrayList();
        anchorPartnershipInfoResponse.priceUpdateList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        anchorPartnershipInfoResponse.hasPermission = Q9J.LIZ(q9h);
                        break;
                    case 2:
                        anchorPartnershipInfoResponse.signAgreement = Q9J.LIZ(q9h);
                        break;
                    case 3:
                        anchorPartnershipInfoResponse.punishInfo.add(_PunishInfo_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 4:
                        anchorPartnershipInfoResponse.priceUpdateList.add(_TaskPriceUpdate_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 5:
                        anchorPartnershipInfoResponse.labelFilterInfo = _LabelFilterInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        anchorPartnershipInfoResponse.taxpayoutconfirm = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorPartnershipInfoResponse;
            }
        }
    }
}
