package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _OriginBadgeInfo_ProtoDecoder implements InterfaceC31105CIr<OriginBadgeInfo> {
    public static OriginBadgeInfo LIZIZ(Q9H q9h) {
        OriginBadgeInfo originBadgeInfo = new OriginBadgeInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            originBadgeInfo.description = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        originBadgeInfo.originImg = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    originBadgeInfo.subLevel = Integer.valueOf(q9h.LJIIJ());
                }
            } else {
                q9h.LJ(LIZJ);
                return originBadgeInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final OriginBadgeInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
