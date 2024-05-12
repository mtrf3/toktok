package com.ss.android.ugc.aweme.compliance.business.statemachine;

import X.C0RN;
import X.C77275UUl;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes7.dex */
public final class PNSNormalStateMachineInitTask implements EE1 {
    public final HashSet<String> LJLIL = C77275UUl.LIZLLL("pns_kid_user_monitor_handler", "gatekeeper_user_state_handler", "consent_framework_user_state_handler");

    @Override // X.EEY
    public final String key() {
        return "PNSNormalStateMachineInitTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        for (UserStateHandler userStateHandler : ServiceManager.get().getServices(UserStateHandler.class)) {
            if (this.LJLIL.contains(userStateHandler.key())) {
                PNSUserStateManager.LIZIZ().LIZ(userStateHandler);
            }
        }
        PNSUserStateManager.LIZIZ().initService();
    }
}
