package com.bytedance.android.livesdk.subscribe.model.invite;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _SubEnable_ProtoDecoder implements InterfaceC31105CIr<SubEnable> {
    public static SubEnable LIZIZ(Q9H q9h) {
        SubEnable subEnable = new SubEnable();
        subEnable.conditionList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        subEnable.conditionList.add(_SubEnableCondition_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    subEnable.canEnable = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return subEnable;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubEnable LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
