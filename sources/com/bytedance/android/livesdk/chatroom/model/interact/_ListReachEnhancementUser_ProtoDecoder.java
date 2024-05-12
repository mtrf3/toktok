package com.bytedance.android.livesdk.chatroom.model.interact;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _ListReachEnhancementUser_ProtoDecoder implements InterfaceC31105CIr<ListReachEnhancementUser> {
    public static ListReachEnhancementUser LIZIZ(Q9H q9h) {
        ListReachEnhancementUser listReachEnhancementUser = new ListReachEnhancementUser();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        listReachEnhancementUser.animationType = q9h.LJIIJ();
                    }
                } else {
                    listReachEnhancementUser.id = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return listReachEnhancementUser;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ListReachEnhancementUser LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
