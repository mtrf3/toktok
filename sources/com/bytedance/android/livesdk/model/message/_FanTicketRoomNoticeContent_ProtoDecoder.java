package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _FanTicketRoomNoticeContent_ProtoDecoder implements InterfaceC31105CIr<FanTicketRoomNoticeContent> {
    public static FanTicketRoomNoticeContent LIZIZ(Q9H q9h) {
        FanTicketRoomNoticeContent fanTicketRoomNoticeContent = new FanTicketRoomNoticeContent();
        fanTicketRoomNoticeContent.userFanTicket = new ArrayList();
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
                                    fanTicketRoomNoticeContent.fanTicketIconUrl = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                fanTicketRoomNoticeContent.eventTime = q9h.LJIIJJI();
                            }
                        } else {
                            fanTicketRoomNoticeContent.matchId = q9h.LJIIJJI();
                        }
                    } else {
                        fanTicketRoomNoticeContent.totalLinkmicFanTicket = q9h.LJIIJJI();
                    }
                } else {
                    fanTicketRoomNoticeContent.userFanTicket.add(_UserFanTicket_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return fanTicketRoomNoticeContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FanTicketRoomNoticeContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
