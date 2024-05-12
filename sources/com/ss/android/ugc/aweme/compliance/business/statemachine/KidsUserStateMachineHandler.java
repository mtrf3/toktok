package com.ss.android.ugc.aweme.compliance.business.statemachine;

import X.C58096Mr6;
import X.C84763XOl;
import X.EnumC39785FjR;
import android.app.Activity;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.childhook.services.ChildHookServiceImpl;
import com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler;
import com.ss.android.ugc.aweme.compliance.consent.consentmanagementframework.PNSConsentServiceImpl;
import com.ss.android.ugc.aweme.kids.homepage.compliance.KidsSettingsServiceImpl;
import com.ss.android.ugc.aweme.launcher.service.interceptor.IChildHookService;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class KidsUserStateMachineHandler implements UserStateHandler {
    public boolean LIZ;

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LIZIZ(User user) {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LIZLLL(User user) {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LJ(User user) {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LJI(User user) {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final String key() {
        return "pns_kid_user_monitor_handler";
    }

    public final void LJII() {
        IChildHookService iChildHookService;
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        AppLog.setEventFilterByClient(KidsSettingsServiceImpl.LJIIJJI().LJII(), false);
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            Object LIZ = C58096Mr6.LIZ(IChildHookService.class, false);
            if (LIZ != null) {
                iChildHookService = (IChildHookService) LIZ;
            } else {
                if (C58096Mr6.LLJLL == null) {
                    synchronized (IChildHookService.class) {
                        if (C58096Mr6.LLJLL == null) {
                            C58096Mr6.LLJLL = new ChildHookServiceImpl();
                        }
                    }
                }
                iChildHookService = C58096Mr6.LLJLL;
            }
            iChildHookService.LIZJ(LJIIIIZZ);
            iChildHookService.LIZLLL();
            iChildHookService.LIZIZ();
            iChildHookService.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final EnumC39785FjR LIZ() {
        return EnumC39785FjR.PNS_USER_TYPE_KIDS;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LIZJ(User user) {
        LJII();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LJFF(User user) {
        o.LJIIIZ(user, "user");
        LJII();
        PNSConsentServiceImpl.LJ().LIZ();
    }
}
