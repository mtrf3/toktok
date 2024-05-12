package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _LinkerInfo_ProtoDecoder implements InterfaceC31105CIr<LinkerInfo> {
    public static LinkerInfo LIZIZ(Q9H q9h) {
        LinkerInfo linkerInfo = new LinkerInfo();
        linkerInfo.linkedUsers = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    linkerInfo.linkedUsers.add(_UserInfo_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return linkerInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkerInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
