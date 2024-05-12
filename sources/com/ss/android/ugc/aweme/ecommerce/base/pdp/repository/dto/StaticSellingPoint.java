package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C27347AoJ;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class StaticSellingPoint implements Parcelable {
    public static final Parcelable.Creator<StaticSellingPoint> CREATOR = new C27347AoJ();

    @InterfaceC65349Pkn("background_color")
    public final com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor backgroundColor;

    @InterfaceC65349Pkn("button_type")
    public final String buttonType;

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("icon")
    public final Icon icon;

    @InterfaceC65349Pkn("title")
    public final String title;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StaticSellingPoint)) {
            return false;
        }
        StaticSellingPoint staticSellingPoint = (StaticSellingPoint) obj;
        return o.LJ(this.icon, staticSellingPoint.icon) && o.LJ(this.title, staticSellingPoint.title) && o.LJ(this.backgroundColor, staticSellingPoint.backgroundColor) && o.LJ(this.description, staticSellingPoint.description) && o.LJ(this.buttonType, staticSellingPoint.buttonType);
    }

    public final int hashCode() {
        Icon icon = this.icon;
        int hashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor commonColor = this.backgroundColor;
        int hashCode3 = (hashCode2 + (commonColor == null ? 0 : commonColor.hashCode())) * 31;
        String str2 = this.description;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonType;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Icon icon = this.icon;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
        out.writeString(this.title);
        com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor commonColor = this.backgroundColor;
        if (commonColor == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            commonColor.writeToParcel(out, i);
        }
        out.writeString(this.description);
        out.writeString(this.buttonType);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StaticSellingPoint(icon=");
        LIZ.append(this.icon);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", backgroundColor=");
        LIZ.append(this.backgroundColor);
        LIZ.append(", description=");
        LIZ.append(this.description);
        LIZ.append(", buttonType=");
        return q.LIZIZ(LIZ, this.buttonType, ')', LIZ);
    }

    public StaticSellingPoint(Icon icon, String str, com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor commonColor, String str2, String str3) {
        this.icon = icon;
        this.title = str;
        this.backgroundColor = commonColor;
        this.description = str2;
        this.buttonType = str3;
    }
}
