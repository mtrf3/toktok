package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C69662RVq;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class CodPolicy implements Parcelable {
    public static final Parcelable.Creator<CodPolicy> CREATOR = new C69662RVq();

    @InterfaceC65349Pkn("text")
    public final String desc;

    @InterfaceC65349Pkn("icon")
    public final Icon icon;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public CodPolicy() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CodPolicy)) {
            return false;
        }
        CodPolicy codPolicy = (CodPolicy) obj;
        return o.LJ(this.title, codPolicy.title) && o.LJ(this.schema, codPolicy.schema) && o.LJ(this.icon, codPolicy.icon) && o.LJ(this.desc, codPolicy.desc);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.schema;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Icon icon = this.icon;
        int hashCode3 = (hashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
        String str3 = this.desc;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.title);
        out.writeString(this.schema);
        Icon icon = this.icon;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
        out.writeString(this.desc);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CodPolicy(title=");
        LIZ.append(this.title);
        LIZ.append(", schema=");
        LIZ.append(this.schema);
        LIZ.append(", icon=");
        LIZ.append(this.icon);
        LIZ.append(", desc=");
        return q.LIZIZ(LIZ, this.desc, ')', LIZ);
    }

    public CodPolicy(String str, String str2, Icon icon, String str3) {
        this.title = str;
        this.schema = str2;
        this.icon = icon;
        this.desc = str3;
    }

    public /* synthetic */ CodPolicy(String str, String str2, Icon icon, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : icon, (i & 8) != 0 ? null : str3);
    }
}
