package com.ss.android.ugc.aweme.creatortools;

import X.C25882ADu;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC36229EJt;
import X.InterfaceC37276Ek4;
import java.util.Map;

/* loaded from: classes5.dex */
public interface AdAuthorizationApi {
    public static final C25882ADu LIZ = C25882ADu.LIZ;

    @E8M("/aweme/v1/ad/authorization/update/")
    @InterfaceC195757mF
    InterfaceC37276Ek4<String> requestAdAuthorization(@InterfaceC36229EJt Map<String, Object> map);
}
