package webcast.im;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import tikcast.linkmic.common._GroupPlayer_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _CancelJoinGroupContent_ProtoDecoder implements InterfaceC31105CIr<CancelJoinGroupContent> {
    public static CancelJoinGroupContent LIZIZ(Q9H q9h) {
        CancelJoinGroupContent cancelJoinGroupContent = new CancelJoinGroupContent();
        cancelJoinGroupContent.leaver = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            cancelJoinGroupContent.type = q9h.LJIIJ();
                        }
                    } else {
                        cancelJoinGroupContent.operator = _GroupPlayer_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    cancelJoinGroupContent.leaver.add(_GroupPlayer_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return cancelJoinGroupContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CancelJoinGroupContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
