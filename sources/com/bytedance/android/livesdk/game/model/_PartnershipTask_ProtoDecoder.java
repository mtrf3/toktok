package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _PartnershipTask_ProtoDecoder implements InterfaceC31105CIr<PartnershipTask> {
    public static PartnershipTask LIZIZ(Q9H q9h) {
        PartnershipTask partnershipTask = new PartnershipTask();
        partnershipTask.taskDescription = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        partnershipTask.id = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        partnershipTask.idStr = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        partnershipTask.gameId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 4:
                        partnershipTask.gameIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        partnershipTask.taskMode = q9h.LJIIJ();
                        break;
                    case 6:
                        partnershipTask.status = q9h.LJIIJ();
                        break;
                    case 7:
                        partnershipTask.iosUnitPrice = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        partnershipTask.androidUnitPrice = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        partnershipTask.iosShareRatio = Q9J.LIZIZ(q9h);
                        break;
                    case 10:
                        partnershipTask.androidShareRatio = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        partnershipTask.taskDescription.add(Q9J.LIZIZ(q9h));
                        break;
                    case 12:
                        partnershipTask.showDuration = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        partnershipTask.lastIosUnitPrice = Q9J.LIZIZ(q9h);
                        break;
                    case 14:
                        partnershipTask.lastAndroidUnitPrice = Q9J.LIZIZ(q9h);
                        break;
                    case 15:
                        partnershipTask.lastIosShareRatio = Q9J.LIZIZ(q9h);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        partnershipTask.lastAndroidShareRatio = Q9J.LIZIZ(q9h);
                        break;
                    case 17:
                        partnershipTask.lastPriceUpdateTimestamp = q9h.LJIIJJI();
                        break;
                    case 18:
                        partnershipTask.anchorStartPromoteTs = q9h.LJIIJJI();
                        break;
                    case 19:
                        partnershipTask.anchorShowStatus = q9h.LJIIJ();
                        break;
                    case 20:
                        partnershipTask.androidAgeLimit = q9h.LJIIJ();
                        break;
                    case 21:
                        partnershipTask.iosAgeLimit = q9h.LJIIJ();
                        break;
                    case 22:
                        partnershipTask.exclusiveTask = Q9J.LIZ(q9h);
                        break;
                    case 23:
                        partnershipTask.applyTs = q9h.LJIIJJI();
                        break;
                    case 24:
                        partnershipTask.iosUnitPriceUsd = Q9J.LIZIZ(q9h);
                        break;
                    case 25:
                        partnershipTask.androidUnitPriceUsd = Q9J.LIZIZ(q9h);
                        break;
                    case 26:
                        partnershipTask.lastIosUnitPriceUsd = Q9J.LIZIZ(q9h);
                        break;
                    case 27:
                        partnershipTask.lastAndroidUnitPriceUsd = Q9J.LIZIZ(q9h);
                        break;
                    case 28:
                        partnershipTask.cppUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 29:
                        partnershipTask.attributionInfo = _TaskAttributionInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 30:
                        partnershipTask.openGll = q9h.LJIIJ();
                        break;
                    case 31:
                        partnershipTask.gameTagId = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return partnershipTask;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PartnershipTask LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
