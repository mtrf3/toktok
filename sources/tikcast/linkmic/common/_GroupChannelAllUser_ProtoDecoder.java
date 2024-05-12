package tikcast.linkmic.common;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _GroupChannelAllUser_ProtoDecoder implements InterfaceC31105CIr<GroupChannelAllUser> {
    public static GroupChannelAllUser LIZIZ(Q9H q9h) {
        GroupChannelAllUser groupChannelAllUser = new GroupChannelAllUser();
        groupChannelAllUser.user = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        groupChannelAllUser.user.add(_GroupChannelUser_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    groupChannelAllUser.groupChannelId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return groupChannelAllUser;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GroupChannelAllUser LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
