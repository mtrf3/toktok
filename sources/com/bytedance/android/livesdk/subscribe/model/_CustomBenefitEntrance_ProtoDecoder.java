package com.bytedance.android.livesdk.subscribe.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.api._Perk_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _CustomBenefitEntrance_ProtoDecoder implements InterfaceC31105CIr<CustomBenefitEntrance> {
    public static CustomBenefitEntrance LIZIZ(Q9H q9h) {
        CustomBenefitEntrance customBenefitEntrance = new CustomBenefitEntrance();
        customBenefitEntrance.enabledPerks = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        customBenefitEntrance.showEntrance = Q9J.LIZ(q9h);
                        break;
                    case 2:
                        customBenefitEntrance.lastAuditStatus = q9h.LJIIJ();
                        break;
                    case 3:
                        customBenefitEntrance.lastBenefitId = q9h.LJIIJJI();
                        break;
                    case 4:
                        customBenefitEntrance.figures = q9h.LJIIJJI();
                        break;
                    case 5:
                        customBenefitEntrance.enabledPerks.add(_Perk_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 6:
                        customBenefitEntrance.maxPerksCnt = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return customBenefitEntrance;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CustomBenefitEntrance LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
