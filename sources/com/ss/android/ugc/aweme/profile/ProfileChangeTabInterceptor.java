package com.ss.android.ugc.aweme.profile;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C221018lt;
import X.C53765L8f;
import X.C84193Sd;
import X.EnumC54052LJg;
import X.X1D;
import Y.AObserverS38S0400000_9;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.base.ChangeTabProtocol;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ProfileChangeTabInterceptor implements ChangeTabProtocol {
    public final void LIZ(ActivityC45651qj activityC45651qj, Intent intent) {
        Bundle bundle;
        C221018lt.LJFF("ProfileChangeTabInterceptor", "onChangeTab perform intercept");
        if (intent == null || (bundle = C16880lQ.LLJJIJI(intent)) == null) {
            bundle = new Bundle();
        }
        bundle.putString("fromStart", "MainPage");
        bundle.putBoolean("isSmoothScroll", true);
        Hox.LJLLI.LIZ(activityC45651qj).Cv0(bundle, "USER");
    }

    @Override // com.ss.android.ugc.aweme.base.ChangeTabProtocol
    public final boolean m0(ActivityC45651qj activityC45651qj, Intent intent, String str, EnumC54052LJg scene) {
        o.LJIIIZ(scene, "scene");
        if (!o.LJ(str, "USER") || C53765L8f.LJIIL("USER")) {
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onChangeTab need intercept state = ");
        LIZ.append(activityC45651qj.getLifecycle().getCurrentState());
        LIZ.append(' ');
        C221018lt.LJFF("ProfileChangeTabInterceptor", X1D.LIZIZ(LIZ));
        if (C16880lQ.LLJJIJIL(activityC45651qj.getLifecycle().getCurrentState(), Lifecycle.State.CREATED) <= 0) {
            C221018lt.LJFF("ProfileChangeTabInterceptor", "onChangeTab perform intercept delay when resumed");
            Hox.LJLLI.LIZ(activityC45651qj).Cv0(new Bundle(), "HOME");
            ScrollSwitchStateManager LIZ2 = C84193Sd.LIZ(activityC45651qj);
            if (!LIZ2.pv0()) {
                LIZ2.LJLLLL.observe(activityC45651qj, new AObserverS38S0400000_9(this, activityC45651qj, intent, LIZ2, 1));
                return true;
            }
            LIZ(activityC45651qj, intent);
            return true;
        }
        LIZ(activityC45651qj, intent);
        return true;
    }
}
