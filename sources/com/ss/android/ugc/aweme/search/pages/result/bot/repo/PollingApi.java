package com.ss.android.ugc.aweme.search.pages.result.bot.repo;

import X.C49551JcZ;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC36229EJt;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.PollingInfoResponse;
import java.util.Map;

/* loaded from: classes9.dex */
public interface PollingApi {
    public static final C49551JcZ LIZ = C49551JcZ.LIZ;

    @E8M("/aweme/v1/search/general/polling/")
    @InterfaceC195757mF
    Object getPollingData(@InterfaceC36229EJt Map<String, String> map, InterfaceC67352kd<? super PollingInfoResponse> interfaceC67352kd);
}
