package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes14.dex */
public final class _CriticalStrikeCardInfo_ProtoDecoder implements InterfaceC31105CIr<CriticalStrikeCardInfo> {
    public static CriticalStrikeCardInfo LIZIZ(Q9H q9h) {
        CriticalStrikeCardInfo criticalStrikeCardInfo = new CriticalStrikeCardInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        criticalStrikeCardInfo.cardNameKey = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        criticalStrikeCardInfo.cardImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        criticalStrikeCardInfo.sendTimeSec = q9h.LJIIJJI();
                        break;
                    case 4:
                        criticalStrikeCardInfo.sendUser = _BattleUserInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        criticalStrikeCardInfo.effectLastDuration = q9h.LJIIJJI();
                        break;
                    case 6:
                        criticalStrikeCardInfo.criticalStrikeRateLow = q9h.LJIIJJI();
                        break;
                    case 7:
                        criticalStrikeCardInfo.criticalStrikeRateHigh = q9h.LJIIJJI();
                        break;
                    case 8:
                        criticalStrikeCardInfo.multiple = q9h.LJIIJJI();
                        break;
                    case 9:
                        criticalStrikeCardInfo.giftNameKey = Q9J.LIZIZ(q9h);
                        break;
                    case 10:
                        criticalStrikeCardInfo.ruleUrl = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        criticalStrikeCardInfo.effectTimeSec = q9h.LJIIJJI();
                        break;
                    case 12:
                        criticalStrikeCardInfo.toAnchorId = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return criticalStrikeCardInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CriticalStrikeCardInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
