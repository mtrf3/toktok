package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FJ;
import X.C69674RWc;
import X.C69675RWd;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class Tab implements Parcelable {

    @InterfaceC65349Pkn("tab_name")
    public final Integer tabName;

    @InterfaceC65349Pkn("tab_title")
    public final String tabTitle;

    @InterfaceC65349Pkn("to_brick")
    public final Integer toBrick;
    public static final C69675RWd Companion = new C69675RWd();
    public static final Parcelable.Creator<Tab> CREATOR = new C69674RWc();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tab)) {
            return false;
        }
        Tab tab = (Tab) obj;
        return o.LJ(this.tabName, tab.tabName) && o.LJ(this.tabTitle, tab.tabTitle) && o.LJ(this.toBrick, tab.toBrick);
    }

    public final int hashCode() {
        Integer num = this.tabName;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.tabTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.toBrick;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Tab(tabName=");
        LIZ.append(this.tabName);
        LIZ.append(", tabTitle=");
        LIZ.append(this.tabTitle);
        LIZ.append(", toBrick=");
        return s0.LIZJ(LIZ, this.toBrick, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Integer num = this.tabName;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.tabTitle);
        Integer num2 = this.toBrick;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
    }

    public Tab(Integer num, String str, Integer num2) {
        this.tabName = num;
        this.tabTitle = str;
        this.toBrick = num2;
    }

    public /* synthetic */ Tab(Integer num, String str, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? 0 : num2);
    }
}
