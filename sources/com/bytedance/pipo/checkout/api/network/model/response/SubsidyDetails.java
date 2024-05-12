package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class SubsidyDetails {

    @InterfaceC65349Pkn("subsidy_account")
    public String subsidyAccount;

    @InterfaceC65349Pkn("subsidy_amount")
    public String subsidyAmount;

    @InterfaceC65349Pkn("subsidy_currency")
    public String subsidyCurrency;

    /* JADX WARN: Multi-variable type inference failed */
    public SubsidyDetails() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SubsidyDetails copy$default(SubsidyDetails subsidyDetails, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subsidyDetails.subsidyAmount;
        }
        if ((i & 2) != 0) {
            str2 = subsidyDetails.subsidyCurrency;
        }
        if ((i & 4) != 0) {
            str3 = subsidyDetails.subsidyAccount;
        }
        return subsidyDetails.copy(str, str2, str3);
    }

    public final SubsidyDetails copy(String str, String str2, String str3) {
        return new SubsidyDetails(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubsidyDetails)) {
            return false;
        }
        SubsidyDetails subsidyDetails = (SubsidyDetails) obj;
        return o.LJ(this.subsidyAmount, subsidyDetails.subsidyAmount) && o.LJ(this.subsidyCurrency, subsidyDetails.subsidyCurrency) && o.LJ(this.subsidyAccount, subsidyDetails.subsidyAccount);
    }

    public int hashCode() {
        String str = this.subsidyAmount;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subsidyCurrency;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subsidyAccount;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SubsidyDetails(subsidyAmount=");
        LIZ.append((Object) this.subsidyAmount);
        LIZ.append(", subsidyCurrency=");
        LIZ.append((Object) this.subsidyCurrency);
        LIZ.append(", subsidyAccount=");
        LIZ.append((Object) this.subsidyAccount);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getSubsidyAccount() {
        return this.subsidyAccount;
    }

    public final String getSubsidyAmount() {
        return this.subsidyAmount;
    }

    public final String getSubsidyCurrency() {
        return this.subsidyCurrency;
    }

    public final void setSubsidyAccount(String str) {
        this.subsidyAccount = str;
    }

    public final void setSubsidyAmount(String str) {
        this.subsidyAmount = str;
    }

    public final void setSubsidyCurrency(String str) {
        this.subsidyCurrency = str;
    }

    public SubsidyDetails(String str, String str2, String str3) {
        this.subsidyAmount = str;
        this.subsidyCurrency = str2;
        this.subsidyAccount = str3;
    }

    public /* synthetic */ SubsidyDetails(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
