package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FJ;
import X.InterfaceC65349Pkn;
import X.RXH;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class NavButton implements Parcelable {
    public static final Parcelable.Creator<NavButton> CREATOR = new RXH();

    @InterfaceC65349Pkn("button_action")
    public final Integer action;

    @InterfaceC65349Pkn("button_name")
    public final String buttonName;

    @InterfaceC65349Pkn("click_toast")
    public final String clickToast;

    @InterfaceC65349Pkn("icon")
    public final String icon;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("show_count")
    public final Integer showCount;

    @InterfaceC65349Pkn("status")
    public final Integer status;

    @InterfaceC65349Pkn("style")
    public final Integer style;

    @InterfaceC65349Pkn("text")
    public final String text;

    /* JADX WARN: Multi-variable type inference failed */
    public NavButton() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavButton)) {
            return false;
        }
        NavButton navButton = (NavButton) obj;
        return o.LJ(this.icon, navButton.icon) && o.LJ(this.text, navButton.text) && o.LJ(this.schema, navButton.schema) && o.LJ(this.style, navButton.style) && o.LJ(this.status, navButton.status) && o.LJ(this.action, navButton.action) && o.LJ(this.showCount, navButton.showCount) && o.LJ(this.buttonName, navButton.buttonName) && o.LJ(this.clickToast, navButton.clickToast);
    }

    public final int hashCode() {
        String str = this.icon;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.schema;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.style;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.status;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.action;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.showCount;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str4 = this.buttonName;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.clickToast;
        return hashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NavButton(icon=");
        LIZ.append(this.icon);
        LIZ.append(", text=");
        LIZ.append(this.text);
        LIZ.append(", schema=");
        LIZ.append(this.schema);
        LIZ.append(", style=");
        LIZ.append(this.style);
        LIZ.append(", status=");
        LIZ.append(this.status);
        LIZ.append(", action=");
        LIZ.append(this.action);
        LIZ.append(", showCount=");
        LIZ.append(this.showCount);
        LIZ.append(", buttonName=");
        LIZ.append(this.buttonName);
        LIZ.append(", clickToast=");
        return q.LIZIZ(LIZ, this.clickToast, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.icon);
        out.writeString(this.text);
        out.writeString(this.schema);
        Integer num = this.style;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Integer num2 = this.status;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        Integer num3 = this.action;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num3);
        }
        Integer num4 = this.showCount;
        if (num4 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num4);
        }
        out.writeString(this.buttonName);
        out.writeString(this.clickToast);
    }

    public NavButton(String str, String str2, String str3, Integer num, Integer num2, Integer num3, Integer num4, String str4, String str5) {
        this.icon = str;
        this.text = str2;
        this.schema = str3;
        this.style = num;
        this.status = num2;
        this.action = num3;
        this.showCount = num4;
        this.buttonName = str4;
        this.clickToast = str5;
    }

    public /* synthetic */ NavButton(String str, String str2, String str3, Integer num, Integer num2, Integer num3, Integer num4, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : num4, (i & 128) != 0 ? null : str4, (i & 256) == 0 ? str5 : null);
    }
}
