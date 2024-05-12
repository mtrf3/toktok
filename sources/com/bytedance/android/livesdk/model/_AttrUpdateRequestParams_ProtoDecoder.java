package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _AttrUpdateRequestParams_ProtoDecoder implements InterfaceC31105CIr<AttrUpdateRequestParams> {
    @Override // X.InterfaceC31105CIr
    public final AttrUpdateRequestParams LIZ(Q9H q9h) {
        AttrUpdateRequestParams attrUpdateRequestParams = new AttrUpdateRequestParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        attrUpdateRequestParams.value = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    attrUpdateRequestParams.attrType = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return attrUpdateRequestParams;
            }
        }
    }
}
