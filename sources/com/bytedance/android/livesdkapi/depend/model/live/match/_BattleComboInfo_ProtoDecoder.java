package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BattleComboInfo_ProtoDecoder implements InterfaceC31105CIr<BattleComboInfo> {
    public static BattleComboInfo LIZIZ(Q9H q9h) {
        BattleComboInfo battleComboInfo = new BattleComboInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        battleComboInfo.userId = q9h.LJIIJJI();
                        break;
                    case 2:
                        battleComboInfo.comboStatus = q9h.LJIIJJI();
                        break;
                    case 3:
                        battleComboInfo.comboCount = q9h.LJIIJJI();
                        break;
                    case 4:
                        battleComboInfo.comboIconUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        battleComboInfo.comboType = q9h.LJIIJ();
                        break;
                    case 6:
                        battleComboInfo.comboRuleGuideSchema = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return battleComboInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleComboInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
