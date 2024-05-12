package com.bytedance.ies.ugc.aweme.commercialize.compliance.api;

import X.E8M;
import X.GKL;
import X.InterfaceC37276Ek4;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice.AdChoiceDeviceUserAge;

/* loaded from: classes8.dex */
public interface IAdChoiceApi {
    public static final GKL LIZ = GKL.LIZ;

    @E8M("/tiktok/v1/csp/device_interval_info")
    InterfaceC37276Ek4<AdChoiceDeviceUserAge> getDeviceUserAge();
}
