package com.ss.android.ugc.trill.openauthorize;

import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.IAuthorizeCommonService;
import com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity;

/* loaded from: classes11.dex */
public final class AuthorizeCommonService implements IAuthorizeCommonService {
    @Override // com.ss.android.ugc.aweme.framework.services.IAuthorizeCommonService
    public final boolean isActivityAwemeAuthorize(Activity activity) {
        if ((activity instanceof AwemeAuthorizedActivity) || (activity instanceof com.zhiliaoapp.musically.openauthorize.AwemeAuthorizedActivity) || (activity instanceof AwemeAuthorizeLoginActivity)) {
            return true;
        }
        return false;
    }
}
