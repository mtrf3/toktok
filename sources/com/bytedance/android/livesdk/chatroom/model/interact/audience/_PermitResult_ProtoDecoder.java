package com.bytedance.android.livesdk.chatroom.model.interact.audience;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _PermitResult_ProtoDecoder implements InterfaceC31105CIr<PermitResult> {
    public static PermitResult LIZIZ(Q9H q9h) {
        PermitResult permitResult = new PermitResult();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 2) {
                    if (LJI != 3) {
                        if (LJI != 6) {
                            if (LJI != 7) {
                                if (LJI != 8) {
                                    if (LJI != 11) {
                                        Q9J.LIZJ(q9h);
                                    } else {
                                        permitResult.realPosition = (int) q9h.LJIIJJI();
                                    }
                                } else {
                                    permitResult.rivalLinkmicIdStr = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                permitResult.rivalLinkmicId = (int) q9h.LJIIJJI();
                            }
                        } else {
                            permitResult.linkmicIdStr = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        permitResult.vendor = q9h.LJIIJ();
                    }
                } else {
                    permitResult.linkmicId = (int) q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return permitResult;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PermitResult LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
