package tikcast.linkmic.common;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.linkcore._Player_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _GroupPlayer_ProtoDecoder implements InterfaceC31105CIr<GroupPlayer> {
    public static GroupPlayer LIZIZ(Q9H q9h) {
        GroupPlayer groupPlayer = new GroupPlayer();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        groupPlayer.user = _Player_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    groupPlayer.channelId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return groupPlayer;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GroupPlayer LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
