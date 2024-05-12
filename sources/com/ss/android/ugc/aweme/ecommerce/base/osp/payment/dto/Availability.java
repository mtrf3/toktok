package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class Availability {

    @InterfaceC65349Pkn("is_available")
    public Boolean isAvailable;

    @InterfaceC65349Pkn("status_code")
    public final String statusCode;

    @InterfaceC65349Pkn("unavailable_code")
    public final String unavailableCode;

    @InterfaceC65349Pkn("unavailable_popup_title")
    public final String unavailablePopupTitle;

    @InterfaceC65349Pkn("unavailable_reason")
    public final String unavailableReason;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Availability)) {
            return false;
        }
        Availability availability = (Availability) obj;
        return o.LJ(this.isAvailable, availability.isAvailable) && o.LJ(this.unavailableCode, availability.unavailableCode) && o.LJ(this.unavailableReason, availability.unavailableReason) && o.LJ(this.unavailablePopupTitle, availability.unavailablePopupTitle) && o.LJ(this.statusCode, availability.statusCode);
    }

    public final int hashCode() {
        Boolean bool = this.isAvailable;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.unavailableCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.unavailableReason;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.unavailablePopupTitle;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.statusCode;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Availability(isAvailable=");
        LIZ.append(this.isAvailable);
        LIZ.append(", unavailableCode=");
        LIZ.append(this.unavailableCode);
        LIZ.append(", unavailableReason=");
        LIZ.append(this.unavailableReason);
        LIZ.append(", unavailablePopupTitle=");
        LIZ.append(this.unavailablePopupTitle);
        LIZ.append(", statusCode=");
        return q.LIZIZ(LIZ, this.statusCode, ')', LIZ);
    }

    public static Availability LIZ(Availability availability, Boolean bool) {
        return new Availability(bool, availability.unavailableCode, availability.unavailableReason, availability.unavailablePopupTitle, availability.statusCode);
    }

    public Availability(Boolean bool, String str, String str2, String str3, String str4) {
        this.isAvailable = bool;
        this.unavailableCode = str;
        this.unavailableReason = str2;
        this.unavailablePopupTitle = str3;
        this.statusCode = str4;
    }

    public /* synthetic */ Availability(Boolean bool, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, str, str2, str3, str4);
    }
}
