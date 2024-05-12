package com.bytedance.android.livesdk.model;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;

/* loaded from: classes6.dex */
public final class _GiftLockInfo_ProtoEncoder implements InterfaceC64604PXc<GiftLockInfo> {
    public static int LIZJ(GiftLockInfo giftLockInfo) {
        return C30957CCz.LJI(3, giftLockInfo.giftLevel) + C30957CCz.LJI(2, giftLockInfo.mLockType) + C30957CCz.LJ(1);
    }

    public static void LIZIZ(CD6 cd6, GiftLockInfo giftLockInfo) {
        boolean z = giftLockInfo.mLock;
        cd6.LIZLLL(1, 0);
        cd6.LJ(z ? 1 : 0);
        int i = giftLockInfo.mLockType;
        cd6.LIZLLL(2, 0);
        cd6.LIZJ(i);
        int i2 = giftLockInfo.giftLevel;
        cd6.LIZLLL(3, 0);
        cd6.LIZJ(i2);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, GiftLockInfo giftLockInfo) {
        LIZIZ(cd6, giftLockInfo);
    }
}
