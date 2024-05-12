package com.bytedance.android.live.base.model.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes.dex */
public final class _BadgeStruct_ProtoDecoder implements InterfaceC31105CIr<BadgeStruct> {
    public static BadgeStruct LIZIZ(Q9H q9h) {
        BadgeStruct badgeStruct = new BadgeStruct();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        badgeStruct.badgeDisplayType = q9h.LJIIJ();
                        break;
                    case 2:
                        badgeStruct.badgePriorityType = q9h.LJIIJ();
                        break;
                    case 3:
                        badgeStruct.badgeScene = q9h.LJIIJ();
                        break;
                    case 4:
                        badgeStruct.position = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 5:
                        badgeStruct.displayStatus = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 6:
                        badgeStruct.greyedByClient = q9h.LJIIJJI();
                        break;
                    case 7:
                        badgeStruct.exhibitionType = q9h.LJIIJ();
                        break;
                    default:
                        switch (LJI) {
                            case 10:
                                badgeStruct.schemaUrl = Q9J.LIZIZ(q9h);
                                break;
                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                badgeStruct.display = Q9J.LIZ(q9h);
                                break;
                            case 12:
                                badgeStruct.logExtra = _PrivilegeLogExtra_ProtoDecoder.LIZIZ(q9h);
                                break;
                            default:
                                switch (LJI) {
                                    case 20:
                                        badgeStruct.imageBadge = _ImageBadge_ProtoDecoder.LIZIZ(q9h);
                                        break;
                                    case 21:
                                        badgeStruct.textBadge = _TextBadge_ProtoDecoder.LIZIZ(q9h);
                                        break;
                                    case 22:
                                        badgeStruct.stringBadge = _StringBadge_ProtoDecoder.LIZIZ(q9h);
                                        break;
                                    case 23:
                                        badgeStruct.combineBadgeStruct = _CombineBadgeStruct_ProtoDecoder.LIZIZ(q9h);
                                        break;
                                    default:
                                        Q9J.LIZJ(q9h);
                                        break;
                                }
                        }
                }
            } else {
                q9h.LJ(LIZJ);
                return badgeStruct;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BadgeStruct LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
