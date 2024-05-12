package com.ss.android.ugc.aweme.journey.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class NUJSimplifyModel extends F9E {

    @InterfaceC65349Pkn("should_delay_personal_ads")
    public final boolean delayAds;

    @InterfaceC65349Pkn("should_delay_social_pop")
    public final boolean delaySocial;

    @InterfaceC65349Pkn("should_remove_is")
    public final boolean skipIS;

    @InterfaceC65349Pkn("should_remove_language")
    public final boolean skipLanguage;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NUJSimplifyModel() {
        /*
            r7 = this;
            r1 = 0
            r5 = 15
            r6 = 0
            r0 = r7
            r2 = r1
            r3 = r1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.journey.experiment.NUJSimplifyModel.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.delayAds), Boolean.valueOf(this.delaySocial), Boolean.valueOf(this.skipLanguage), Boolean.valueOf(this.skipIS)};
    }

    public NUJSimplifyModel(boolean z, boolean z2, boolean z3, boolean z4) {
        this.delayAds = z;
        this.delaySocial = z2;
        this.skipLanguage = z3;
        this.skipIS = z4;
    }

    public /* synthetic */ NUJSimplifyModel(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
    }
}
