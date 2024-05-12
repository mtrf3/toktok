package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C69668RVw;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class DeductibleVoucherReminder implements Parcelable {
    public static final Parcelable.Creator<DeductibleVoucherReminder> CREATOR = new C69668RVw();

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("spu_deduction_text")
    public final String spuDeductionText;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public DeductibleVoucherReminder() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeductibleVoucherReminder)) {
            return false;
        }
        DeductibleVoucherReminder deductibleVoucherReminder = (DeductibleVoucherReminder) obj;
        return o.LJ(this.title, deductibleVoucherReminder.title) && o.LJ(this.spuDeductionText, deductibleVoucherReminder.spuDeductionText) && o.LJ(this.schema, deductibleVoucherReminder.schema);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.spuDeductionText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.schema;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.title);
        out.writeString(this.spuDeductionText);
        out.writeString(this.schema);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DeductibleVoucherReminder(title=");
        LIZ.append(this.title);
        LIZ.append(", spuDeductionText=");
        LIZ.append(this.spuDeductionText);
        LIZ.append(", schema=");
        return q.LIZIZ(LIZ, this.schema, ')', LIZ);
    }

    public DeductibleVoucherReminder(String str, String str2, String str3) {
        this.title = str;
        this.spuDeductionText = str2;
        this.schema = str3;
    }

    public /* synthetic */ DeductibleVoucherReminder(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
