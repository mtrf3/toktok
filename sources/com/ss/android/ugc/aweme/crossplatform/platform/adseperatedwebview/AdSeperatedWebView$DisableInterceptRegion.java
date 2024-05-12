package com.ss.android.ugc.aweme.crossplatform.platform.adseperatedwebview;

import X.C07670Rv;
import X.C16880lQ;
import X.C1JX;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class AdSeperatedWebView$DisableInterceptRegion {

    @InterfaceC65349Pkn("height")
    public final double height;

    @InterfaceC65349Pkn("width")
    public final double width;

    @InterfaceC65349Pkn("x")
    public final double x;

    @InterfaceC65349Pkn("y")
    public final double y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AdSeperatedWebView$DisableInterceptRegion() {
        /*
            r11 = this;
            r1 = 0
            r9 = 15
            r10 = 0
            r0 = r11
            r3 = r1
            r5 = r1
            r7 = r1
            r0.<init>(r1, r3, r5, r7, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.platform.adseperatedwebview.AdSeperatedWebView$DisableInterceptRegion.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSeperatedWebView$DisableInterceptRegion)) {
            return false;
        }
        AdSeperatedWebView$DisableInterceptRegion adSeperatedWebView$DisableInterceptRegion = (AdSeperatedWebView$DisableInterceptRegion) obj;
        return Double.compare(this.x, adSeperatedWebView$DisableInterceptRegion.x) == 0 && Double.compare(this.y, adSeperatedWebView$DisableInterceptRegion.y) == 0 && Double.compare(this.width, adSeperatedWebView$DisableInterceptRegion.width) == 0 && Double.compare(this.height, adSeperatedWebView$DisableInterceptRegion.height) == 0;
    }

    public final int hashCode() {
        return C16880lQ.LLJI(this.height) + C1JX.LIZIZ(this.width, C1JX.LIZIZ(this.y, C16880lQ.LLJI(this.x) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DisableInterceptRegion(x=");
        LIZ.append(this.x);
        LIZ.append(", y=");
        LIZ.append(this.y);
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        return C07670Rv.LIZ(LIZ, this.height, ')', LIZ);
    }

    public AdSeperatedWebView$DisableInterceptRegion(double d, double d2, double d3, double d4) {
        this.x = d;
        this.y = d2;
        this.width = d3;
        this.height = d4;
    }

    public /* synthetic */ AdSeperatedWebView$DisableInterceptRegion(double d, double d2, double d3, double d4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Double.MIN_VALUE : d, (i & 2) == 0 ? d2 : Double.MIN_VALUE, (i & 4) != 0 ? Double.MAX_VALUE : d3, (i & 8) == 0 ? d4 : Double.MAX_VALUE);
    }
}
