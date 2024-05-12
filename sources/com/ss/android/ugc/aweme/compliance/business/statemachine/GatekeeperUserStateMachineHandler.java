package com.ss.android.ugc.aweme.compliance.business.statemachine;

import X.EnumC39785FjR;
import android.os.Bundle;
import com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler;
import com.ss.android.ugc.aweme.pns.gatekeeper.GatekeeperManager;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class GatekeeperUserStateMachineHandler implements UserStateHandler {
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
    public final String key() {
        return "gatekeeper_user_state_handler";
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final EnumC39785FjR LIZ() {
        return EnumC39785FjR.PNS_USER_TYPE_NORMAL;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LIZJ(User user) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("user", user);
        GatekeeperManager.LJ().LIZIZ(bundle, "UserUpdate");
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LJFF(User user) {
        o.LJIIIZ(user, "user");
        Bundle bundle = new Bundle();
        bundle.putSerializable("user", user);
        bundle.putBoolean("is_after_login", true);
        GatekeeperManager.LJ().LIZIZ(bundle, "UserUpdate");
        GatekeeperManager.LJ().LIZIZ(bundle, "UserLogin");
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler
    public final void LJI(User user) {
        GatekeeperManager.LJ().reset();
        Bundle bundle = new Bundle();
        bundle.putSerializable("user", user);
        bundle.putBoolean("is_after_login", true);
        GatekeeperManager.LJ().LIZIZ(bundle, "UserLogin");
    }
}
