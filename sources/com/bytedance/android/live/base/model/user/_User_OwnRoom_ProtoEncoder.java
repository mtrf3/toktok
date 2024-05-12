package com.bytedance.android.live.base.model.user;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes.dex */
public final class _User_OwnRoom_ProtoEncoder implements InterfaceC64604PXc<User.OwnRoom> {
    public static int LIZJ(User.OwnRoom ownRoom) {
        List<Long> list = ownRoom.roomIdList;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < ownRoom.roomIdList.size(); i2++) {
            i += C30957CCz.LJIIJ(1, (Long) ListProtector.get(ownRoom.roomIdList, i2));
        }
        return i;
    }

    public static void LIZIZ(CD6 cd6, User.OwnRoom ownRoom) {
        List<Long> list = ownRoom.roomIdList;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < ownRoom.roomIdList.size(); i++) {
                C30957CCz.LIZJ(cd6, 1, (Long) ListProtector.get(ownRoom.roomIdList, i));
            }
        }
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, User.OwnRoom ownRoom) {
        LIZIZ(cd6, ownRoom);
    }
}
