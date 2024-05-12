package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _OfficialRoomInfo_ProtoDecoder implements InterfaceC31105CIr<OfficialRoomInfo> {
    @Override // X.InterfaceC31105CIr
    public final OfficialRoomInfo LIZ(Q9H q9h) {
        OfficialRoomInfo officialRoomInfo = new OfficialRoomInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            officialRoomInfo.serverSubtitle = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        officialRoomInfo.isUseServerSubtitle = Boolean.valueOf(Q9J.LIZ(q9h));
                    }
                } else {
                    officialRoomInfo.isShowMoreAnchor = Boolean.valueOf(Q9J.LIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return officialRoomInfo;
            }
        }
    }
}
