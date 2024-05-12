package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _BattlePrompt_ProtoDecoder implements InterfaceC31105CIr<BattlePrompt> {
    public static BattlePrompt LIZIZ(Q9H q9h) {
        BattlePrompt battlePrompt = new BattlePrompt();
        battlePrompt.promptElements = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        battlePrompt.promptElements.add(_BattlePromptElem_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    battlePrompt.promptKey = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return battlePrompt;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattlePrompt LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
