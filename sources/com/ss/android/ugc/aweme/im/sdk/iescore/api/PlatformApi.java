package com.ss.android.ugc.aweme.im.sdk.iescore.api;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.C63720Ozc;
import X.E4Q;
import X.E4T;
import X.InterfaceC195737mD;
import X.InterfaceC195797mJ;
import X.InterfaceC27211Am7;
import X.InterfaceC36315ENb;
import X.InterfaceC64997Pf7;
import X.InterfaceC65002PfC;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.Response;
import java.util.Map;

/* loaded from: classes2.dex */
public interface PlatformApi {
    public static final C63720Ozc LIZ = C63720Ozc.LIZ;

    @E4Q
    AbstractC73672Svk<String> get(@InterfaceC195797mJ String str, @InterfaceC36315ENb Map<String, String> map, @InterfaceC64997Pf7 Map<String, String> map2);

    @E4T
    AbstractC73672Svk<String> post(@InterfaceC195797mJ String str, @InterfaceC36315ENb Map<String, String> map, @InterfaceC64997Pf7 Map<String, String> map2, @InterfaceC27211Am7 Object obj);

    @E4T
    AbstractC73672Svk<Response> postSDK(@InterfaceC195797mJ String str, @InterfaceC65002PfC("Content-Type") String str2, @InterfaceC65002PfC("Locale") String str3, @InterfaceC27211Am7 Request request, @InterfaceC195737mD Object obj);

    @E4T
    AbstractC73638SvC<Response> postSingle(@InterfaceC195797mJ String str, @InterfaceC65002PfC("Content-Type") String str2, @InterfaceC65002PfC("Locale") String str3, @InterfaceC27211Am7 Request request, @InterfaceC195737mD Object obj);
}
