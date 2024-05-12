package com.bytedance.android.livesdk.chatroom.model.interact;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _LinkReplyResult_ProtoDecoder implements InterfaceC31105CIr<LinkReplyResult> {
    public static LinkReplyResult LIZIZ(Q9H q9h) {
        LinkReplyResult linkReplyResult = new LinkReplyResult();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 3) {
                    if (LJI != 4) {
                        if (LJI != 5) {
                            if (LJI != 15) {
                                if (LJI != 17) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    linkReplyResult.rivalLinkmicIdStr = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                linkReplyResult.linkMicIdStr = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            linkReplyResult.rtcExtInfo = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        linkReplyResult.confluenceType = q9h.LJIIJ();
                    }
                } else {
                    linkReplyResult.canJoinChannelDirectly = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return linkReplyResult;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkReplyResult LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
