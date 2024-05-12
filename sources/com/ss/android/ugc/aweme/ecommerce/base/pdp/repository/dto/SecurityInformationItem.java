package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1NE;
import X.C26710Ae2;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SecurityInformationItem implements Parcelable {
    public static final Parcelable.Creator<SecurityInformationItem> CREATOR = new C26710Ae2();

    @InterfaceC65349Pkn("logo")
    public final Icon logo;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("security_information_item_desc")
    public final List<SecurityInformationItemDesc> securityInformationItemDesc;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecurityInformationItem)) {
            return false;
        }
        SecurityInformationItem securityInformationItem = (SecurityInformationItem) obj;
        return o.LJ(this.name, securityInformationItem.name) && o.LJ(this.logo, securityInformationItem.logo) && o.LJ(this.securityInformationItemDesc, securityInformationItem.securityInformationItemDesc);
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Icon icon = this.logo;
        int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        List<SecurityInformationItemDesc> list = this.securityInformationItemDesc;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SecurityInformationItem(name=");
        LIZ.append(this.name);
        LIZ.append(", logo=");
        LIZ.append(this.logo);
        LIZ.append(", securityInformationItemDesc=");
        return C1NE.LIZIZ(LIZ, this.securityInformationItemDesc, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.name);
        Icon icon = this.logo;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
        List<SecurityInformationItemDesc> list = this.securityInformationItemDesc;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
        while (LIZIZ.hasNext()) {
            ((SecurityInformationItemDesc) LIZIZ.next()).writeToParcel(out, i);
        }
    }

    public SecurityInformationItem(String str, Icon icon, List<SecurityInformationItemDesc> list) {
        this.name = str;
        this.logo = icon;
        this.securityInformationItemDesc = list;
    }
}
