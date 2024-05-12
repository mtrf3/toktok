package com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.model;

import X.C91789a0H;
import X.InterfaceC87283bg;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class RepaymentArg implements IRouteArg, InterfaceC87283bg {
    public final String amountDue;
    public final String currency;
    public final long dueTimestamp;
    public final boolean inProgress;
    public final String inProgressMsg;
    public final String inProgressScheme;
    public final boolean isOverdue;
    public final String minAmount;
    public final String previousPageId;
    public final String suggestAmount;
    public final String totalDue;
    public static final Parcelable.Creator<RepaymentArg> CREATOR = new C91789a0H();
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RepaymentArg() {
        /*
            r15 = this;
            r1 = 0
            r4 = 0
            r8 = 0
            r13 = 2047(0x7ff, float:2.868E-42)
            r0 = r15
            r2 = r1
            r3 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r10 = r4
            r11 = r1
            r12 = r1
            r14 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.model.RepaymentArg.<init>():void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RepaymentArg(java.lang.String r16) {
        /*
            r15 = this;
            java.lang.String r0 = "previousPageId"
            r1 = r16
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r2 = 0
            r4 = 0
            r8 = 0
            r13 = 2046(0x7fe, float:2.867E-42)
            r0 = r15
            r3 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            r10 = r4
            r11 = r2
            r12 = r2
            r14 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.model.RepaymentArg.<init>(java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RepaymentArg(java.lang.String r16, java.lang.String r17) {
        /*
            r15 = this;
            java.lang.String r0 = "previousPageId"
            r1 = r16
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            java.lang.String r0 = "amountDue"
            r2 = r17
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            r3 = 0
            r4 = 0
            r8 = 0
            r13 = 2044(0x7fc, float:2.864E-42)
            r0 = r15
            r5 = r3
            r6 = r3
            r7 = r3
            r10 = r4
            r11 = r3
            r12 = r3
            r14 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.model.RepaymentArg.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RepaymentArg(java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
            r15 = this;
            java.lang.String r0 = "previousPageId"
            r1 = r16
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            java.lang.String r0 = "amountDue"
            r2 = r17
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            java.lang.String r0 = "totalDue"
            r3 = r18
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            r4 = 0
            r5 = 0
            r8 = 0
            r13 = 2040(0x7f8, float:2.859E-42)
            r0 = r15
            r6 = r5
            r7 = r5
            r10 = r4
            r11 = r5
            r12 = r5
            r14 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.model.RepaymentArg.<init>(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepaymentArg(String previousPageId, String amountDue, String totalDue, boolean z) {
        this(previousPageId, amountDue, totalDue, z, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 2032, 0 == true ? 1 : 0);
        o.LJIIIZ(previousPageId, "previousPageId");
        o.LJIIIZ(amountDue, "amountDue");
        o.LJIIIZ(totalDue, "totalDue");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepaymentArg(String previousPageId, String amountDue, String totalDue, boolean z, String suggestAmount) {
        this(previousPageId, amountDue, totalDue, z, suggestAmount, null, 0 == true ? 1 : 0, 0L, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 2016, 0 == true ? 1 : 0);
        o.LJIIIZ(previousPageId, "previousPageId");
        o.LJIIIZ(amountDue, "amountDue");
        o.LJIIIZ(totalDue, "totalDue");
        o.LJIIIZ(suggestAmount, "suggestAmount");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepaymentArg(String previousPageId, String amountDue, String totalDue, boolean z, String suggestAmount, String minAmount) {
        this(previousPageId, amountDue, totalDue, z, suggestAmount, minAmount, null, 0L, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1984, 0 == true ? 1 : 0);
        o.LJIIIZ(previousPageId, "previousPageId");
        o.LJIIIZ(amountDue, "amountDue");
        o.LJIIIZ(totalDue, "totalDue");
        o.LJIIIZ(suggestAmount, "suggestAmount");
        o.LJIIIZ(minAmount, "minAmount");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepaymentArg(String previousPageId, String amountDue, String totalDue, boolean z, String suggestAmount, String minAmount, String currency) {
        this(previousPageId, amountDue, totalDue, z, suggestAmount, minAmount, currency, 0L, false, null, 0 == true ? 1 : 0, 1920, 0 == true ? 1 : 0);
        o.LJIIIZ(previousPageId, "previousPageId");
        o.LJIIIZ(amountDue, "amountDue");
        o.LJIIIZ(totalDue, "totalDue");
        o.LJIIIZ(suggestAmount, "suggestAmount");
        o.LJIIIZ(minAmount, "minAmount");
        o.LJIIIZ(currency, "currency");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepaymentArg(String previousPageId, String amountDue, String totalDue, boolean z, String suggestAmount, String minAmount, String currency, long j) {
        this(previousPageId, amountDue, totalDue, z, suggestAmount, minAmount, currency, j, false, null, 0 == true ? 1 : 0, 1792, 0 == true ? 1 : 0);
        o.LJIIIZ(previousPageId, "previousPageId");
        o.LJIIIZ(amountDue, "amountDue");
        o.LJIIIZ(totalDue, "totalDue");
        o.LJIIIZ(suggestAmount, "suggestAmount");
        o.LJIIIZ(minAmount, "minAmount");
        o.LJIIIZ(currency, "currency");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepaymentArg(String previousPageId, String amountDue, String totalDue, boolean z, String suggestAmount, String minAmount, String currency, long j, boolean z2) {
        this(previousPageId, amountDue, totalDue, z, suggestAmount, minAmount, currency, j, z2, null, 0 == true ? 1 : 0, 1536, 0 == true ? 1 : 0);
        o.LJIIIZ(previousPageId, "previousPageId");
        o.LJIIIZ(amountDue, "amountDue");
        o.LJIIIZ(totalDue, "totalDue");
        o.LJIIIZ(suggestAmount, "suggestAmount");
        o.LJIIIZ(minAmount, "minAmount");
        o.LJIIIZ(currency, "currency");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepaymentArg(String previousPageId, String amountDue, String totalDue, boolean z, String suggestAmount, String minAmount, String currency, long j, boolean z2, String inProgressMsg) {
        this(previousPageId, amountDue, totalDue, z, suggestAmount, minAmount, currency, j, z2, inProgressMsg, null, 1024, 0 == true ? 1 : 0);
        o.LJIIIZ(previousPageId, "previousPageId");
        o.LJIIIZ(amountDue, "amountDue");
        o.LJIIIZ(totalDue, "totalDue");
        o.LJIIIZ(suggestAmount, "suggestAmount");
        o.LJIIIZ(minAmount, "minAmount");
        o.LJIIIZ(currency, "currency");
        o.LJIIIZ(inProgressMsg, "inProgressMsg");
    }

    public static RepaymentArg __fromBundle(Bundle bundle) {
        int i;
        String str;
        String str2;
        String str3;
        Boolean bool;
        String str4;
        String str5;
        String str6;
        Long l;
        Boolean bool2;
        String str7;
        String str8 = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("previous_page_id")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("previous_page_id"), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("amountDue")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("amountDue"), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        if (bundle.containsKey("totalDue")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("totalDue"), String.class);
        } else {
            i += 4;
            str3 = null;
        }
        if (bundle.containsKey("isOverdue")) {
            bool = (Boolean) RouteParser.INSTANCE.parse(bundle.get("isOverdue"), Boolean.class);
            if (bool == null) {
                i += 8;
            }
        } else {
            i += 8;
            bool = null;
        }
        if (bundle.containsKey("suggestAmount")) {
            str4 = (String) RouteParser.INSTANCE.parse(bundle.get("suggestAmount"), String.class);
        } else {
            i += 16;
            str4 = null;
        }
        if (bundle.containsKey("minAmount")) {
            str5 = (String) RouteParser.INSTANCE.parse(bundle.get("minAmount"), String.class);
        } else {
            i += 32;
            str5 = null;
        }
        if (bundle.containsKey("currency")) {
            str6 = (String) RouteParser.INSTANCE.parse(bundle.get("currency"), String.class);
        } else {
            i += 64;
            str6 = null;
        }
        if (bundle.containsKey("dueTimestamp")) {
            l = (Long) RouteParser.INSTANCE.parse(bundle.get("dueTimestamp"), Long.class);
            if (l == null) {
                i += 128;
            }
        } else {
            i += 128;
            l = null;
        }
        if (bundle.containsKey("inProgress")) {
            bool2 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("inProgress"), Boolean.class);
            if (bool2 == null) {
                i += 256;
            }
        } else {
            i += 256;
            bool2 = null;
        }
        if (bundle.containsKey("inProgressMsg")) {
            str7 = (String) RouteParser.INSTANCE.parse(bundle.get("inProgressMsg"), String.class);
        } else {
            i += 512;
            str7 = null;
        }
        if (bundle.containsKey("jumpScheme")) {
            str8 = (String) RouteParser.INSTANCE.parse(bundle.get("jumpScheme"), String.class);
        } else {
            i += 1024;
        }
        return new RepaymentArg(str, str2, str3, bool != null ? bool.booleanValue() : false, str4, str5, str6, l != null ? l.longValue() : 0L, bool2 != null ? bool2.booleanValue() : false, str7, str8, i, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.previousPageId);
        out.writeString(this.amountDue);
        out.writeString(this.totalDue);
        out.writeInt(this.isOverdue ? 1 : 0);
        out.writeString(this.suggestAmount);
        out.writeString(this.minAmount);
        out.writeString(this.currency);
        out.writeLong(this.dueTimestamp);
        out.writeInt(this.inProgress ? 1 : 0);
        out.writeString(this.inProgressMsg);
        out.writeString(this.inProgressScheme);
    }

    public final String getAmountDue() {
        return this.amountDue;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final long getDueTimestamp() {
        return this.dueTimestamp;
    }

    public final boolean getInProgress() {
        return this.inProgress;
    }

    public final String getInProgressMsg() {
        return this.inProgressMsg;
    }

    public final String getInProgressScheme() {
        return this.inProgressScheme;
    }

    public final String getMinAmount() {
        return this.minAmount;
    }

    public final String getPreviousPageId() {
        return this.previousPageId;
    }

    public final String getSuggestAmount() {
        return this.suggestAmount;
    }

    public final String getTotalDue() {
        return this.totalDue;
    }

    public final boolean isOverdue() {
        return this.isOverdue;
    }

    public RepaymentArg(String previousPageId, String amountDue, String totalDue, boolean z, String suggestAmount, String minAmount, String currency, long j, boolean z2, String inProgressMsg, String inProgressScheme) {
        o.LJIIIZ(previousPageId, "previousPageId");
        o.LJIIIZ(amountDue, "amountDue");
        o.LJIIIZ(totalDue, "totalDue");
        o.LJIIIZ(suggestAmount, "suggestAmount");
        o.LJIIIZ(minAmount, "minAmount");
        o.LJIIIZ(currency, "currency");
        o.LJIIIZ(inProgressMsg, "inProgressMsg");
        o.LJIIIZ(inProgressScheme, "inProgressScheme");
        this.previousPageId = previousPageId;
        this.amountDue = amountDue;
        this.totalDue = totalDue;
        this.isOverdue = z;
        this.suggestAmount = suggestAmount;
        this.minAmount = minAmount;
        this.currency = currency;
        this.dueTimestamp = j;
        this.inProgress = z2;
        this.inProgressMsg = inProgressMsg;
        this.inProgressScheme = inProgressScheme;
    }

    public /* synthetic */ RepaymentArg(String str, String str2, String str3, boolean z, String str4, String str5, String str6, long j, boolean z2, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? 0L : j, (i & 256) == 0 ? z2 : false, (i & 512) != 0 ? "" : str7, (i & 1024) == 0 ? str8 : "");
    }
}
