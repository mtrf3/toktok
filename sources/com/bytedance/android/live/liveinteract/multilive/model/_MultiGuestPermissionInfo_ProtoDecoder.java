package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _MultiGuestPermissionInfo_ProtoDecoder implements InterfaceC31105CIr<MultiGuestPermissionInfo> {
    public static MultiGuestPermissionInfo LIZIZ(Q9H q9h) {
        MultiGuestPermissionInfo multiGuestPermissionInfo = new MultiGuestPermissionInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                multiGuestPermissionInfo.linkPermissionType = Long.valueOf(q9h.LJIIJJI());
                            }
                        } else {
                            multiGuestPermissionInfo.noPermissionPrompt = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        multiGuestPermissionInfo.errCode = q9h.LJIIJJI();
                    }
                } else {
                    multiGuestPermissionInfo.flag = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return multiGuestPermissionInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MultiGuestPermissionInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
