package com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PinForgotConsultResult {

    @InterfaceC65349Pkn("pin_rule_list")
    public final List<PinRule> pinRuleList;

    @InterfaceC65349Pkn("pin_status_detail")
    public final PinStatusDetail pinStatusDetail;

    @InterfaceC65349Pkn("verify_info")
    public final String verifyInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PinForgotConsultResult)) {
            return false;
        }
        PinForgotConsultResult pinForgotConsultResult = (PinForgotConsultResult) obj;
        return o.LJ(this.verifyInfo, pinForgotConsultResult.verifyInfo) && o.LJ(this.pinRuleList, pinForgotConsultResult.pinRuleList) && o.LJ(this.pinStatusDetail, pinForgotConsultResult.pinStatusDetail);
    }

    public final int hashCode() {
        int hashCode = ((this.verifyInfo.hashCode() * 31) + this.pinRuleList.hashCode()) * 31;
        PinStatusDetail pinStatusDetail = this.pinStatusDetail;
        return hashCode + (pinStatusDetail == null ? 0 : pinStatusDetail.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PinForgotConsultResult(verifyInfo=");
        LIZ.append(this.verifyInfo);
        LIZ.append(", pinRuleList=");
        LIZ.append(this.pinRuleList);
        LIZ.append(", pinStatusDetail=");
        LIZ.append(this.pinStatusDetail);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public PinForgotConsultResult(String verifyInfo, List<PinRule> pinRuleList, PinStatusDetail pinStatusDetail) {
        o.LJIIIZ(verifyInfo, "verifyInfo");
        o.LJIIIZ(pinRuleList, "pinRuleList");
        this.verifyInfo = verifyInfo;
        this.pinRuleList = pinRuleList;
        this.pinStatusDetail = pinStatusDetail;
    }
}
