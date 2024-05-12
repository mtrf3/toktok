package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo;

import X.C27167AlP;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PolicyItem implements Parcelable {
    public static final Parcelable.Creator<PolicyItem> CREATOR = new C27167AlP();

    @InterfaceC65349Pkn("description")
    public final String desc;

    @InterfaceC65349Pkn("logo")
    public final Icon logo;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("small_logo")
    public final Icon smallLogo;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolicyItem)) {
            return false;
        }
        PolicyItem policyItem = (PolicyItem) obj;
        return o.LJ(this.name, policyItem.name) && o.LJ(this.desc, policyItem.desc) && o.LJ(this.logo, policyItem.logo) && o.LJ(this.smallLogo, policyItem.smallLogo);
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Icon icon = this.logo;
        int hashCode3 = (hashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
        Icon icon2 = this.smallLogo;
        return hashCode3 + (icon2 != null ? icon2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PolicyItem(name=");
        LIZ.append(this.name);
        LIZ.append(", desc=");
        LIZ.append(this.desc);
        LIZ.append(", logo=");
        LIZ.append(this.logo);
        LIZ.append(", smallLogo=");
        LIZ.append(this.smallLogo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.name);
        out.writeString(this.desc);
        Icon icon = this.logo;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
        Icon icon2 = this.smallLogo;
        if (icon2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon2.writeToParcel(out, i);
        }
    }

    public PolicyItem(String str, String str2, Icon icon, Icon icon2) {
        this.name = str;
        this.desc = str2;
        this.logo = icon;
        this.smallLogo = icon2;
    }
}
