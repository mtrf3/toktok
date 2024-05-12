package com.ss.android.ugc.aweme.discover.abtest;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class SearchSecurityControlValue extends F9E {

    @InterfaceC65349Pkn("disable_at_user_search")
    public boolean disableAtUserSearch;

    @InterfaceC65349Pkn("disable_ecom_tab")
    public boolean disableEcomTab;

    @InterfaceC65349Pkn("disable_effect_search")
    public boolean disableEffectSearch;

    @InterfaceC65349Pkn("disable_general_tab")
    public boolean disableGeneralTab;

    @InterfaceC65349Pkn("disable_hashtag_search")
    public boolean disableHashtagSearch;

    @InterfaceC65349Pkn("disable_hashtag_tab")
    public boolean disableHashtagTab;

    @InterfaceC65349Pkn("disable_live_tab")
    public boolean disableLiveTab;

    @InterfaceC65349Pkn("disable_music_search")
    public boolean disableMusicSearch;

    @InterfaceC65349Pkn("disable_music_tab")
    public boolean disableMusicTab;

    @InterfaceC65349Pkn("disable_poi_tab")
    public final boolean disablePoiTab;

    @InterfaceC65349Pkn("disable_sug")
    public boolean disableSug;

    @InterfaceC65349Pkn("disable_suggest_guide")
    public boolean disableSuggestGuide;

    @InterfaceC65349Pkn("disable_comment_suggested_search")
    public boolean disableSuggestWords;

    @InterfaceC65349Pkn("disable_user_tab")
    public boolean disableUserTab;

    @InterfaceC65349Pkn("disable_video_tab")
    public boolean disableVideoTab;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SearchSecurityControlValue() {
        /*
            r18 = this;
            r1 = 0
            r16 = 32767(0x7fff, float:4.5916E-41)
            r17 = 0
            r0 = r18
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
            r15 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.abtest.SearchSecurityControlValue.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.disableGeneralTab), Boolean.valueOf(this.disableVideoTab), Boolean.valueOf(this.disableUserTab), Boolean.valueOf(this.disableMusicTab), Boolean.valueOf(this.disableHashtagTab), Boolean.valueOf(this.disableEcomTab), Boolean.valueOf(this.disableLiveTab), Boolean.valueOf(this.disablePoiTab), Boolean.valueOf(this.disableSug), Boolean.valueOf(this.disableSuggestGuide), Boolean.valueOf(this.disableEffectSearch), Boolean.valueOf(this.disableMusicSearch), Boolean.valueOf(this.disableAtUserSearch), Boolean.valueOf(this.disableHashtagSearch), Boolean.valueOf(this.disableSuggestWords)};
    }

    public SearchSecurityControlValue(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.disableGeneralTab = z;
        this.disableVideoTab = z2;
        this.disableUserTab = z3;
        this.disableMusicTab = z4;
        this.disableHashtagTab = z5;
        this.disableEcomTab = z6;
        this.disableLiveTab = z7;
        this.disablePoiTab = z8;
        this.disableSug = z9;
        this.disableSuggestGuide = z10;
        this.disableEffectSearch = z11;
        this.disableMusicSearch = z12;
        this.disableAtUserSearch = z13;
        this.disableHashtagSearch = z14;
        this.disableSuggestWords = z15;
    }

    public /* synthetic */ SearchSecurityControlValue(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6, (i & 64) != 0 ? false : z7, (i & 128) != 0 ? false : z8, (i & 256) != 0 ? false : z9, (i & 512) != 0 ? false : z10, (i & 1024) != 0 ? false : z11, (i & 2048) != 0 ? false : z12, (i & 4096) != 0 ? false : z13, (i & FileUtils.BUFFER_SIZE) != 0 ? false : z14, (i & 16384) == 0 ? z15 : false);
    }
}
