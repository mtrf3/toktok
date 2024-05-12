package com.bytedance.android.livesdk.model;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* loaded from: classes16.dex */
public final class _AuthenticationInfo_ProtoEncoder implements InterfaceC64604PXc<AuthenticationInfo> {
    public static int LIZIZ(AuthenticationInfo authenticationInfo) {
        return _ImageModel_ProtoEncoder.LJ(3, authenticationInfo.authenticationBadge) + C30957CCz.LJIIL(2, authenticationInfo.enterpriseVerifyReason) + C30957CCz.LJIIL(1, authenticationInfo.customVerify);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, AuthenticationInfo authenticationInfo) {
        AuthenticationInfo authenticationInfo2 = authenticationInfo;
        C30957CCz.LIZLLL(cd6, 1, authenticationInfo2.customVerify);
        C30957CCz.LIZLLL(cd6, 2, authenticationInfo2.enterpriseVerifyReason);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 3, authenticationInfo2.authenticationBadge);
    }
}
