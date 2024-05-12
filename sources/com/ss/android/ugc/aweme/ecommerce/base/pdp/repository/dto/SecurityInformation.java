package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1NE;
import X.C26713Ae5;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SecurityInformation implements Parcelable {
    public static final Parcelable.Creator<SecurityInformation> CREATOR = new C26713Ae5();

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("security_information_items")
    public final List<SecurityInformationItem> securityInformationItems;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecurityInformation)) {
            return false;
        }
        SecurityInformation securityInformation = (SecurityInformation) obj;
        return o.LJ(this.name, securityInformation.name) && o.LJ(this.securityInformationItems, securityInformation.securityInformationItems);
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<SecurityInformationItem> list = this.securityInformationItems;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SecurityInformation(name=");
        LIZ.append(this.name);
        LIZ.append(", securityInformationItems=");
        return C1NE.LIZIZ(LIZ, this.securityInformationItems, ')', LIZ);
    }

    public SecurityInformation(String str, List<SecurityInformationItem> list) {
        this.name = str;
        this.securityInformationItems = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.name);
        List<SecurityInformationItem> list = this.securityInformationItems;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
        while (LIZIZ.hasNext()) {
            ((SecurityInformationItem) LIZIZ.next()).writeToParcel(out, i);
        }
    }
}
