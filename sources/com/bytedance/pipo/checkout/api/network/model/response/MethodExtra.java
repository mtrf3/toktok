package com.bytedance.pipo.checkout.api.network.model.response;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class MethodExtra {

    @InterfaceC65349Pkn("cashier_config")
    public CashierConfig cashierConfig;

    @InterfaceC65349Pkn("privacy_agreement_list")
    public List<PrivacyAgreementList> privacyAgreementList;

    public MethodExtra() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MethodExtra copy$default(MethodExtra methodExtra, List list, CashierConfig cashierConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            list = methodExtra.privacyAgreementList;
        }
        if ((i & 2) != 0) {
            cashierConfig = methodExtra.cashierConfig;
        }
        return methodExtra.copy(list, cashierConfig);
    }

    public final MethodExtra copy(List<PrivacyAgreementList> privacyAgreementList, CashierConfig cashierConfig) {
        o.LJIIIZ(privacyAgreementList, "privacyAgreementList");
        return new MethodExtra(privacyAgreementList, cashierConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MethodExtra)) {
            return false;
        }
        MethodExtra methodExtra = (MethodExtra) obj;
        return o.LJ(this.privacyAgreementList, methodExtra.privacyAgreementList) && o.LJ(this.cashierConfig, methodExtra.cashierConfig);
    }

    public int hashCode() {
        int hashCode = this.privacyAgreementList.hashCode() * 31;
        CashierConfig cashierConfig = this.cashierConfig;
        return hashCode + (cashierConfig == null ? 0 : cashierConfig.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MethodExtra(privacyAgreementList=");
        LIZ.append(this.privacyAgreementList);
        LIZ.append(", cashierConfig=");
        LIZ.append(this.cashierConfig);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final CashierConfig getCashierConfig() {
        return this.cashierConfig;
    }

    public final List<PrivacyAgreementList> getPrivacyAgreementList() {
        return this.privacyAgreementList;
    }

    public final void setCashierConfig(CashierConfig cashierConfig) {
        this.cashierConfig = cashierConfig;
    }

    public final void setPrivacyAgreementList(List<PrivacyAgreementList> list) {
        o.LJIIIZ(list, "<set-?>");
        this.privacyAgreementList = list;
    }

    public MethodExtra(List<PrivacyAgreementList> privacyAgreementList, CashierConfig cashierConfig) {
        o.LJIIIZ(privacyAgreementList, "privacyAgreementList");
        this.privacyAgreementList = privacyAgreementList;
        this.cashierConfig = cashierConfig;
    }

    public MethodExtra(List list, CashierConfig cashierConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? null : cashierConfig);
    }
}
