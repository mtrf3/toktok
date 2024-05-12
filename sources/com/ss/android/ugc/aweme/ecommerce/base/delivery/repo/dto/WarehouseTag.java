package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C26861AgT;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.Icon;
import defpackage.q;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class WarehouseTag implements Parcelable {
    public static final Parcelable.Creator<WarehouseTag> CREATOR = new C26861AgT();

    @InterfaceC65349Pkn("arguments")
    public final HashMap<String, String> arguments;

    @InterfaceC65349Pkn("fulfilled_by")
    public final String fulfilledBy;

    @InterfaceC65349Pkn("icon")
    public final Icon icon;

    @InterfaceC65349Pkn("popup")
    public final ContentPopup popup;

    @InterfaceC65349Pkn("template")
    public final String template;

    /* JADX WARN: Multi-variable type inference failed */
    public WarehouseTag() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WarehouseTag)) {
            return false;
        }
        WarehouseTag warehouseTag = (WarehouseTag) obj;
        return o.LJ(this.icon, warehouseTag.icon) && o.LJ(this.template, warehouseTag.template) && o.LJ(this.arguments, warehouseTag.arguments) && o.LJ(this.popup, warehouseTag.popup) && o.LJ(this.fulfilledBy, warehouseTag.fulfilledBy);
    }

    public final int hashCode() {
        Icon icon = this.icon;
        int hashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        String str = this.template;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        HashMap<String, String> hashMap = this.arguments;
        int hashCode3 = (hashCode2 + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
        ContentPopup contentPopup = this.popup;
        int hashCode4 = (hashCode3 + (contentPopup == null ? 0 : contentPopup.hashCode())) * 31;
        String str2 = this.fulfilledBy;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
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
        out.writeString(this.template);
        HashMap<String, String> hashMap = this.arguments;
        if (hashMap == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(hashMap.size());
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                out.writeString(entry.getKey());
                out.writeString(entry.getValue());
            }
        }
        ContentPopup contentPopup = this.popup;
        if (contentPopup == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            contentPopup.writeToParcel(out, i);
        }
        out.writeString(this.fulfilledBy);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WarehouseTag(icon=");
        LIZ.append(this.icon);
        LIZ.append(", template=");
        LIZ.append(this.template);
        LIZ.append(", arguments=");
        LIZ.append(this.arguments);
        LIZ.append(", popup=");
        LIZ.append(this.popup);
        LIZ.append(", fulfilledBy=");
        return q.LIZIZ(LIZ, this.fulfilledBy, ')', LIZ);
    }

    public WarehouseTag(Icon icon, String str, HashMap<String, String> hashMap, ContentPopup contentPopup, String str2) {
        this.icon = icon;
        this.template = str;
        this.arguments = hashMap;
        this.popup = contentPopup;
        this.fulfilledBy = str2;
    }

    public /* synthetic */ WarehouseTag(Icon icon, String str, HashMap hashMap, ContentPopup contentPopup, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : icon, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : hashMap, (i & 8) != 0 ? null : contentPopup, (i & 16) == 0 ? str2 : null);
    }
}
