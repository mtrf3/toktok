package com.bytedance.android.livesdk.model;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* loaded from: classes16.dex */
public final class _GiftOperation_ProtoEncoder implements InterfaceC64604PXc<GiftOperation> {
    public static void LIZIZ(CD6 cd6, GiftOperation giftOperation) {
        _ImageModel_ProtoEncoder.LIZJ(cd6, 1, giftOperation.leftImage);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 2, giftOperation.rightImage);
        C30957CCz.LIZLLL(cd6, 3, giftOperation.title);
        C30957CCz.LIZLLL(cd6, 4, giftOperation.titleColor);
        long j = giftOperation.titleSize;
        cd6.LIZLLL(5, 0);
        cd6.LJFF(j);
        C30957CCz.LIZLLL(cd6, 6, giftOperation.schemeUrl);
        C30957CCz.LIZLLL(cd6, 7, giftOperation.eventName);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, GiftOperation giftOperation) {
        LIZIZ(cd6, giftOperation);
    }
}
