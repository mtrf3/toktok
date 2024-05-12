package com.bytedance.android.livesdk.model.message.linker.listchangemessage;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _LinkerListChangeContent_ProtoDecoder implements InterfaceC31105CIr<LinkerListChangeContent> {
    public static LinkerListChangeContent LIZIZ(Q9H q9h) {
        LinkerListChangeContent linkerListChangeContent = new LinkerListChangeContent();
        linkerListChangeContent.onLineUsers = new ArrayList();
        linkerListChangeContent.waitingUsers = new ArrayList();
        linkerListChangeContent.connectingUsers = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            linkerListChangeContent.connectingUsers.add(_LinkListUser_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        linkerListChangeContent.waitingUsers.add(_LinkListUser_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    linkerListChangeContent.onLineUsers.add(_LinkListUser_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return linkerListChangeContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkerListChangeContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
