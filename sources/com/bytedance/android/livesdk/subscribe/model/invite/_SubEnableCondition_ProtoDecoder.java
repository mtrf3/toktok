package com.bytedance.android.livesdk.subscribe.model.invite;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _SubEnableCondition_ProtoDecoder implements InterfaceC31105CIr<SubEnableCondition> {
    public static SubEnableCondition LIZIZ(Q9H q9h) {
        SubEnableCondition subEnableCondition = new SubEnableCondition();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            subEnableCondition.isQualified = Q9J.LIZ(q9h);
                        }
                    } else {
                        subEnableCondition.displayText = Q9J.LIZIZ(q9h);
                    }
                } else {
                    subEnableCondition.conditionType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return subEnableCondition;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubEnableCondition LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
