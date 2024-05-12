package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _LinkInRoomInviteResponse_ProtoDecoder implements InterfaceC31105CIr<LinkInRoomInviteResponse> {
    public static LinkInRoomInviteResponse LIZIZ(Q9H q9h) {
        LinkInRoomInviteResponse linkInRoomInviteResponse = new LinkInRoomInviteResponse();
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
                                    linkInRoomInviteResponse.toLinkMicIdStr = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                linkInRoomInviteResponse.rtcPushStream = Q9J.LIZ(q9h);
                            }
                        } else {
                            linkInRoomInviteResponse.linkMicIdStr = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        linkInRoomInviteResponse.rtcExtInfo = Q9J.LIZIZ(q9h);
                    }
                } else {
                    linkInRoomInviteResponse.rtcJoinChannel = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return linkInRoomInviteResponse;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkInRoomInviteResponse LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
