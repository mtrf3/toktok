package com.bytedance.android.livesdk.subscribe.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _SubDataItemView_ProtoDecoder implements InterfaceC31105CIr<SubDataItemView> {
    public static SubDataItemView LIZIZ(Q9H q9h) {
        SubDataItemView subDataItemView = new SubDataItemView();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            subDataItemView.value = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        subDataItemView.iconContent = Q9J.LIZIZ(q9h);
                    }
                } else {
                    subDataItemView.iconType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return subDataItemView;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubDataItemView LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
