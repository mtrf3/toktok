package com.bytedance.android.livesdk.message.proto;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;

/* loaded from: classes16.dex */
public final class _EcommerceEntrance_ShowcaseEntranceInfo_ProtoEncoder implements InterfaceC64604PXc<EcommerceEntrance.ShowcaseEntranceInfo> {
    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, EcommerceEntrance.ShowcaseEntranceInfo showcaseEntranceInfo) {
        EcommerceEntrance.ShowcaseEntranceInfo showcaseEntranceInfo2 = showcaseEntranceInfo;
        C30957CCz.LIZLLL(cd6, 1, showcaseEntranceInfo2.formatSoldCount);
        long j = showcaseEntranceInfo2.soldCount;
        cd6.LIZLLL(2, 0);
        cd6.LJFF(j);
    }
}
