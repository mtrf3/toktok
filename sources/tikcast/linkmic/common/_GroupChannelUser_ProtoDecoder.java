package tikcast.linkmic.common;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.linkcore._AllListUser_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _GroupChannelUser_ProtoDecoder implements InterfaceC31105CIr<GroupChannelUser> {
    public static GroupChannelUser LIZIZ(Q9H q9h) {
        GroupChannelUser groupChannelUser = new GroupChannelUser();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        groupChannelUser.channelId = q9h.LJIIJJI();
                        break;
                    case 2:
                        groupChannelUser.status = q9h.LJIIJ();
                        break;
                    case 3:
                        groupChannelUser.type = q9h.LJIIJ();
                        break;
                    case 4:
                        groupChannelUser.allUser = _AllListUser_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        groupChannelUser.joinTime = q9h.LJIIJJI();
                        break;
                    case 6:
                        groupChannelUser.linkedTime = q9h.LJIIJJI();
                        break;
                    case 7:
                        groupChannelUser.ownerUser = _GroupPlayer_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return groupChannelUser;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GroupChannelUser LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
