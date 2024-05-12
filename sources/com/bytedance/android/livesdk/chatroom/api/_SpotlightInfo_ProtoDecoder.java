package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _SpotlightInfo_ProtoDecoder implements InterfaceC31105CIr<SpotlightInfo> {
    public static SpotlightInfo LIZIZ(Q9H q9h) {
        SpotlightInfo spotlightInfo = new SpotlightInfo();
        spotlightInfo.itemList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 2) {
                    Q9J.LIZJ(q9h);
                } else {
                    spotlightInfo.itemList.add(_SpotlightItem_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return spotlightInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SpotlightInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
