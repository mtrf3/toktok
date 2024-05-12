package com.ss.android.ugc.aweme;

import android.os.Bundle;

/* loaded from: classes7.dex */
public interface IMandatoryLoginService {
    boolean disableForTest();

    boolean enableForcedLogin(boolean z);

    boolean getHasRequestComplianceApi();

    Bundle getLoginActivityBundle();

    void setHasRequestComplianceApi(boolean z);

    boolean shouldShowForcedLogin(boolean z);

    boolean shouldShowLoginTabFirst();

    void skipLoginForTest();
}
