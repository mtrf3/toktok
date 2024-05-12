package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _StarCommentUpdateRequest_ProtoDecoder implements InterfaceC31105CIr<StarCommentUpdateRequest> {
    @Override // X.InterfaceC31105CIr
    public final StarCommentUpdateRequest LIZ(Q9H q9h) {
        StarCommentUpdateRequest starCommentUpdateRequest = new StarCommentUpdateRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                starCommentUpdateRequest.grantLevel = q9h.LJIIJ();
                            }
                        } else {
                            starCommentUpdateRequest.grantGroup = q9h.LJIIJ();
                        }
                    } else {
                        starCommentUpdateRequest.starCommentSwitch = Q9J.LIZ(q9h);
                    }
                } else {
                    starCommentUpdateRequest.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return starCommentUpdateRequest;
            }
        }
    }
}
