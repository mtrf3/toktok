package com.bytedance.android.livesdk.model.message.ext;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes13.dex */
public final class _ShortItemRefreshEntity_ProtoDecoder implements InterfaceC31105CIr<ShortItemRefreshEntity> {
    public static ShortItemRefreshEntity LIZIZ(Q9H q9h) {
        ShortItemRefreshEntity shortItemRefreshEntity = new ShortItemRefreshEntity();
        shortItemRefreshEntity.refreshItems = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        shortItemRefreshEntity.refreshItems.add(Q9J.LIZIZ(q9h));
                    }
                } else {
                    shortItemRefreshEntity.interval = (int) q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return shortItemRefreshEntity;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ShortItemRefreshEntity LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
