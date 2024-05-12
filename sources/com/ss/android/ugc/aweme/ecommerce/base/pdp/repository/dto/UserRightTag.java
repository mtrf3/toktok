package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C69663RVr;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class UserRightTag implements Parcelable {
    public static final Parcelable.Creator<UserRightTag> CREATOR = new C69663RVr();

    @InterfaceC65349Pkn("icon")
    public final Icon icon;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("title_en")
    public final String titleEn;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserRightTag)) {
            return false;
        }
        UserRightTag userRightTag = (UserRightTag) obj;
        return o.LJ(this.title, userRightTag.title) && o.LJ(this.titleEn, userRightTag.titleEn) && o.LJ(this.icon, userRightTag.icon) && o.LJ(this.schema, userRightTag.schema);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.titleEn;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Icon icon = this.icon;
        int hashCode3 = (hashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
        String str3 = this.schema;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.title);
        out.writeString(this.titleEn);
        Icon icon = this.icon;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
        out.writeString(this.schema);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserRightTag(title=");
        LIZ.append(this.title);
        LIZ.append(", titleEn=");
        LIZ.append(this.titleEn);
        LIZ.append(", icon=");
        LIZ.append(this.icon);
        LIZ.append(", schema=");
        return q.LIZIZ(LIZ, this.schema, ')', LIZ);
    }

    public UserRightTag(String str, String str2, Icon icon, String str3) {
        this.title = str;
        this.titleEn = str2;
        this.icon = icon;
        this.schema = str3;
    }
}
