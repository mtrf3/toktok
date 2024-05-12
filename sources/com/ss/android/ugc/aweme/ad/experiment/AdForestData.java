package com.ss.android.ugc.aweme.ad.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class AdForestData extends F9E {

    @InterfaceC65349Pkn("enable_dynamic_ad")
    public final boolean enableDynamicAd;

    @InterfaceC65349Pkn("enable_forest_challenge")
    public final boolean enableForestChallenge;

    @InterfaceC65349Pkn("enable_lynx_interaction")
    public final boolean enableInteraction;

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

    @InterfaceC65349Pkn("enable_lynx_product_title")
    public final boolean enableProductTitle;

    @InterfaceC65349Pkn("enable_shake_egg")
    public final boolean enableShakeEgg;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AdForestData() {
        /*
            r17 = this;
            r1 = 0
            r15 = 16383(0x3fff, float:2.2957E-41)
            r16 = 0
            r0 = r17
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
            r12 = r1
            r13 = r1
            r14 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.experiment.AdForestData.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableLynxLandingPage), Boolean.valueOf(this.enableDynamicAd), Boolean.valueOf(this.enableLynxWishList), Boolean.valueOf(this.enableLynxNewFakeUserFragment), Boolean.valueOf(this.enableLynxLiveLinks), Boolean.valueOf(this.enableLynxSurvey), Boolean.valueOf(this.enableLynxSuperLike), Boolean.valueOf(this.enableLynxCard), Boolean.valueOf(this.enableLynxMask), Boolean.valueOf(this.enableForestChallenge), Boolean.valueOf(this.enableLynxSticker), Boolean.valueOf(this.enableProductTitle), Boolean.valueOf(this.enableInteraction), Boolean.valueOf(this.enableShakeEgg)};
    }

    public AdForestData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.enableLynxLandingPage = z;
        this.enableDynamicAd = z2;
        this.enableLynxWishList = z3;
        this.enableLynxNewFakeUserFragment = z4;
        this.enableLynxLiveLinks = z5;
        this.enableLynxSurvey = z6;
        this.enableLynxSuperLike = z7;
        this.enableLynxCard = z8;
        this.enableLynxMask = z9;
        this.enableForestChallenge = z10;
        this.enableLynxSticker = z11;
        this.enableProductTitle = z12;
        this.enableInteraction = z13;
        this.enableShakeEgg = z14;
    }

    public /* synthetic */ AdForestData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6, (i & 64) != 0 ? false : z7, (i & 128) != 0 ? false : z8, (i & 256) != 0 ? false : z9, (i & 512) != 0 ? false : z10, (i & 1024) != 0 ? false : z11, (i & 2048) != 0 ? false : z12, (i & 4096) != 0 ? false : z13, (i & FileUtils.BUFFER_SIZE) == 0 ? z14 : false);
    }
}
