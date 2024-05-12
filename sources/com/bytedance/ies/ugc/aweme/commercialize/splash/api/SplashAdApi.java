package com.bytedance.ies.ugc.aweme.commercialize.splash.api;

import X.E8L;
import X.E8M;
import X.ENW;
import X.InterfaceC195727mC;
import X.InterfaceC195747mE;
import X.InterfaceC195757mF;
import X.InterfaceC36229EJt;
import X.InterfaceC36348EOi;
import X.InterfaceC37276Ek4;
import X.InterfaceC61611OFz;
import X.InterfaceC64985Pev;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.Map;

/* loaded from: classes11.dex */
public interface SplashAdApi {
    @E8L
    InterfaceC37276Ek4<String> executeGet(@ENW int i, @InterfaceC195747mE String str);

    @InterfaceC61611OFz("vas_ad_track")
    @E8L
    InterfaceC37276Ek4<String> executeGet(@ENW int i, @InterfaceC195747mE String str, @InterfaceC36348EOi("User-Agent") String str2);

    @E8M
    InterfaceC37276Ek4<String> executePost(@ENW int i, @InterfaceC195747mE String str, @InterfaceC195727mC TypedOutput typedOutput);

    @E8M
    @InterfaceC195757mF
    InterfaceC37276Ek4<String> executePost(@ENW int i, @InterfaceC195747mE String str, @InterfaceC64985Pev("ad_status") String str2);

    @E8M
    @InterfaceC195757mF
    InterfaceC37276Ek4<String> executePost(@ENW int i, @InterfaceC195747mE String str, @InterfaceC36229EJt Map<String, String> map);
}
