package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.RV2;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ReminderItem implements Parcelable {
    public static final Parcelable.Creator<ReminderItem> CREATOR = new RV2();

    @InterfaceC65349Pkn("encoded_param")
    public final String encodeParam;

    @InterfaceC65349Pkn("event_id")
    public final String eventId;

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @InterfaceC65349Pkn("tab_id")
    public final String tabId;

    /* JADX WARN: Multi-variable type inference failed */
    public ReminderItem() {
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
        if (!(obj instanceof ReminderItem)) {
            return false;
        }
        ReminderItem reminderItem = (ReminderItem) obj;
        return o.LJ(this.eventId, reminderItem.eventId) && o.LJ(this.tabId, reminderItem.tabId) && o.LJ(this.productId, reminderItem.productId) && o.LJ(this.encodeParam, reminderItem.encodeParam);
    }

    public final int hashCode() {
        String str = this.eventId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tabId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.encodeParam;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.eventId);
        out.writeString(this.tabId);
        out.writeString(this.productId);
        out.writeString(this.encodeParam);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReminderItem(eventId=");
        LIZ.append(this.eventId);
        LIZ.append(", tabId=");
        LIZ.append(this.tabId);
        LIZ.append(", productId=");
        LIZ.append(this.productId);
        LIZ.append(", encodeParam=");
        return q.LIZIZ(LIZ, this.encodeParam, ')', LIZ);
    }

    public ReminderItem(String str, String str2, String str3, String str4) {
        this.eventId = str;
        this.tabId = str2;
        this.productId = str3;
        this.encodeParam = str4;
    }

    public /* synthetic */ ReminderItem(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
