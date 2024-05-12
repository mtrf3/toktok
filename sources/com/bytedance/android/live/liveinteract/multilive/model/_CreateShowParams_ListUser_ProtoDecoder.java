package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowParams;

/* loaded from: classes14.dex */
public final class _CreateShowParams_ListUser_ProtoDecoder implements InterfaceC31105CIr<CreateShowParams.ListUser> {
    public static CreateShowParams.ListUser LIZIZ(Q9H q9h) {
        CreateShowParams.ListUser listUser = new CreateShowParams.ListUser();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            listUser.order = q9h.LJIIJ();
                        }
                    } else {
                        listUser.linkmicId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    listUser.userId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return listUser;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CreateShowParams.ListUser LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
