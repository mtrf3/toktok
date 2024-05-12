package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _DeprecatedStruct5_ProtoDecoder implements InterfaceC31105CIr<DeprecatedStruct5> {
    @Override // X.InterfaceC31105CIr
    public final DeprecatedStruct5 LIZ(Q9H q9h) {
        DeprecatedStruct5 deprecatedStruct5 = new DeprecatedStruct5();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    deprecatedStruct5.deprecated1 = _DeprecatedStruct6_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return deprecatedStruct5;
            }
        }
    }
}
