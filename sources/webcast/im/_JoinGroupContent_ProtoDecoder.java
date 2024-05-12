package webcast.im;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.linkmic.common._GroupChannelAllUser_ProtoDecoder;
import tikcast.linkmic.common._GroupPlayer_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _JoinGroupContent_ProtoDecoder implements InterfaceC31105CIr<JoinGroupContent> {
    public static JoinGroupContent LIZIZ(Q9H q9h) {
        JoinGroupContent joinGroupContent = new JoinGroupContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            joinGroupContent.type = q9h.LJIIJ();
                        }
                    } else {
                        joinGroupContent.joinUser = _GroupPlayer_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    joinGroupContent.groupUser = _GroupChannelAllUser_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return joinGroupContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final JoinGroupContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
