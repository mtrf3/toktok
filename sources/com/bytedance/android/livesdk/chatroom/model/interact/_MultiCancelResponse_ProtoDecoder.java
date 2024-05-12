package com.bytedance.android.livesdk.chatroom.model.interact;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _MultiCancelResponse_ProtoDecoder implements InterfaceC31105CIr<MultiCancelResponse> {
    @Override // X.InterfaceC31105CIr
    public final MultiCancelResponse LIZ(Q9H q9h) {
        MultiCancelResponse multiCancelResponse = new MultiCancelResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    long LIZJ2 = q9h.LIZJ();
                    Long l = null;
                    Integer num = null;
                    while (true) {
                        int LJI2 = q9h.LJI();
                        if (LJI2 == -1) {
                            break;
                        }
                        if (LJI2 != 1) {
                            if (LJI2 == 2) {
                                num = Integer.valueOf(q9h.LJIIJ());
                            }
                        } else {
                            l = Long.valueOf(q9h.LJIIJJI());
                        }
                    }
                    q9h.LJ(LIZJ2);
                    if (l != null) {
                        if (num != null) {
                            multiCancelResponse.userResults.put(l, num);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                q9h.LJ(LIZJ);
                return multiCancelResponse;
            }
        }
    }
}
