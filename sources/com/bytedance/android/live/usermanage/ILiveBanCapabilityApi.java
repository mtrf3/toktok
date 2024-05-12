package com.bytedance.android.live.usermanage;

import X.AbstractC73672Svk;
import X.E8M;
import X.InterfaceC195727mC;
import tikcast.api.perception.MultiViolationStatusResponse;

/* loaded from: classes6.dex */
public interface ILiveBanCapabilityApi {
    @E8M("/webcast/perception/violation/multi_status/")
    AbstractC73672Svk<MultiViolationStatusResponse> getLiveBanCapability(@InterfaceC195727mC BanCapabilityParams banCapabilityParams);
}
