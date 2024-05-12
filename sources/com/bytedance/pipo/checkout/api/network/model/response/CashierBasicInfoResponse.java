package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.InterfaceC92088a56;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class CashierBasicInfoResponse implements InterfaceC92088a56 {

    @InterfaceC65349Pkn("bank_card_rules")
    public List<BankCardRules> bankCardRules;

    @InterfaceC65349Pkn("error_code")
    public String errorCode;

    @InterfaceC65349Pkn("error_message")
    public String errorMessage;

    @InterfaceC65349Pkn("method_extra")
    public MethodExtra methodExtra;

    @InterfaceC65349Pkn("methods")
    public List<Methods> methods;

    @InterfaceC65349Pkn("result_code")
    public String resultCode;

    @InterfaceC65349Pkn("stored_methods")
    public List<StoredMethods> storedMethods;

    @InterfaceC65349Pkn("unavailable_methods")
    public List<Methods> unavailableMethods;

    @InterfaceC65349Pkn("unavailable_stored_methods")
    public List<StoredMethods> unavailableStoredMethods;

    /* JADX WARN: Multi-variable type inference failed */
    public CashierBasicInfoResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CashierBasicInfoResponse copy$default(CashierBasicInfoResponse cashierBasicInfoResponse, String str, String str2, String str3, List list, List list2, List list3, MethodExtra methodExtra, List list4, List list5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cashierBasicInfoResponse.getResultCode();
        }
        if ((i & 2) != 0) {
            str2 = cashierBasicInfoResponse.getErrorCode();
        }
        if ((i & 4) != 0) {
            str3 = cashierBasicInfoResponse.getErrorMessage();
        }
        if ((i & 8) != 0) {
            list = cashierBasicInfoResponse.methods;
        }
        if ((i & 16) != 0) {
            list2 = cashierBasicInfoResponse.storedMethods;
        }
        if ((i & 32) != 0) {
            list3 = cashierBasicInfoResponse.bankCardRules;
        }
        if ((i & 64) != 0) {
            methodExtra = cashierBasicInfoResponse.methodExtra;
        }
        if ((i & 128) != 0) {
            list4 = cashierBasicInfoResponse.unavailableMethods;
        }
        if ((i & 256) != 0) {
            list5 = cashierBasicInfoResponse.unavailableStoredMethods;
        }
        return cashierBasicInfoResponse.copy(str, str2, str3, list, list2, list3, methodExtra, list4, list5);
    }

    public final String component1() {
        return getResultCode();
    }

    public final String component2() {
        return getErrorCode();
    }

    public final String component3() {
        return getErrorMessage();
    }

    public final CashierBasicInfoResponse copy(String str, String str2, String str3, List<Methods> list, List<StoredMethods> list2, List<BankCardRules> list3, MethodExtra methodExtra, List<Methods> list4, List<StoredMethods> list5) {
        return new CashierBasicInfoResponse(str, str2, str3, list, list2, list3, methodExtra, list4, list5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashierBasicInfoResponse)) {
            return false;
        }
        CashierBasicInfoResponse cashierBasicInfoResponse = (CashierBasicInfoResponse) obj;
        return o.LJ(getResultCode(), cashierBasicInfoResponse.getResultCode()) && o.LJ(getErrorCode(), cashierBasicInfoResponse.getErrorCode()) && o.LJ(getErrorMessage(), cashierBasicInfoResponse.getErrorMessage()) && o.LJ(this.methods, cashierBasicInfoResponse.methods) && o.LJ(this.storedMethods, cashierBasicInfoResponse.storedMethods) && o.LJ(this.bankCardRules, cashierBasicInfoResponse.bankCardRules) && o.LJ(this.methodExtra, cashierBasicInfoResponse.methodExtra) && o.LJ(this.unavailableMethods, cashierBasicInfoResponse.unavailableMethods) && o.LJ(this.unavailableStoredMethods, cashierBasicInfoResponse.unavailableStoredMethods);
    }

    public int hashCode() {
        int hashCode = (((((getResultCode() == null ? 0 : getResultCode().hashCode()) * 31) + (getErrorCode() == null ? 0 : getErrorCode().hashCode())) * 31) + (getErrorMessage() == null ? 0 : getErrorMessage().hashCode())) * 31;
        List<Methods> list = this.methods;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<StoredMethods> list2 = this.storedMethods;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BankCardRules> list3 = this.bankCardRules;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        MethodExtra methodExtra = this.methodExtra;
        int hashCode5 = (hashCode4 + (methodExtra == null ? 0 : methodExtra.hashCode())) * 31;
        List<Methods> list4 = this.unavailableMethods;
        int hashCode6 = (hashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<StoredMethods> list5 = this.unavailableStoredMethods;
        return hashCode6 + (list5 != null ? list5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CashierBasicInfoResponse(resultCode=");
        LIZ.append((Object) getResultCode());
        LIZ.append(", errorCode=");
        LIZ.append((Object) getErrorCode());
        LIZ.append(", errorMessage=");
        LIZ.append((Object) getErrorMessage());
        LIZ.append(", methods=");
        LIZ.append(this.methods);
        LIZ.append(", storedMethods=");
        LIZ.append(this.storedMethods);
        LIZ.append(", bankCardRules=");
        LIZ.append(this.bankCardRules);
        LIZ.append(", methodExtra=");
        LIZ.append(this.methodExtra);
        LIZ.append(", unavailableMethods=");
        LIZ.append(this.unavailableMethods);
        LIZ.append(", unavailableStoredMethods=");
        LIZ.append(this.unavailableStoredMethods);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final List<BankCardRules> getBankCardRules() {
        return this.bankCardRules;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public final MethodExtra getMethodExtra() {
        return this.methodExtra;
    }

    public final List<Methods> getMethods() {
        return this.methods;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public final List<StoredMethods> getStoredMethods() {
        return this.storedMethods;
    }

    public final List<Methods> getUnavailableMethods() {
        return this.unavailableMethods;
    }

    public final List<StoredMethods> getUnavailableStoredMethods() {
        return this.unavailableStoredMethods;
    }

    public final void setBankCardRules(List<BankCardRules> list) {
        this.bankCardRules = list;
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setMethodExtra(MethodExtra methodExtra) {
        this.methodExtra = methodExtra;
    }

    public final void setMethods(List<Methods> list) {
        this.methods = list;
    }

    public void setResultCode(String str) {
        this.resultCode = str;
    }

    public final void setStoredMethods(List<StoredMethods> list) {
        this.storedMethods = list;
    }

    public final void setUnavailableMethods(List<Methods> list) {
        this.unavailableMethods = list;
    }

    public final void setUnavailableStoredMethods(List<StoredMethods> list) {
        this.unavailableStoredMethods = list;
    }

    public CashierBasicInfoResponse(String str, String str2, String str3, List<Methods> list, List<StoredMethods> list2, List<BankCardRules> list3, MethodExtra methodExtra, List<Methods> list4, List<StoredMethods> list5) {
        this.resultCode = str;
        this.errorCode = str2;
        this.errorMessage = str3;
        this.methods = list;
        this.storedMethods = list2;
        this.bankCardRules = list3;
        this.methodExtra = methodExtra;
        this.unavailableMethods = list4;
        this.unavailableStoredMethods = list5;
    }

    public /* synthetic */ CashierBasicInfoResponse(String str, String str2, String str3, List list, List list2, List list3, MethodExtra methodExtra, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : list3, (i & 64) != 0 ? null : methodExtra, (i & 128) != 0 ? null : list4, (i & 256) == 0 ? list5 : null);
    }
}
