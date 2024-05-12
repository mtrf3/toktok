package com.ss.android.ugc.aweme.bnpl.biz.bill.model;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class BillRepaymentPrepareInfo {

    @InterfaceC65349Pkn("can_repay")
    public final boolean canRepay;

    @InterfaceC65349Pkn("currency")
    public final String currency;

    @InterfaceC65349Pkn("due_amount")
    public final String dueAmount;

    @InterfaceC65349Pkn("due_date")
    public final long dueDate;

    @InterfaceC65349Pkn("in_progress")
    public final boolean inProgress;

    @InterfaceC65349Pkn("in_progress_msg")
    public final String inProgressMsg;

    @InterfaceC65349Pkn("in_progress_schema")
    public final String inProgressSchema;

    @InterfaceC65349Pkn("min_amount")
    public final String minAmount;

    @InterfaceC65349Pkn("suggest_amount")
    public final String suggestAmount;

    @InterfaceC65349Pkn("total_due_amount")
    public final String totalDueAmount;

    @InterfaceC65349Pkn("user_status")
    public final String userStatus;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillRepaymentPrepareInfo)) {
            return false;
        }
        BillRepaymentPrepareInfo billRepaymentPrepareInfo = (BillRepaymentPrepareInfo) obj;
        return this.canRepay == billRepaymentPrepareInfo.canRepay && o.LJ(this.userStatus, billRepaymentPrepareInfo.userStatus) && this.inProgress == billRepaymentPrepareInfo.inProgress && o.LJ(this.dueAmount, billRepaymentPrepareInfo.dueAmount) && this.dueDate == billRepaymentPrepareInfo.dueDate && o.LJ(this.totalDueAmount, billRepaymentPrepareInfo.totalDueAmount) && o.LJ(this.suggestAmount, billRepaymentPrepareInfo.suggestAmount) && o.LJ(this.minAmount, billRepaymentPrepareInfo.minAmount) && o.LJ(this.inProgressMsg, billRepaymentPrepareInfo.inProgressMsg) && o.LJ(this.inProgressSchema, billRepaymentPrepareInfo.inProgressSchema) && o.LJ(this.currency, billRepaymentPrepareInfo.currency);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    public final int hashCode() {
        boolean z = this.canRepay;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = ((((((((r0 * 31) + this.userStatus.hashCode()) * 31) + (this.inProgress ? 1 : 0)) * 31) + this.dueAmount.hashCode()) * 31) + C16880lQ.LLJIJIL(this.dueDate)) * 31;
        String str = this.totalDueAmount;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.suggestAmount;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.minAmount;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.inProgressMsg;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.inProgressSchema;
        return ((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.currency.hashCode();
    }

    public final String toString() {
        return "BillRepaymentPrepareInfo(canRepay=" + this.canRepay + ", userStatus=" + this.userStatus + ", inProgress=" + this.inProgress + ", dueAmount=" + this.dueAmount + ", dueDate=" + this.dueDate + ", totalDueAmount=" + this.totalDueAmount + ", suggestAmount=" + this.suggestAmount + ", minAmount=" + this.minAmount + ", inProgressMsg=" + this.inProgressMsg + ", inProgressSchema=" + this.inProgressSchema + ", currency=" + this.currency + ')';
    }

    public BillRepaymentPrepareInfo(boolean z, String userStatus, boolean z2, String dueAmount, long j, String str, String str2, String str3, String str4, String str5, String currency) {
        o.LJIIIZ(userStatus, "userStatus");
        o.LJIIIZ(dueAmount, "dueAmount");
        o.LJIIIZ(currency, "currency");
        this.canRepay = z;
        this.userStatus = userStatus;
        this.inProgress = z2;
        this.dueAmount = dueAmount;
        this.dueDate = j;
        this.totalDueAmount = str;
        this.suggestAmount = str2;
        this.minAmount = str3;
        this.inProgressMsg = str4;
        this.inProgressSchema = str5;
        this.currency = currency;
    }

    public /* synthetic */ BillRepaymentPrepareInfo(boolean z, String str, boolean z2, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, z2, str2, j, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) == 0 ? str7 : null, str8);
    }
}
