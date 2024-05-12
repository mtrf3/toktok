package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FL;
import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.RVA;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MarketingConfig implements Parcelable {
    public static final Parcelable.Creator<MarketingConfig> CREATOR = new RVA();

    @InterfaceC65349Pkn("remove_price_str")
    public final Boolean removePriceStr;

    @InterfaceC65349Pkn("show_deduction_text")
    public final Boolean showDeductionText;

    /* JADX WARN: Multi-variable type inference failed */
    public MarketingConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketingConfig)) {
            return false;
        }
        MarketingConfig marketingConfig = (MarketingConfig) obj;
        return o.LJ(this.removePriceStr, marketingConfig.removePriceStr) && o.LJ(this.showDeductionText, marketingConfig.showDeductionText);
    }

    public final int hashCode() {
        Boolean bool = this.removePriceStr;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.showDeductionText;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MarketingConfig(removePriceStr=");
        LIZ.append(this.removePriceStr);
        LIZ.append(", showDeductionText=");
        return C78920UyC.LIZIZ(LIZ, this.showDeductionText, ')', LIZ);
    }

    public MarketingConfig(Boolean bool, Boolean bool2) {
        this.removePriceStr = bool;
        this.showDeductionText = bool2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Boolean bool = this.removePriceStr;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        Boolean bool2 = this.showDeductionText;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool2);
        }
    }

    public /* synthetic */ MarketingConfig(Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? Boolean.FALSE : bool2);
    }
}
