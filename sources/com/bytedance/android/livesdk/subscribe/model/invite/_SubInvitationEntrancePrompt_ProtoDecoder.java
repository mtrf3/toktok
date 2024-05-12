package com.bytedance.android.livesdk.subscribe.model.invite;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _SubInvitationEntrancePrompt_ProtoDecoder implements InterfaceC31105CIr<SubInvitationEntrancePrompt> {
    public static SubInvitationEntrancePrompt LIZIZ(Q9H q9h) {
        SubInvitationEntrancePrompt subInvitationEntrancePrompt = new SubInvitationEntrancePrompt();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            subInvitationEntrancePrompt.promptType = q9h.LJIIJ();
                        }
                    } else {
                        subInvitationEntrancePrompt.prompt = Q9J.LIZIZ(q9h);
                    }
                } else {
                    subInvitationEntrancePrompt.promptId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return subInvitationEntrancePrompt;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubInvitationEntrancePrompt LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
