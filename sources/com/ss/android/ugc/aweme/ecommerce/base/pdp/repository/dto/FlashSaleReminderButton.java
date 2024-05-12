package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.RV4;
import X.RV5;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class FlashSaleReminderButton implements Parcelable {

    @InterfaceC65349Pkn("activity_code")
    public final String activityCode;

    @InterfaceC65349Pkn("encoded_param")
    public final String encodedParam;

    @InterfaceC65349Pkn("event_id")
    public final String eventId;

    @InterfaceC65349Pkn("event_name")
    public final String eventName;

    @InterfaceC65349Pkn("product_id")
    public final String productID;

    @InterfaceC65349Pkn("status")
    public Integer status;

    @InterfaceC65349Pkn("tab_id")
    public final String tabId;
    public static final RV5 Companion = new RV5();
    public static final Parcelable.Creator<FlashSaleReminderButton> CREATOR = new RV4();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlashSaleReminderButton)) {
            return false;
        }
        FlashSaleReminderButton flashSaleReminderButton = (FlashSaleReminderButton) obj;
        return o.LJ(this.status, flashSaleReminderButton.status) && o.LJ(this.activityCode, flashSaleReminderButton.activityCode) && o.LJ(this.eventId, flashSaleReminderButton.eventId) && o.LJ(this.tabId, flashSaleReminderButton.tabId) && o.LJ(this.productID, flashSaleReminderButton.productID) && o.LJ(this.encodedParam, flashSaleReminderButton.encodedParam) && o.LJ(this.eventName, flashSaleReminderButton.eventName);
    }

    public final int hashCode() {
        Integer num = this.status;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.activityCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.eventId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tabId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.productID;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.encodedParam;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.eventName;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        Integer num = this.status;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.activityCode);
        out.writeString(this.eventId);
        out.writeString(this.tabId);
        out.writeString(this.productID);
        out.writeString(this.encodedParam);
        out.writeString(this.eventName);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FlashSaleReminderButton(status=");
        LIZ.append(this.status);
        LIZ.append(", activityCode=");
        LIZ.append(this.activityCode);
        LIZ.append(", eventId=");
        LIZ.append(this.eventId);
        LIZ.append(", tabId=");
        LIZ.append(this.tabId);
        LIZ.append(", productID=");
        LIZ.append(this.productID);
        LIZ.append(", encodedParam=");
        LIZ.append(this.encodedParam);
        LIZ.append(", eventName=");
        return q.LIZIZ(LIZ, this.eventName, ')', LIZ);
    }

    public FlashSaleReminderButton(Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
        this.status = num;
        this.activityCode = str;
        this.eventId = str2;
        this.tabId = str3;
        this.productID = str4;
        this.encodedParam = str5;
        this.eventName = str6;
    }
}
