package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class _UserAttrResponse_ProtoDecoder implements InterfaceC31105CIr<UserAttrResponse> {
    public static UserAttrResponse LIZIZ(Q9H q9h) {
        UserAttrResponse userAttrResponse = new UserAttrResponse();
        userAttrResponse.values = new HashMap();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    long LIZJ2 = q9h.LIZJ();
                    Long l = null;
                    Long l2 = null;
                    while (true) {
                        int LJI2 = q9h.LJI();
                        if (LJI2 == -1) {
                            break;
                        }
                        if (LJI2 != 1) {
                            if (LJI2 == 2) {
                                l2 = Long.valueOf(q9h.LJIIJJI());
                            }
                        } else {
                            l = Long.valueOf(q9h.LJIIJJI());
                        }
                    }
                    q9h.LJ(LIZJ2);
                    if (l != null) {
                        if (l2 != null) {
                            userAttrResponse.values.put(l, l2);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                q9h.LJ(LIZJ);
                return userAttrResponse;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UserAttrResponse LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
