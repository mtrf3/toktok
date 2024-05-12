package com.bytedance.android.livesdk.subscribe.model.invite;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _SubInvitationCode_ProtoDecoder implements InterfaceC31105CIr<SubInvitationCode> {
    public static SubInvitationCode LIZIZ(Q9H q9h) {
        SubInvitationCode subInvitationCode = new SubInvitationCode();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    if (LJI != 20) {
                                        Q9J.LIZJ(q9h);
                                    } else {
                                        subInvitationCode.invalidCode = q9h.LJIIJ();
                                    }
                                } else {
                                    subInvitationCode.expiredTime = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                subInvitationCode.bindingTime = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            subInvitationCode.inviteeId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        subInvitationCode.inviterId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    subInvitationCode.code = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return subInvitationCode;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubInvitationCode LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
