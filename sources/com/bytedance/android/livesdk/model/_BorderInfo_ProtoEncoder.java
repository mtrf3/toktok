package com.bytedance.android.livesdk.model;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.android.live.base.model.user._PrivilegeLogExtra_ProtoEncoder;

/* loaded from: classes6.dex */
public final class _BorderInfo_ProtoEncoder implements InterfaceC64604PXc<BorderInfo> {
    public static int LIZJ(BorderInfo borderInfo) {
        if (borderInfo == null) {
            return 0;
        }
        return C30957CCz.LJIIL(8, borderInfo.avatarBackgroundBorderColor) + C30957CCz.LJIIL(7, borderInfo.avatarBackgroundColor) + _PrivilegeLogExtra_ProtoEncoder.LJ(6, borderInfo.ribbonLogExtra) + _PrivilegeLogExtra_ProtoEncoder.LJ(5, borderInfo.borderLogExtra) + _ImageModel_ProtoEncoder.LJ(4, borderInfo.profileDecorationRibbon) + C30957CCz.LJIIL(3, borderInfo.source) + C30957CCz.LJIIIZ(2, borderInfo.level) + _ImageModel_ProtoEncoder.LJ(1, borderInfo.icon);
    }

    public static void LIZIZ(CD6 cd6, BorderInfo borderInfo) {
        _ImageModel_ProtoEncoder.LIZJ(cd6, 1, borderInfo.icon);
        long j = borderInfo.level;
        cd6.LIZLLL(2, 0);
        cd6.LJFF(j);
        C30957CCz.LIZLLL(cd6, 3, borderInfo.source);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 4, borderInfo.profileDecorationRibbon);
        _PrivilegeLogExtra_ProtoEncoder.LIZJ(cd6, 5, borderInfo.borderLogExtra);
        _PrivilegeLogExtra_ProtoEncoder.LIZJ(cd6, 6, borderInfo.ribbonLogExtra);
        C30957CCz.LIZLLL(cd6, 7, borderInfo.avatarBackgroundColor);
        C30957CCz.LIZLLL(cd6, 8, borderInfo.avatarBackgroundBorderColor);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, BorderInfo borderInfo) {
        LIZIZ(cd6, borderInfo);
    }
}
