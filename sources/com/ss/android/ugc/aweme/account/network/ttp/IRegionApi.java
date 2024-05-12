package com.ss.android.ugc.aweme.account.network.ttp;

import X.C10K;
import X.C66570QAs;
import X.E4T;
import X.EJ6;
import X.InterfaceC195767mG;
import X.InterfaceC195787mI;
import X.InterfaceC36229EJt;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public interface IRegionApi {
    public static final C66570QAs LIZ = C66570QAs.LIZ;

    @InterfaceC195787mI
    @E4T("/passport/app/auth_broadcast/")
    C10K<IgnoredResponse> authBroadcast(@InterfaceC36229EJt Map<String, String> map, @InterfaceC195767mG List<EJ6> list);

    @InterfaceC195787mI
    @E4T("/passport/app/region/")
    C10K<GetRegionResponse> getRegion(@InterfaceC36229EJt Map<String, String> map, @InterfaceC195767mG List<EJ6> list);

    @InterfaceC195787mI
    @E4T("/passport/app/region_alert/")
    C10K<IgnoredResponse> regionAlert(@InterfaceC36229EJt Map<String, String> map, @InterfaceC195767mG List<EJ6> list);
}
