package com.bytedance.android.livesdk.model.message.battle;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _BattleNoticeRuleGuide_ProtoDecoder implements InterfaceC31105CIr<BattleNoticeRuleGuide> {
    public static BattleNoticeRuleGuide LIZIZ(Q9H q9h) {
        BattleNoticeRuleGuide battleNoticeRuleGuide = new BattleNoticeRuleGuide();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        battleNoticeRuleGuide.content = _BattleNoticeText_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        battleNoticeRuleGuide.buttonContent = _BattleNoticeText_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        battleNoticeRuleGuide.ruleUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        battleNoticeRuleGuide.exceptAnchor = Q9J.LIZ(q9h);
                        break;
                    case 5:
                        battleNoticeRuleGuide.contentText = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        battleNoticeRuleGuide.buttonContentText = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return battleNoticeRuleGuide;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleNoticeRuleGuide LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
