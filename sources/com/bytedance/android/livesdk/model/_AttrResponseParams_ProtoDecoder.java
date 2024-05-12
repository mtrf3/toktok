package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.AttrResponseParams;

/* loaded from: classes6.dex */
public final class _AttrResponseParams_ProtoDecoder implements InterfaceC31105CIr<AttrResponseParams> {
    @Override // X.InterfaceC31105CIr
    public final AttrResponseParams LIZ(Q9H q9h) {
        AttrResponseParams attrResponseParams = new AttrResponseParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        AttrResponseParams.Extra extra = new AttrResponseParams.Extra();
                        long LIZJ2 = q9h.LIZJ();
                        while (q9h.LJI() != -1) {
                            Q9J.LIZJ(q9h);
                        }
                        q9h.LJ(LIZJ2);
                        attrResponseParams.extra = extra;
                    }
                } else {
                    attrResponseParams.data = _UserAttrResponse_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return attrResponseParams;
            }
        }
    }
}
