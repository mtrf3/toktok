package com.bytedance.android.livesdk.subscribe.model.invite;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _SubInvitationFunctionSwitcher_ProtoDecoder implements InterfaceC31105CIr<SubInvitationFunctionSwitcher> {
    public static SubInvitationFunctionSwitcher LIZIZ(Q9H q9h) {
        SubInvitationFunctionSwitcher subInvitationFunctionSwitcher = new SubInvitationFunctionSwitcher();
        subInvitationFunctionSwitcher.switchers = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    subInvitationFunctionSwitcher.switchers.add(_SubSwitcher_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return subInvitationFunctionSwitcher;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubInvitationFunctionSwitcher LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
