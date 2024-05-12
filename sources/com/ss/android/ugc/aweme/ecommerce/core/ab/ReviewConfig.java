package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class ReviewConfig extends F9E {

    @InterfaceC65349Pkn("new_review_style")
    public boolean newReviewStyle;

    @InterfaceC65349Pkn("separate_display")
    public boolean pdpSeparateDisplay;

    @InterfaceC65349Pkn("show_rating")
    public boolean showRating;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ReviewConfig() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.ab.ReviewConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.pdpSeparateDisplay), Boolean.valueOf(this.showRating), Boolean.valueOf(this.newReviewStyle)};
    }

    public ReviewConfig(boolean z, boolean z2, boolean z3) {
        this.pdpSeparateDisplay = z;
        this.showRating = z2;
        this.newReviewStyle = z3;
    }

    public /* synthetic */ ReviewConfig(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }
}
