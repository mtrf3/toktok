package com.ss.android.ugc.aweme.newuser;

import X.C36089EEj;
import X.C36093EEn;
import com.bytedance.ies.ugc.aweme.commercialize.splash.SplashAdManagerPreloadTask;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.ss.android.ugc.aweme.launcher.service.newuser.INewUserApi;

/* loaded from: classes7.dex */
public final class NewUserImpl implements INewUserApi {
    @Override // com.ss.android.ugc.aweme.launcher.service.newuser.INewUserApi
    public final void LIZ() {
        C36093EEn.LIZ.getClass();
        C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
        SplashAdManagerPreloadTask LJIJJLI = SplashAdServiceImpl.LJJI().LJIJJLI();
        if (LJIJJLI == null) {
            return;
        }
        LJIIIZ.LIZIZ(LJIJJLI, true);
        LJIIIZ.LIZJ();
    }
}
