package com.bytedance.android.livesdk.model.message.linker.invite_message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostTopic_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _LinkerInviteMessageExtra_ProtoDecoder implements InterfaceC31105CIr<LinkerInviteMessageExtra> {
    public static LinkerInviteMessageExtra LIZIZ(Q9H q9h) {
        LinkerInviteMessageExtra linkerInviteMessageExtra = new LinkerInviteMessageExtra();
        linkerInviteMessageExtra.otherRivalExtra = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        linkerInviteMessageExtra.matchType = (int) q9h.LJIIJJI();
                        break;
                    case 2:
                        linkerInviteMessageExtra.inviteType = (int) q9h.LJIIJJI();
                        break;
                    case 3:
                        linkerInviteMessageExtra.subType = (int) q9h.LJIIJJI();
                        break;
                    case 4:
                        linkerInviteMessageExtra.theme = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        linkerInviteMessageExtra.duration = (int) q9h.LJIIJJI();
                        break;
                    case 6:
                        linkerInviteMessageExtra.layout = (int) q9h.LJIIJJI();
                        break;
                    case 7:
                        linkerInviteMessageExtra.tips = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        linkerInviteMessageExtra.inviterRivalExtra = _InviterRivalExtra_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        linkerInviteMessageExtra.otherRivalExtra.add(_InviterRivalExtra_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 10:
                        linkerInviteMessageExtra.topicInfo = _CohostTopic_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return linkerInviteMessageExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkerInviteMessageExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
