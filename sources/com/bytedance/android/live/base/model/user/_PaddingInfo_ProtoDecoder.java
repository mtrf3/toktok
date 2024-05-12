package com.bytedance.android.live.base.model.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes.dex */
public final class _PaddingInfo_ProtoDecoder implements InterfaceC31105CIr<PaddingInfo> {
    public static PaddingInfo LIZIZ(Q9H q9h) {
        PaddingInfo paddingInfo = new PaddingInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        paddingInfo.useSpecific = Q9J.LIZ(q9h);
                        break;
                    case 2:
                        paddingInfo.middlePadding = q9h.LJIIJ();
                        break;
                    case 3:
                        paddingInfo.badgeWidth = q9h.LJIIJ();
                        break;
                    case 4:
                        paddingInfo.leftPadding = q9h.LJIIJ();
                        break;
                    case 5:
                        paddingInfo.rightPadding = q9h.LJIIJ();
                        break;
                    case 6:
                        paddingInfo.iconTopPadding = q9h.LJIIJ();
                        break;
                    case 7:
                        paddingInfo.iconBottomPadding = q9h.LJIIJ();
                        break;
                    case 8:
                        paddingInfo.horizontalPaddingRule = q9h.LJIIJ();
                        break;
                    case 9:
                        paddingInfo.verticalPaddingRule = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return paddingInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PaddingInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
