package com.ss.android.ugc.aweme;

import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.R5J;
import X.R5K;
import X.R5M;
import android.app.Activity;
import android.os.Bundle;
import java.util.Map;

/* loaded from: classes12.dex */
public interface ICloudTokenLoginService {
    void attemptRefreshTokenAfterLoginForCurrentUser();

    void disableTokenForOneClickLogin(String str, String str2, boolean z, R5K r5k, String str3, String str4, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns);

    void enableCloudTokenForOneClickLogin(boolean z, R5M r5m, String str, String str2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns);

    void oneClickLogin(Activity activity, String str, String str2, boolean z, R5J r5j, Map<String, ? extends Object> map, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns);

    boolean shouldShowOneClickLoginPanel();

    void tryStartMandatoryOneClickLogin(Activity activity, Bundle bundle, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2);
}
