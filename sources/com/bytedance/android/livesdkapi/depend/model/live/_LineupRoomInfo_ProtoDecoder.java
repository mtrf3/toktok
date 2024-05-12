package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _LineupRoomInfo_ProtoDecoder implements InterfaceC31105CIr<LineupRoomInfo> {
    @Override // X.InterfaceC31105CIr
    public final LineupRoomInfo LIZ(Q9H q9h) {
        LineupRoomInfo lineupRoomInfo = new LineupRoomInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    lineupRoomInfo.backupRoomIdStr = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                lineupRoomInfo.backupRoomId = Long.valueOf(q9h.LJIIJJI());
                            }
                        } else {
                            lineupRoomInfo.eventName = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        lineupRoomInfo.eventId = Integer.valueOf(q9h.LJIIJ());
                    }
                } else {
                    lineupRoomInfo.channelUser = _User_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return lineupRoomInfo;
            }
        }
    }
}
