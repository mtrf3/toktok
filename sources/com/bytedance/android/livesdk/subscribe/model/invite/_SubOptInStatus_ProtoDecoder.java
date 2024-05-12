package com.bytedance.android.livesdk.subscribe.model.invite;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _SubOptInStatus_ProtoDecoder implements InterfaceC31105CIr<SubOptInStatus> {
    public static SubOptInStatus LIZIZ(Q9H q9h) {
        SubOptInStatus subOptInStatus = new SubOptInStatus();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                subOptInStatus.emoteAuditStatus = q9h.LJIIJ();
                            }
                        } else {
                            subOptInStatus.badgeAuditStatus = q9h.LJIIJ();
                        }
                    } else {
                        subOptInStatus.auditStatus = q9h.LJIIJ();
                    }
                } else {
                    subOptInStatus.initialized = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return subOptInStatus;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubOptInStatus LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
