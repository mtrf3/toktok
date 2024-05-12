package webcast.api.linkmic;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _LeaveParams_ProtoDecoder implements InterfaceC31105CIr<LeaveParams> {
    @Override // X.InterfaceC31105CIr
    public final LeaveParams LIZ(Q9H q9h) {
        LeaveParams leaveParams = new LeaveParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 200) {
                                Q9J.LIZJ(q9h);
                            } else {
                                leaveParams.transparentExtra = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            leaveParams.notSuggestToUid = Long.valueOf(q9h.LJIIJJI());
                        }
                    } else {
                        leaveParams.roomId = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    leaveParams.channelId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return leaveParams;
            }
        }
    }
}
