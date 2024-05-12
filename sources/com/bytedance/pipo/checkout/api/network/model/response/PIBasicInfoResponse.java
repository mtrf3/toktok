package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.InterfaceC92088a56;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PIBasicInfoResponse implements InterfaceC92088a56 {

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

    @InterfaceC65349Pkn("render")
    public String render;

    @InterfaceC65349Pkn("result_code")
    public String resultCode;

    @InterfaceC65349Pkn("stored_methods")
    public List<StoredMethods> storedMethods;

    @InterfaceC65349Pkn("unavailable_stored_methods")
    public List<StoredMethods> unavailableStoredMethods;

    /* JADX WARN: Multi-variable type inference failed */
    public PIBasicInfoResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PIBasicInfoResponse copy$default(PIBasicInfoResponse pIBasicInfoResponse, String str, String str2, String str3, List list, List list2, List list3, List list4, MethodExtra methodExtra, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pIBasicInfoResponse.getResultCode();
        }
        if ((i & 2) != 0) {
            str2 = pIBasicInfoResponse.getErrorCode();
        }
        if ((i & 4) != 0) {
            str3 = pIBasicInfoResponse.getErrorMessage();
        }
        if ((i & 8) != 0) {
            list = pIBasicInfoResponse.methods;
        }
        if ((i & 16) != 0) {
            list2 = pIBasicInfoResponse.storedMethods;
        }
        if ((i & 32) != 0) {
            list3 = pIBasicInfoResponse.unavailableStoredMethods;
        }
        if ((i & 64) != 0) {
            list4 = pIBasicInfoResponse.bankCardRules;
        }
        if ((i & 128) != 0) {
            methodExtra = pIBasicInfoResponse.methodExtra;
        }
        if ((i & 256) != 0) {
            str4 = pIBasicInfoResponse.render;
        }
        return pIBasicInfoResponse.copy(str, str2, str3, list, list2, list3, list4, methodExtra, str4);
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

    public final PIBasicInfoResponse copy(String str, String str2, String str3, List<Methods> list, List<StoredMethods> list2, List<StoredMethods> list3, List<BankCardRules> list4, MethodExtra methodExtra, String str4) {
        return new PIBasicInfoResponse(str, str2, str3, list, list2, list3, list4, methodExtra, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PIBasicInfoResponse)) {
            return false;
        }
        PIBasicInfoResponse pIBasicInfoResponse = (PIBasicInfoResponse) obj;
        return o.LJ(getResultCode(), pIBasicInfoResponse.getResultCode()) && o.LJ(getErrorCode(), pIBasicInfoResponse.getErrorCode()) && o.LJ(getErrorMessage(), pIBasicInfoResponse.getErrorMessage()) && o.LJ(this.methods, pIBasicInfoResponse.methods) && o.LJ(this.storedMethods, pIBasicInfoResponse.storedMethods) && o.LJ(this.unavailableStoredMethods, pIBasicInfoResponse.unavailableStoredMethods) && o.LJ(this.bankCardRules, pIBasicInfoResponse.bankCardRules) && o.LJ(this.methodExtra, pIBasicInfoResponse.methodExtra) && o.LJ(this.render, pIBasicInfoResponse.render);
    }

    public int hashCode() {
        int hashCode = (((((getResultCode() == null ? 0 : getResultCode().hashCode()) * 31) + (getErrorCode() == null ? 0 : getErrorCode().hashCode())) * 31) + (getErrorMessage() == null ? 0 : getErrorMessage().hashCode())) * 31;
        List<Methods> list = this.methods;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<StoredMethods> list2 = this.storedMethods;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<StoredMethods> list3 = this.unavailableStoredMethods;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<BankCardRules> list4 = this.bankCardRules;
        int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        MethodExtra methodExtra = this.methodExtra;
        int hashCode6 = (hashCode5 + (methodExtra == null ? 0 : methodExtra.hashCode())) * 31;
        String str = this.render;
        return hashCode6 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PIBasicInfoResponse(resultCode=");
        LIZ.append((Object) getResultCode());
        LIZ.append(", errorCode=");
        LIZ.append((Object) getErrorCode());
        LIZ.append(", errorMessage=");
        LIZ.append((Object) getErrorMessage());
        LIZ.append(", methods=");
        LIZ.append(this.methods);
        LIZ.append(", storedMethods=");
        LIZ.append(this.storedMethods);
        LIZ.append(", unavailableStoredMethods=");
        LIZ.append(this.unavailableStoredMethods);
        LIZ.append(", bankCardRules=");
        LIZ.append(this.bankCardRules);
        LIZ.append(", methodExtra=");
        LIZ.append(this.methodExtra);
        LIZ.append(", render=");
        LIZ.append((Object) this.render);
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

    public final String getRender() {
        return this.render;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public final List<StoredMethods> getStoredMethods() {
        return this.storedMethods;
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

    public final void setRender(String str) {
        this.render = str;
    }

    public void setResultCode(String str) {
        this.resultCode = str;
    }

    public final void setStoredMethods(List<StoredMethods> list) {
        this.storedMethods = list;
    }

    public final void setUnavailableStoredMethods(List<StoredMethods> list) {
        this.unavailableStoredMethods = list;
    }

    public PIBasicInfoResponse(String str, String str2, String str3, List<Methods> list, List<StoredMethods> list2, List<StoredMethods> list3, List<BankCardRules> list4, MethodExtra methodExtra, String str4) {
        this.resultCode = str;
        this.errorCode = str2;
        this.errorMessage = str3;
        this.methods = list;
        this.storedMethods = list2;
        this.unavailableStoredMethods = list3;
        this.bankCardRules = list4;
        this.methodExtra = methodExtra;
        this.render = str4;
    }

    public /* synthetic */ PIBasicInfoResponse(String str, String str2, String str3, List list, List list2, List list3, List list4, MethodExtra methodExtra, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : list3, (i & 64) != 0 ? null : list4, (i & 128) != 0 ? null : methodExtra, (i & 256) == 0 ? str4 : null);
    }
}
