package com.bytedance.android.livesdk.gift.model;

import X.CD6;
import X.InterfaceC64604PXc;

/* loaded from: classes16.dex */
public final class _ForceInsertMetricsItem_ProtoEncoder implements InterfaceC64604PXc<ForceInsertMetricsItem> {
    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, ForceInsertMetricsItem forceInsertMetricsItem) {
        ForceInsertMetricsItem forceInsertMetricsItem2 = forceInsertMetricsItem;
        int i = forceInsertMetricsItem2.forceInsertType;
        cd6.LIZLLL(1, 0);
        cd6.LIZJ(i);
        int i2 = forceInsertMetricsItem2.forceIndexConfig;
        cd6.LIZLLL(2, 0);
        cd6.LIZJ(i2);
    }
}
