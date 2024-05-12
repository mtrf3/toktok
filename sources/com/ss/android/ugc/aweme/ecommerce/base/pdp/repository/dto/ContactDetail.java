package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C27075Ajv;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ContactDetail implements Parcelable {
    public static final Parcelable.Creator<ContactDetail> CREATOR = new C27075Ajv();

    @InterfaceC65349Pkn("icon")
    public final Icon icon;

    @InterfaceC65349Pkn("link")
    public final String link;

    @InterfaceC65349Pkn("text")
    public final String text;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactDetail)) {
            return false;
        }
        ContactDetail contactDetail = (ContactDetail) obj;
        return o.LJ(this.link, contactDetail.link) && o.LJ(this.icon, contactDetail.icon) && o.LJ(this.text, contactDetail.text);
    }

    public final int hashCode() {
        String str = this.link;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Icon icon = this.icon;
        int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        String str2 = this.text;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.link);
        Icon icon = this.icon;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
        out.writeString(this.text);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ContactDetail(link=");
        LIZ.append(this.link);
        LIZ.append(", icon=");
        LIZ.append(this.icon);
        LIZ.append(", text=");
        return q.LIZIZ(LIZ, this.text, ')', LIZ);
    }

    public ContactDetail(String str, Icon icon, String str2) {
        this.link = str;
        this.icon = icon;
        this.text = str2;
    }
}
