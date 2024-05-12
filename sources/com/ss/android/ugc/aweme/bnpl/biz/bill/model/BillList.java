package com.ss.android.ugc.aweme.bnpl.biz.bill.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class BillList {

    @InterfaceC65349Pkn("current_bill_list")
    public final List<BillInfo> currentBillList;

    @InterfaceC65349Pkn("paid_tab_bill_list")
    public final List<BillInfo> paidBillList;

    @InterfaceC65349Pkn("upcoming_bill_list")
    public final List<BillInfo> upcomingBillList;

    /* JADX WARN: Multi-variable type inference failed */
    public BillList() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillList)) {
            return false;
        }
        BillList billList = (BillList) obj;
        return o.LJ(this.currentBillList, billList.currentBillList) && o.LJ(this.upcomingBillList, billList.upcomingBillList) && o.LJ(this.paidBillList, billList.paidBillList);
    }

    public final int hashCode() {
        List<BillInfo> list = this.currentBillList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<BillInfo> list2 = this.upcomingBillList;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BillInfo> list3 = this.paidBillList;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BillList(currentBillList=");
        LIZ.append(this.currentBillList);
        LIZ.append(", upcomingBillList=");
        LIZ.append(this.upcomingBillList);
        LIZ.append(", paidBillList=");
        LIZ.append(this.paidBillList);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public BillList(List<BillInfo> list, List<BillInfo> list2, List<BillInfo> list3) {
        this.currentBillList = list;
        this.upcomingBillList = list2;
        this.paidBillList = list3;
    }

    public /* synthetic */ BillList(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3);
    }
}
