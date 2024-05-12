package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C279017q;
import X.InterfaceC65349Pkn;
import X.RVH;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class InstallmentInfo implements Parcelable {
    public static final Parcelable.Creator<InstallmentInfo> CREATOR = new RVH();

    @InterfaceC65349Pkn("available_credit")
    public final String availableCredit;

    @InterfaceC65349Pkn("disclaimer")
    public final String disclaimer;

    @InterfaceC65349Pkn("display_name")
    public final String displayName;

    @InterfaceC65349Pkn("installment_plans")
    public final List<InstallmentPlan> installmentPlans;

    @InterfaceC65349Pkn("order_amount")
    public final Amount orderAmount;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallmentInfo)) {
            return false;
        }
        InstallmentInfo installmentInfo = (InstallmentInfo) obj;
        return o.LJ(this.availableCredit, installmentInfo.availableCredit) && o.LJ(this.disclaimer, installmentInfo.disclaimer) && o.LJ(this.installmentPlans, installmentInfo.installmentPlans) && o.LJ(this.orderAmount, installmentInfo.orderAmount) && o.LJ(this.displayName, installmentInfo.displayName);
    }

    public final int hashCode() {
        String str = this.availableCredit;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.disclaimer;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<InstallmentPlan> list = this.installmentPlans;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Amount amount = this.orderAmount;
        int hashCode4 = (hashCode3 + (amount == null ? 0 : amount.hashCode())) * 31;
        String str3 = this.displayName;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InstallmentInfo(availableCredit=");
        LIZ.append(this.availableCredit);
        LIZ.append(", disclaimer=");
        LIZ.append(this.disclaimer);
        LIZ.append(", installmentPlans=");
        LIZ.append(this.installmentPlans);
        LIZ.append(", orderAmount=");
        LIZ.append(this.orderAmount);
        LIZ.append(", displayName=");
        return q.LIZIZ(LIZ, this.displayName, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.availableCredit);
        out.writeString(this.disclaimer);
        List<InstallmentPlan> list = this.installmentPlans;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((InstallmentPlan) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        Amount amount = this.orderAmount;
        if (amount == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            amount.writeToParcel(out, i);
        }
        out.writeString(this.displayName);
    }

    public InstallmentInfo(String str, String str2, List<InstallmentPlan> list, Amount amount, String str3) {
        this.availableCredit = str;
        this.disclaimer = str2;
        this.installmentPlans = list;
        this.orderAmount = amount;
        this.displayName = str3;
    }
}
