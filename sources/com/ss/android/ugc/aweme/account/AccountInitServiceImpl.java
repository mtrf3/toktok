package com.ss.android.ugc.aweme.account;

import X.C58099Mr9;
import X.C58100MrA;
import X.C58101MrB;
import X.C58102MrC;
import X.C58103MrD;
import X.C58104MrE;
import X.InterfaceC40454FuE;
import com.ss.android.ugc.aweme.framework.services.IWebViewTweaker;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.main.service.II18nService;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import com.ss.android.ugc.aweme.services.IAccountHelperService;
import com.ss.android.ugc.aweme.setting.services.IAppUpdateService;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AccountInitServiceImpl implements IAccountInitService {
    @Override // com.ss.android.ugc.aweme.account.IAccountInitService
    public final <T> ServiceProvider<T> getService(Class<T> cls) {
        if (o.LJ(cls, ILanguageService.class)) {
            return C58102MrC.LIZ;
        }
        if (o.LJ(cls, IAccountHelperService.class)) {
            return C58100MrA.LIZ;
        }
        if (o.LJ(cls, IWebViewTweaker.class)) {
            return C58101MrB.LIZ;
        }
        if (o.LJ(cls, IAppUpdateService.class)) {
            return C58103MrD.LIZ;
        }
        if (o.LJ(cls, InterfaceC40454FuE.class)) {
            return C58104MrE.LIZ;
        }
        if (o.LJ(cls, II18nService.class)) {
            return C58099Mr9.LIZ;
        }
        return null;
    }
}
