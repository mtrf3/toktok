package com.bytedance.android.live.base.model.user;

import X.C29991Fr;
import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class _User_OwnRoom_ProtoDecoder implements InterfaceC31105CIr<User.OwnRoom> {
    public static User.OwnRoom LIZIZ(Q9H q9h) {
        User.OwnRoom ownRoom = new User.OwnRoom();
        ownRoom.roomIdList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    C29991Fr.LIZ(q9h, ownRoom.roomIdList);
                }
            } else {
                q9h.LJ(LIZJ);
                return ownRoom;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final User.OwnRoom LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
