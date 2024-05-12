package com.bytedance.android.livesdk.model;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;

/* loaded from: classes6.dex */
public final class _GiftBoxInfo_ProtoEncoder implements InterfaceC64604PXc<GiftBoxInfo> {
    public static int LIZIZ(GiftBoxInfo giftBoxInfo) {
        return C30957CCz.LJIIL(3, giftBoxInfo.schemeUrl) + C30957CCz.LJ(2) + C30957CCz.LJIIIZ(1, giftBoxInfo.capacity);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, GiftBoxInfo giftBoxInfo) {
        GiftBoxInfo giftBoxInfo2 = giftBoxInfo;
        long j = giftBoxInfo2.capacity;
        cd6.LIZLLL(1, 0);
        cd6.LJFF(j);
        boolean z = giftBoxInfo2.isPrimaryBox;
        cd6.LIZLLL(2, 0);
        cd6.LJ(z ? 1 : 0);
        C30957CCz.LIZLLL(cd6, 3, giftBoxInfo2.schemeUrl);
    }
}
