package com.bytedance.android.live.base.model.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;

/* loaded from: classes.dex */
public final class _User_ComboBadgeInfo_ProtoDecoder implements InterfaceC31105CIr<User.ComboBadgeInfo> {
    public static User.ComboBadgeInfo LIZIZ(Q9H q9h) {
        User.ComboBadgeInfo comboBadgeInfo = new User.ComboBadgeInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        comboBadgeInfo.comboCount = q9h.LJIIJJI();
                    }
                } else {
                    comboBadgeInfo.icon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return comboBadgeInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final User.ComboBadgeInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
