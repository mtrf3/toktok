package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C26764Aeu;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.Icon;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class DispatchFrom implements Parcelable {
    public static final Parcelable.Creator<DispatchFrom> CREATOR = new C26764Aeu();

    @InterfaceC65349Pkn("arrow")
    public final Icon arrow;

    @InterfaceC65349Pkn("icon")
    public final Icon icon;

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("warehouse_tag")
    public final WarehouseTag warehouseTag;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DispatchFrom)) {
            return false;
        }
        DispatchFrom dispatchFrom = (DispatchFrom) obj;
        return o.LJ(this.icon, dispatchFrom.icon) && o.LJ(this.title, dispatchFrom.title) && o.LJ(this.text, dispatchFrom.text) && o.LJ(this.arrow, dispatchFrom.arrow) && o.LJ(this.warehouseTag, dispatchFrom.warehouseTag);
    }

    public final int hashCode() {
        Icon icon = this.icon;
        int hashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Icon icon2 = this.arrow;
        int hashCode4 = (hashCode3 + (icon2 == null ? 0 : icon2.hashCode())) * 31;
        WarehouseTag warehouseTag = this.warehouseTag;
        return hashCode4 + (warehouseTag != null ? warehouseTag.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DispatchFrom(icon=");
        LIZ.append(this.icon);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", text=");
        LIZ.append(this.text);
        LIZ.append(", arrow=");
        LIZ.append(this.arrow);
        LIZ.append(", warehouseTag=");
        LIZ.append(this.warehouseTag);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
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
        out.writeString(this.text);
        Icon icon2 = this.arrow;
        if (icon2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon2.writeToParcel(out, i);
        }
        WarehouseTag warehouseTag = this.warehouseTag;
        if (warehouseTag == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            warehouseTag.writeToParcel(out, i);
        }
    }

    public DispatchFrom(Icon icon, String str, String str2, Icon icon2, WarehouseTag warehouseTag) {
        this.icon = icon;
        this.title = str;
        this.text = str2;
        this.arrow = icon2;
        this.warehouseTag = warehouseTag;
    }

    public /* synthetic */ DispatchFrom(Icon icon, String str, String str2, Icon icon2, WarehouseTag warehouseTag, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : icon, str, str2, (i & 8) == 0 ? icon2 : null, warehouseTag);
    }
}
