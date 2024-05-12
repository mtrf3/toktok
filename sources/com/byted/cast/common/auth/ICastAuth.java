package com.byted.cast.common.auth;

import com.byted.cast.common.auth.AuthConstants;

/* loaded from: classes29.dex */
public interface ICastAuth {
    void destroy();

    String getLicenseParam(AuthConstants.LicenseParam licenseParam);

    AuthService getService(String str);

    void init(String str);

    void verifyLicense(String str, IAuthListener iAuthListener);
}
