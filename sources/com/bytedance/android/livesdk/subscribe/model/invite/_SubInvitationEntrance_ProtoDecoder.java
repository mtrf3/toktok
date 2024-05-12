package com.bytedance.android.livesdk.subscribe.model.invite;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _SubInvitationEntrance_ProtoDecoder implements InterfaceC31105CIr<SubInvitationEntrance> {
    public static SubInvitationEntrance LIZIZ(Q9H q9h) {
        SubInvitationEntrance subInvitationEntrance = new SubInvitationEntrance();
        subInvitationEntrance.entrancePrompt = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 12) {
                                if (LJI != 50) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    subInvitationEntrance.switcher = _SubInvitationFunctionSwitcher_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                subInvitationEntrance.entrancePrompt.add(_SubInvitationEntrancePrompt_ProtoDecoder.LIZIZ(q9h));
                            }
                        } else {
                            subInvitationEntrance.invitationStatus = q9h.LJIIJ();
                        }
                    } else {
                        subInvitationEntrance.hasInvitationEntrance = Q9J.LIZ(q9h);
                    }
                } else {
                    subInvitationEntrance.beInvited = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return subInvitationEntrance;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubInvitationEntrance LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
