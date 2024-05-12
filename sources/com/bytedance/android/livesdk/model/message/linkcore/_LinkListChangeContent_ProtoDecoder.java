package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _LinkListChangeContent_ProtoDecoder implements InterfaceC31105CIr<LinkListChangeContent> {
    public static LinkListChangeContent LIZIZ(Q9H q9h) {
        LinkListChangeContent linkListChangeContent = new LinkListChangeContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        linkListChangeContent.userList = _AllListUser_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    linkListChangeContent.listChangeType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return linkListChangeContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkListChangeContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
