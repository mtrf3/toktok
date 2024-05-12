package com.bytedance.android.live.base.model.user;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;

/* loaded from: classes.dex */
public final class _PaddingInfo_ProtoEncoder implements InterfaceC64604PXc<PaddingInfo> {
    public static int LIZJ(PaddingInfo paddingInfo) {
        if (paddingInfo == null) {
            return 0;
        }
        return C30957CCz.LJI(9, paddingInfo.verticalPaddingRule) + C30957CCz.LJI(8, paddingInfo.horizontalPaddingRule) + C30957CCz.LJI(7, paddingInfo.iconBottomPadding) + C30957CCz.LJI(6, paddingInfo.iconTopPadding) + C30957CCz.LJI(5, paddingInfo.rightPadding) + C30957CCz.LJI(4, paddingInfo.leftPadding) + C30957CCz.LJI(3, paddingInfo.badgeWidth) + C30957CCz.LJI(2, paddingInfo.middlePadding) + C30957CCz.LJ(1);
    }

    public static void LIZIZ(CD6 cd6, PaddingInfo paddingInfo) {
        boolean z = paddingInfo.useSpecific;
        cd6.LIZLLL(1, 0);
        cd6.LJ(z ? 1 : 0);
        int i = paddingInfo.middlePadding;
        cd6.LIZLLL(2, 0);
        cd6.LIZJ(i);
        int i2 = paddingInfo.badgeWidth;
        cd6.LIZLLL(3, 0);
        cd6.LIZJ(i2);
        int i3 = paddingInfo.leftPadding;
        cd6.LIZLLL(4, 0);
        cd6.LIZJ(i3);
        int i4 = paddingInfo.rightPadding;
        cd6.LIZLLL(5, 0);
        cd6.LIZJ(i4);
        int i5 = paddingInfo.iconTopPadding;
        cd6.LIZLLL(6, 0);
        cd6.LIZJ(i5);
        int i6 = paddingInfo.iconBottomPadding;
        cd6.LIZLLL(7, 0);
        cd6.LIZJ(i6);
        int i7 = paddingInfo.horizontalPaddingRule;
        cd6.LIZLLL(8, 0);
        cd6.LIZJ(i7);
        int i8 = paddingInfo.verticalPaddingRule;
        cd6.LIZLLL(9, 0);
        cd6.LIZJ(i8);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, PaddingInfo paddingInfo) {
        LIZIZ(cd6, paddingInfo);
    }
}
