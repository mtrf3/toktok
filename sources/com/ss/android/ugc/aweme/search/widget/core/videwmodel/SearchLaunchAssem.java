package com.ss.android.ugc.aweme.search.widget.core.videwmodel;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C212428Vi;
import X.C56662Kg;
import X.C78685UuP;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;

/* loaded from: classes7.dex */
public final class SearchLaunchAssem extends BaseMainContainerAssem {
    @Override // X.C8W0
    public final void onCreate() {
        Intent intent;
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(SearchLaunchAssem.class), "onCreate"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onCreate();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (intent = LIZ.getIntent()) != null) {
            boolean booleanExtra = intent.getBooleanExtra("extra_need_route_to_search", false);
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "extra_search_route_url");
            if (booleanExtra && C78685UuP.LJJJZ(LLJJIJIIJIL)) {
                Bundle LJJLIIIIJ = C16880lQ.LJJLIIIIJ(intent, "search_extra");
                ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
                if (LIZ2 != null) {
                    SmartRoute buildRoute = SmartRouter.buildRoute(LIZ2, LLJJIJIIJIL);
                    buildRoute.withParam(LJJLIIIIJ);
                    buildRoute.open();
                }
            }
        }
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }
}
