package com.ss.android.ugc.aweme.bnpl.network.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model.PinRule;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class ConsultRegisterInfoResponse {

    @InterfaceC65349Pkn("calling_code_list")
    public ArrayList<String> callingCodeList;

    @InterfaceC65349Pkn("masked_mobile_no")
    public final String maskedMobileNo;

    @InterfaceC65349Pkn("mobile_rule_list")
    public final ArrayList<PhoneRule> mobileRuleList;

    @InterfaceC65349Pkn("pin_rule_list")
    public final ArrayList<PinRule> pinRuleList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsultRegisterInfoResponse)) {
            return false;
        }
        ConsultRegisterInfoResponse consultRegisterInfoResponse = (ConsultRegisterInfoResponse) obj;
        return o.LJ(this.maskedMobileNo, consultRegisterInfoResponse.maskedMobileNo) && o.LJ(this.callingCodeList, consultRegisterInfoResponse.callingCodeList) && o.LJ(this.mobileRuleList, consultRegisterInfoResponse.mobileRuleList) && o.LJ(this.pinRuleList, consultRegisterInfoResponse.pinRuleList);
    }

    public final int hashCode() {
        String str = this.maskedMobileNo;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.callingCodeList.hashCode()) * 31) + this.mobileRuleList.hashCode()) * 31) + this.pinRuleList.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ConsultRegisterInfoResponse(maskedMobileNo=");
        LIZ.append(this.maskedMobileNo);
        LIZ.append(", callingCodeList=");
        LIZ.append(this.callingCodeList);
        LIZ.append(", mobileRuleList=");
        LIZ.append(this.mobileRuleList);
        LIZ.append(", pinRuleList=");
        LIZ.append(this.pinRuleList);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ConsultRegisterInfoResponse(String str, ArrayList<String> callingCodeList, ArrayList<PhoneRule> mobileRuleList, ArrayList<PinRule> pinRuleList) {
        o.LJIIIZ(callingCodeList, "callingCodeList");
        o.LJIIIZ(mobileRuleList, "mobileRuleList");
        o.LJIIIZ(pinRuleList, "pinRuleList");
        this.maskedMobileNo = str;
        this.callingCodeList = callingCodeList;
        this.mobileRuleList = mobileRuleList;
        this.pinRuleList = pinRuleList;
    }
}
