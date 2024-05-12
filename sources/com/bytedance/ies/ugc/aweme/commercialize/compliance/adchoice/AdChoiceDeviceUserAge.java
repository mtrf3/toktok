package com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* loaded from: classes7.dex */
public final class AdChoiceDeviceUserAge extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("age_eligible")
    public Integer ageEligible;

    public final Integer getAgeEligible() {
        return this.ageEligible;
    }

    public AdChoiceDeviceUserAge(Integer num) {
        this.ageEligible = num;
    }

    public final void setAgeEligible(Integer num) {
        this.ageEligible = num;
    }
}
