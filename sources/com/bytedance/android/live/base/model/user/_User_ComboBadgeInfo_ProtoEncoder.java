package com.bytedance.android.live.base.model.user;

import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.android.live.base.model.user.User;

/* loaded from: classes.dex */
public final class _User_ComboBadgeInfo_ProtoEncoder implements InterfaceC64604PXc<User.ComboBadgeInfo> {
    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, User.ComboBadgeInfo comboBadgeInfo) {
        User.ComboBadgeInfo comboBadgeInfo2 = comboBadgeInfo;
        _ImageModel_ProtoEncoder.LIZJ(cd6, 1, comboBadgeInfo2.icon);
        long j = comboBadgeInfo2.comboCount;
        cd6.LIZLLL(2, 0);
        cd6.LJFF(j);
    }
}
