package com.bytedance.android.live.base.model.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;

/* loaded from: classes.dex */
public final class _User_FansClubInfo_ProtoDecoder implements InterfaceC31105CIr<User.FansClubInfo> {
    public static User.FansClubInfo LIZIZ(Q9H q9h) {
        User.FansClubInfo fansClubInfo = new User.FansClubInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    fansClubInfo.fansCount = q9h.LJIIJJI();
                                }
                            } else {
                                fansClubInfo.badge = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            fansClubInfo.fansScore = q9h.LJIIJJI();
                        }
                    } else {
                        fansClubInfo.fansLevel = q9h.LJIIJJI();
                    }
                } else {
                    fansClubInfo.isSleeping = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return fansClubInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final User.FansClubInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
