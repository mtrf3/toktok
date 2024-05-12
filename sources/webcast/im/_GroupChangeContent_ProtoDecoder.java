package webcast.im;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.linkmic.common._GroupChannelAllUser_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _GroupChangeContent_ProtoDecoder implements InterfaceC31105CIr<GroupChangeContent> {
    public static GroupChangeContent LIZIZ(Q9H q9h) {
        GroupChangeContent groupChangeContent = new GroupChangeContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    groupChangeContent.groupUser = _GroupChannelAllUser_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return groupChangeContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GroupChangeContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
