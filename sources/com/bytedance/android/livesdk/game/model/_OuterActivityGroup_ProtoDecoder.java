package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _OuterActivityGroup_ProtoDecoder implements InterfaceC31105CIr<OuterActivityGroup> {
    public static OuterActivityGroup LIZIZ(Q9H q9h) {
        OuterActivityGroup outerActivityGroup = new OuterActivityGroup();
        outerActivityGroup.activityList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            outerActivityGroup.seq = q9h.LJIIJ();
                        }
                    } else {
                        outerActivityGroup.activityType = Q9J.LIZIZ(q9h);
                    }
                } else {
                    outerActivityGroup.activityList.add(_OuterActivityInfo_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return outerActivityGroup;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final OuterActivityGroup LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
