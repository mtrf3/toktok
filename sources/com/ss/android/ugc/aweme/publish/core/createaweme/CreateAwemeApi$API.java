package com.ss.android.ugc.aweme.publish.core.createaweme;

import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC36229EJt;
import X.InterfaceC37276Ek4;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public interface CreateAwemeApi$API {
    @E8M("/aweme/v1/create/aweme/")
    @InterfaceC195757mF
    InterfaceC37276Ek4<CreateAwemeResponse> createAweme(@InterfaceC36229EJt LinkedHashMap<String, String> linkedHashMap);
}
