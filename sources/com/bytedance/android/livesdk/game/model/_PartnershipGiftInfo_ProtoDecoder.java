package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _PartnershipGiftInfo_ProtoDecoder implements InterfaceC31105CIr<PartnershipGiftInfo> {
    public static PartnershipGiftInfo LIZIZ(Q9H q9h) {
        PartnershipGiftInfo partnershipGiftInfo = new PartnershipGiftInfo();
        partnershipGiftInfo.items = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        partnershipGiftInfo.idStr = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        partnershipGiftInfo.name = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        partnershipGiftInfo.iconUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        partnershipGiftInfo.items.add(_GiftItem_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 5:
                        partnershipGiftInfo.startTime = q9h.LJIIJJI();
                        break;
                    case 6:
                        partnershipGiftInfo.endTime = q9h.LJIIJJI();
                        break;
                    case 7:
                        partnershipGiftInfo.detail = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        partnershipGiftInfo.type = q9h.LJIIJ();
                        break;
                    case 9:
                        partnershipGiftInfo.giftCode = Q9J.LIZIZ(q9h);
                        break;
                    case 10:
                        partnershipGiftInfo.needAuth = Q9J.LIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        partnershipGiftInfo.authParam = _AuthParam_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 12:
                        partnershipGiftInfo.guidance = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return partnershipGiftInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PartnershipGiftInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
