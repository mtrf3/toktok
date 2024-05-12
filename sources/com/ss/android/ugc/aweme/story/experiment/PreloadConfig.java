package com.ss.android.ugc.aweme.story.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class PreloadConfig extends F9E {

    @InterfaceC65349Pkn("cold_start_opt")
    public boolean coldStartOpt;

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    @InterfaceC65349Pkn("feed_advance_preload")
    public boolean feedAdvancePreload;

    @InterfaceC65349Pkn("feed_click_preload")
    public boolean feedClickPreload;

    @InterfaceC65349Pkn("other_advance_preload")
    public boolean otherAdvancePreload;

    @InterfaceC65349Pkn("other_click_preload")
    public boolean otherClickPreload;

    @InterfaceC65349Pkn("profile_advance_preload")
    public boolean profileAdvancePreload;

    @InterfaceC65349Pkn("profile_click_preload")
    public boolean profileClickPreload;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PreloadConfig() {
        /*
            r11 = this;
            r1 = 0
            r9 = 255(0xff, float:3.57E-43)
            r10 = 0
            r0 = r11
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.experiment.PreloadConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), Boolean.valueOf(this.feedAdvancePreload), Boolean.valueOf(this.feedClickPreload), Boolean.valueOf(this.profileAdvancePreload), Boolean.valueOf(this.profileClickPreload), Boolean.valueOf(this.otherAdvancePreload), Boolean.valueOf(this.otherClickPreload), Boolean.valueOf(this.coldStartOpt)};
    }

    public PreloadConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.enable = z;
        this.feedAdvancePreload = z2;
        this.feedClickPreload = z3;
        this.profileAdvancePreload = z4;
        this.profileClickPreload = z5;
        this.otherAdvancePreload = z6;
        this.otherClickPreload = z7;
        this.coldStartOpt = z8;
    }

    public /* synthetic */ PreloadConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6, (i & 64) != 0 ? false : z7, (i & 128) == 0 ? z8 : false);
    }
}
