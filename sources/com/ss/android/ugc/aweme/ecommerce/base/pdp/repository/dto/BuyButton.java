package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C69691RWt;
import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class BuyButton implements Parcelable {
    public static final Parcelable.Creator<BuyButton> CREATOR = new C69691RWt();

    @InterfaceC65349Pkn("default_desc")
    public final String default_desc;

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("is_hide")
    public final Boolean isHide;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuyButton)) {
            return false;
        }
        BuyButton buyButton = (BuyButton) obj;
        return o.LJ(this.desc, buyButton.desc) && o.LJ(this.default_desc, buyButton.default_desc) && o.LJ(this.isHide, buyButton.isHide);
    }

    public final int hashCode() {
        String str = this.desc;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.default_desc;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isHide;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int i2;
        o.LJIIIZ(out, "out");
        out.writeString(this.desc);
        out.writeString(this.default_desc);
        Boolean bool = this.isHide;
        if (bool == null) {
            i2 = 0;
        } else {
            out.writeInt(1);
            i2 = bool.booleanValue();
        }
        out.writeInt(i2);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BuyButton(desc=");
        LIZ.append(this.desc);
        LIZ.append(", default_desc=");
        LIZ.append(this.default_desc);
        LIZ.append(", isHide=");
        return C78920UyC.LIZIZ(LIZ, this.isHide, ')', LIZ);
    }

    public BuyButton(String str, String str2, Boolean bool) {
        this.desc = str;
        this.default_desc = str2;
        this.isHide = bool;
    }
}
