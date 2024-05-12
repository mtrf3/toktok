package com.bytedance.android.livesdk.subscribe.model.invite;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _SubInvitationInviteeStatus_ProtoDecoder implements InterfaceC31105CIr<SubInvitationInviteeStatus> {
    public static SubInvitationInviteeStatus LIZIZ(Q9H q9h) {
        SubInvitationInviteeStatus subInvitationInviteeStatus = new SubInvitationInviteeStatus();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 11) {
                            Q9J.LIZJ(q9h);
                        } else {
                            subInvitationInviteeStatus.isSeedUser = Q9J.LIZ(q9h);
                        }
                    } else {
                        subInvitationInviteeStatus.optInStatus = _SubOptInStatus_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    subInvitationInviteeStatus.invitationStatus = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return subInvitationInviteeStatus;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubInvitationInviteeStatus LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
