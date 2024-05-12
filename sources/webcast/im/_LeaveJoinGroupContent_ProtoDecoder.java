package webcast.im;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.linkmic.common._GroupPlayer_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _LeaveJoinGroupContent_ProtoDecoder implements InterfaceC31105CIr<LeaveJoinGroupContent> {
    public static LeaveJoinGroupContent LIZIZ(Q9H q9h) {
        LeaveJoinGroupContent leaveJoinGroupContent = new LeaveJoinGroupContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            leaveJoinGroupContent.leaveSource = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        leaveJoinGroupContent.groupChannelId = q9h.LJIIJJI();
                    }
                } else {
                    leaveJoinGroupContent.operator = _GroupPlayer_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return leaveJoinGroupContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LeaveJoinGroupContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
