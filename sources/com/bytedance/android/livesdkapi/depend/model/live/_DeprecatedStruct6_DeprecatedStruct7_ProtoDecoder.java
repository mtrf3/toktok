package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.depend.model.live.DeprecatedStruct6;

/* loaded from: classes17.dex */
public final class _DeprecatedStruct6_DeprecatedStruct7_ProtoDecoder implements InterfaceC31105CIr<DeprecatedStruct6.DeprecatedStruct7> {
    public static DeprecatedStruct6.DeprecatedStruct7 LIZIZ(Q9H q9h) {
        DeprecatedStruct6.DeprecatedStruct7 deprecatedStruct7 = new DeprecatedStruct6.DeprecatedStruct7();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            deprecatedStruct7.deprecated3 = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        deprecatedStruct7.deprecated2 = Q9J.LIZIZ(q9h);
                    }
                } else {
                    deprecatedStruct7.deprecated1 = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return deprecatedStruct7;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final DeprecatedStruct6.DeprecatedStruct7 LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
