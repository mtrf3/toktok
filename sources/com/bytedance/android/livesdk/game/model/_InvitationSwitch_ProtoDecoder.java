package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _InvitationSwitch_ProtoDecoder implements InterfaceC31105CIr<InvitationSwitch> {
    @Override // X.InterfaceC31105CIr
    public final InvitationSwitch LIZ(Q9H q9h) {
        InvitationSwitch invitationSwitch = new InvitationSwitch();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        invitationSwitch.id = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        invitationSwitch.gameKind = q9h.LJIIJ();
                        break;
                    case 3:
                        invitationSwitch.gameId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 4:
                        invitationSwitch.playKind = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 5:
                        invitationSwitch.status = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 6:
                        invitationSwitch.message = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        invitationSwitch.extraBase = _SwitchExtraBase_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        invitationSwitch.extraForOpen = _SwitchExtraForOpen_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        invitationSwitch.idStr = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return invitationSwitch;
            }
        }
    }
}
