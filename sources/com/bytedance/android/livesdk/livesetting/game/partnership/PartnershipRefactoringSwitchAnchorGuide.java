package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class PartnershipRefactoringSwitchAnchorGuide {

    @InterfaceC65349Pkn("branded_content_toggle")
    public boolean brandedContentToggle;

    @InterfaceC65349Pkn("event")
    public boolean event;

    @InterfaceC65349Pkn("game_live_partnership")
    public boolean gameLivePartnership;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PartnershipRefactoringSwitchAnchorGuide() {
        /*
            r6 = this;
            r1 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.game.partnership.PartnershipRefactoringSwitchAnchorGuide.<init>():void");
    }

    public PartnershipRefactoringSwitchAnchorGuide(boolean z, boolean z2, boolean z3) {
        this.gameLivePartnership = z;
        this.event = z2;
        this.brandedContentToggle = z3;
    }

    public /* synthetic */ PartnershipRefactoringSwitchAnchorGuide(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }
}
