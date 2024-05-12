package com.ss.android.ugc.aweme.ad.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class AdSparkRefactorData extends F9E {

    @InterfaceC65349Pkn("enable_dynamic_ad")
    public final boolean enableDynamicAd;

    @InterfaceC65349Pkn("enable_lynx_card")
    public final boolean enableLynxCard;

    @InterfaceC65349Pkn("enable_lynx_landing_page")
    public final boolean enableLynxLandingPage;

    @InterfaceC65349Pkn("enable_lynx_live_links")
    public final boolean enableLynxLiveLinks;

    @InterfaceC65349Pkn("enable_lynx_mask")
    public final boolean enableLynxMask;

    @InterfaceC65349Pkn("enable_lynx_new_fake_user_fragment")
    public final boolean enableLynxNewFakeUserFragment;

    @InterfaceC65349Pkn("enable_lynx_sticker")
    public final boolean enableLynxSticker;

    @InterfaceC65349Pkn("enable_lynx_superlike")
    public final boolean enableLynxSuperLike;

    @InterfaceC65349Pkn("enable_lynx_survey")
    public final boolean enableLynxSurvey;

    @InterfaceC65349Pkn("enable_lynx_wish_list")
    public final boolean enableLynxWishList;

    @InterfaceC65349Pkn("enable_spark_challenge")
    public final boolean enableSparkChallenge;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AdSparkRefactorData() {
        /*
            r14 = this;
            r1 = 0
            r12 = 2047(0x7ff, float:2.868E-42)
            r13 = 0
            r0 = r14
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.experiment.AdSparkRefactorData.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableLynxLandingPage), Boolean.valueOf(this.enableDynamicAd), Boolean.valueOf(this.enableLynxWishList), Boolean.valueOf(this.enableLynxNewFakeUserFragment), Boolean.valueOf(this.enableLynxLiveLinks), Boolean.valueOf(this.enableLynxSurvey), Boolean.valueOf(this.enableLynxSuperLike), Boolean.valueOf(this.enableLynxCard), Boolean.valueOf(this.enableLynxMask), Boolean.valueOf(this.enableSparkChallenge), Boolean.valueOf(this.enableLynxSticker)};
    }

    public AdSparkRefactorData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.enableLynxLandingPage = z;
        this.enableDynamicAd = z2;
        this.enableLynxWishList = z3;
        this.enableLynxNewFakeUserFragment = z4;
        this.enableLynxLiveLinks = z5;
        this.enableLynxSurvey = z6;
        this.enableLynxSuperLike = z7;
        this.enableLynxCard = z8;
        this.enableLynxMask = z9;
        this.enableSparkChallenge = z10;
        this.enableLynxSticker = z11;
    }

    public /* synthetic */ AdSparkRefactorData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6, (i & 64) != 0 ? false : z7, (i & 128) != 0 ? false : z8, (i & 256) != 0 ? false : z9, (i & 512) != 0 ? false : z10, (i & 1024) == 0 ? z11 : false);
    }
}
