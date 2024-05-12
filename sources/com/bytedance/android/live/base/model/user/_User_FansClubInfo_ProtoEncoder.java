package com.bytedance.android.live.base.model.user;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.android.live.base.model.user.User;

/* loaded from: classes.dex */
public final class _User_FansClubInfo_ProtoEncoder implements InterfaceC64604PXc<User.FansClubInfo> {
    public static int LIZJ(User.FansClubInfo fansClubInfo) {
        return C30957CCz.LJIIIZ(5, fansClubInfo.fansCount) + _ImageModel_ProtoEncoder.LJ(4, fansClubInfo.badge) + C30957CCz.LJIIIZ(3, fansClubInfo.fansScore) + C30957CCz.LJIIIZ(2, fansClubInfo.fansLevel) + C30957CCz.LJ(1);
    }

    public static void LIZIZ(CD6 cd6, User.FansClubInfo fansClubInfo) {
        boolean z = fansClubInfo.isSleeping;
        cd6.LIZLLL(1, 0);
        cd6.LJ(z ? 1 : 0);
        long j = fansClubInfo.fansLevel;
        cd6.LIZLLL(2, 0);
        cd6.LJFF(j);
        long j2 = fansClubInfo.fansScore;
        cd6.LIZLLL(3, 0);
        cd6.LJFF(j2);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 4, fansClubInfo.badge);
        long j3 = fansClubInfo.fansCount;
        cd6.LIZLLL(5, 0);
        cd6.LJFF(j3);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, User.FansClubInfo fansClubInfo) {
        LIZIZ(cd6, fansClubInfo);
    }
}
