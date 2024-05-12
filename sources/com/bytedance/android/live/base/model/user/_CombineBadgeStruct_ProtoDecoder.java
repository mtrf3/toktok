package com.bytedance.android.live.base.model.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes.dex */
public final class _CombineBadgeStruct_ProtoDecoder implements InterfaceC31105CIr<CombineBadgeStruct> {
    public static CombineBadgeStruct LIZIZ(Q9H q9h) {
        CombineBadgeStruct combineBadgeStruct = new CombineBadgeStruct();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        combineBadgeStruct.badgeDisplayType = q9h.LJIIJ();
                        break;
                    case 2:
                        combineBadgeStruct.icon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        combineBadgeStruct.text = _BadgeText_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        combineBadgeStruct.str = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        combineBadgeStruct.padding = _PaddingInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        combineBadgeStruct.fontStyle = _FontStyle_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        combineBadgeStruct.profileCardPanel = _ProfileCardPanel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                    case 9:
                    case 10:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        combineBadgeStruct.background = _CombineBadgeBackground_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 12:
                        combineBadgeStruct.backgroundDarkMode = _CombineBadgeBackground_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        combineBadgeStruct.iconAutoMirrored = Boolean.valueOf(Q9J.LIZ(q9h));
                        break;
                    case 14:
                        combineBadgeStruct.bgAutoMirrored = Boolean.valueOf(Q9J.LIZ(q9h));
                        break;
                    case 15:
                        combineBadgeStruct.publicScreenShowStyle = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        combineBadgeStruct.personalCardShowStyle = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 17:
                        combineBadgeStruct.rankListOnlineAudienceShowStyle = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 18:
                        combineBadgeStruct.multiGuestShowStyle = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 19:
                        combineBadgeStruct.arrowConfig = _ArrowConfig_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 20:
                        combineBadgeStruct.paddingNewFont = _PaddingInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return combineBadgeStruct;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CombineBadgeStruct LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
