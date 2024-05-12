package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StoreSellingPoint {

    @InterfaceC65349Pkn("expRatePercentile")
    public final Integer expRatePercentile;

    @InterfaceC65349Pkn("rateDisplayStyle")
    public final Integer rateDisplayStyle;

    @InterfaceC65349Pkn("shopRatingDisplay")
    public final String shopRatingDisplay;

    @InterfaceC65349Pkn("showRateNotApplicable")
    public final Boolean showRateNotApplicable;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreSellingPoint)) {
            return false;
        }
        StoreSellingPoint storeSellingPoint = (StoreSellingPoint) obj;
        return o.LJ(this.shopRatingDisplay, storeSellingPoint.shopRatingDisplay) && o.LJ(this.expRatePercentile, storeSellingPoint.expRatePercentile) && o.LJ(this.rateDisplayStyle, storeSellingPoint.rateDisplayStyle) && o.LJ(this.showRateNotApplicable, storeSellingPoint.showRateNotApplicable);
    }

    public final int hashCode() {
        String str = this.shopRatingDisplay;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.expRatePercentile;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.rateDisplayStyle;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.showRateNotApplicable;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoreSellingPoint(shopRatingDisplay=");
        LIZ.append(this.shopRatingDisplay);
        LIZ.append(", expRatePercentile=");
        LIZ.append(this.expRatePercentile);
        LIZ.append(", rateDisplayStyle=");
        LIZ.append(this.rateDisplayStyle);
        LIZ.append(", showRateNotApplicable=");
        return C78920UyC.LIZIZ(LIZ, this.showRateNotApplicable, ')', LIZ);
    }

    public StoreSellingPoint(String str, Integer num, Integer num2, Boolean bool) {
        this.shopRatingDisplay = str;
        this.expRatePercentile = num;
        this.rateDisplayStyle = num2;
        this.showRateNotApplicable = bool;
    }

    public /* synthetic */ StoreSellingPoint(String str, Integer num, Integer num2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, num, num2, bool);
    }
}
