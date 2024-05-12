package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.InterfaceC65349Pkn;
import X.RVI;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class InstallmentPlan implements Parcelable {
    public static final Parcelable.Creator<InstallmentPlan> CREATOR = new RVI();

    @InterfaceC65349Pkn("extra_description")
    public final String extraDescription;

    @InterfaceC65349Pkn("installment_plan_id")
    public final String id;

    @InterfaceC65349Pkn("monthly_repayment")
    public final Amount monthlyRepayment;

    @InterfaceC65349Pkn("plan_description")
    public final String planDescription;

    @InterfaceC65349Pkn("promo_text")
    public final String promoText;

    @InterfaceC65349Pkn("tenure")
    public final String tenure;

    @InterfaceC65349Pkn("total_fee")
    public final Amount totalFee;

    @InterfaceC65349Pkn("total_fee_text")
    public final String totalFeeText;

    @InterfaceC65349Pkn("total_repayment")
    public final Amount totalRepayment;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallmentPlan)) {
            return false;
        }
        InstallmentPlan installmentPlan = (InstallmentPlan) obj;
        return o.LJ(this.tenure, installmentPlan.tenure) && o.LJ(this.id, installmentPlan.id) && o.LJ(this.totalFee, installmentPlan.totalFee) && o.LJ(this.monthlyRepayment, installmentPlan.monthlyRepayment) && o.LJ(this.extraDescription, installmentPlan.extraDescription) && o.LJ(this.promoText, installmentPlan.promoText) && o.LJ(this.planDescription, installmentPlan.planDescription) && o.LJ(this.totalFeeText, installmentPlan.totalFeeText) && o.LJ(this.totalRepayment, installmentPlan.totalRepayment);
    }

    public final int hashCode() {
        String str = this.tenure;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Amount amount = this.totalFee;
        int hashCode3 = (hashCode2 + (amount == null ? 0 : amount.hashCode())) * 31;
        Amount amount2 = this.monthlyRepayment;
        int hashCode4 = (hashCode3 + (amount2 == null ? 0 : amount2.hashCode())) * 31;
        String str3 = this.extraDescription;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.promoText;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.planDescription;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.totalFeeText;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Amount amount3 = this.totalRepayment;
        return hashCode8 + (amount3 != null ? amount3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InstallmentPlan(tenure=");
        LIZ.append(this.tenure);
        LIZ.append(", id=");
        LIZ.append(this.id);
        LIZ.append(", totalFee=");
        LIZ.append(this.totalFee);
        LIZ.append(", monthlyRepayment=");
        LIZ.append(this.monthlyRepayment);
        LIZ.append(", extraDescription=");
        LIZ.append(this.extraDescription);
        LIZ.append(", promoText=");
        LIZ.append(this.promoText);
        LIZ.append(", planDescription=");
        LIZ.append(this.planDescription);
        LIZ.append(", totalFeeText=");
        LIZ.append(this.totalFeeText);
        LIZ.append(", totalRepayment=");
        LIZ.append(this.totalRepayment);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.tenure);
        out.writeString(this.id);
        Amount amount = this.totalFee;
        if (amount == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            amount.writeToParcel(out, i);
        }
        Amount amount2 = this.monthlyRepayment;
        if (amount2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            amount2.writeToParcel(out, i);
        }
        out.writeString(this.extraDescription);
        out.writeString(this.promoText);
        out.writeString(this.planDescription);
        out.writeString(this.totalFeeText);
        Amount amount3 = this.totalRepayment;
        if (amount3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            amount3.writeToParcel(out, i);
        }
    }

    public InstallmentPlan(String str, String str2, Amount amount, Amount amount2, String str3, String str4, String str5, String str6, Amount amount3) {
        this.tenure = str;
        this.id = str2;
        this.totalFee = amount;
        this.monthlyRepayment = amount2;
        this.extraDescription = str3;
        this.promoText = str4;
        this.planDescription = str5;
        this.totalFeeText = str6;
        this.totalRepayment = amount3;
    }
}
