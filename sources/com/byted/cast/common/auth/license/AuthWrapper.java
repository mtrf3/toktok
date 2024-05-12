package com.byted.cast.common.auth.license;

import com.byted.cast.common.ContextManager;
import com.byted.cast.common.auth.AuthConstants;
import com.byted.cast.common.auth.AuthService;
import com.byted.cast.common.auth.IAuthListener;
import com.byted.cast.common.auth.ICastAuth;

/* loaded from: classes29.dex */
public class AuthWrapper implements ICastAuth {
    public final AuthManager mManager;

    @Override // com.byted.cast.common.auth.ICastAuth
    public void destroy() {
        this.mManager.destroy();
    }

    public AuthWrapper(ContextManager.CastContext castContext) {
        this.mManager = ContextManager.getAuthManager(castContext);
    }

    @Override // com.byted.cast.common.auth.ICastAuth
    public String getLicenseParam(AuthConstants.LicenseParam licenseParam) {
        return this.mManager.getLicenseParam(licenseParam);
    }

    @Override // com.byted.cast.common.auth.ICastAuth
    public AuthService getService(String str) {
        return this.mManager.getService(str);
    }

    @Override // com.byted.cast.common.auth.ICastAuth
    public void init(String str) {
        this.mManager.init(str);
    }

    @Override // com.byted.cast.common.auth.ICastAuth
    public void verifyLicense(String str, IAuthListener iAuthListener) {
        this.mManager.verifyLicense(str, iAuthListener);
    }
}
