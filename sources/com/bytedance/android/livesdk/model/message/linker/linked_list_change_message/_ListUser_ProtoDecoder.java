package com.bytedance.android.livesdk.model.message.linker.linked_list_change_message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _ListUser_ProtoDecoder implements InterfaceC31105CIr<ListUser> {
    public static ListUser LIZIZ(Q9H q9h) {
        ListUser listUser = new ListUser();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        listUser.user = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        listUser.linkmicId = q9h.LJIIJJI();
                        break;
                    case 3:
                        listUser.linkmicIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        listUser.linkStatus = q9h.LJIIJ();
                        break;
                    case 5:
                        listUser.linkType = q9h.LJIIJ();
                        break;
                    case 6:
                        listUser.userPosition = q9h.LJIIJ();
                        break;
                    case 7:
                        listUser.silenceStatus = q9h.LJIIJ();
                        break;
                    case 8:
                        listUser.modifyTime = q9h.LJIIJJI();
                        break;
                    case 9:
                        listUser.channelId = q9h.LJIIJJI();
                        break;
                    case 10:
                        listUser.roleType = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return listUser;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ListUser LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
