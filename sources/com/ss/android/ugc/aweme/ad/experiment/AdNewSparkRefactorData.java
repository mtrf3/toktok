package com.ss.android.ugc.aweme.ad.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class AdNewSparkRefactorData extends F9E {

    @InterfaceC65349Pkn("enable_lynx_card")
    public final boolean enableLynxCard;

    @InterfaceC65349Pkn("enable_lynx_landing_page")
    public final boolean enableLynxLandingPage;

    @InterfaceC65349Pkn("enable_lynx_live_links")
    public final boolean enableLynxLiveLinks;

    @InterfaceC65349Pkn("enable_lynx_new_fake_user_fragment")
    public final boolean enableLynxNewFakeUserFragment;

    @InterfaceC65349Pkn("enable_lynx_sticker")
    public final boolean enableLynxSticker;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AdNewSparkRefactorData() {
        /*
            r8 = this;
            r1 = 0
            r6 = 31
            r7 = 0
            r0 = r8
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.experiment.AdNewSparkRefactorData.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableLynxLandingPage), Boolean.valueOf(this.enableLynxCard), Boolean.valueOf(this.enableLynxNewFakeUserFragment), Boolean.valueOf(this.enableLynxLiveLinks), Boolean.valueOf(this.enableLynxSticker)};
    }

    public AdNewSparkRefactorData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.enableLynxLandingPage = z;
        this.enableLynxCard = z2;
        this.enableLynxNewFakeUserFragment = z3;
        this.enableLynxLiveLinks = z4;
        this.enableLynxSticker = z5;
    }

    public /* synthetic */ AdNewSparkRefactorData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5);
    }
}
