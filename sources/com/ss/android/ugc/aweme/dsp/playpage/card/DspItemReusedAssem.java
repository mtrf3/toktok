package com.ss.android.ugc.aweme.dsp.playpage.card;

import X.C214368bA;
import X.C65352Pkq;
import X.C8VR;
import X.C91395Ztv;
import X.C91397Ztx;
import X.C91400Zu0;
import Y.IDRunnableS88S0100000_29;
import android.view.View;
import com.ss.android.ugc.aweme.dsp.arch.BaseDspItemReusedAssem;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;
import com.ss.android.ugc.aweme.dsp.playpage.card.upsell.UpsellLandingPageSlotAssem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class DspItemReusedAssem extends BaseDspItemReusedAssem {
    public final C91397Ztx LLFII;
    public C91400Zu0 LLFZ;

    public DspItemReusedAssem(C91397Ztx params) {
        o.LJIIIZ(params, "params");
        new LinkedHashMap();
        this.LLFII = params;
    }

    @Override // X.C8XO
    public final void F0(C91395Ztv item) {
        o.LJIIIZ(item, "item");
        if (ExpiredPlayableManager.INSTANCE.isTodayPlayableLimited()) {
            C8VR.LIZJ(this, C65352Pkq.LIZ(UpsellLandingPageSlotAssem.class));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C91400Zu0 c91400Zu0;
        o.LJIIIZ(view, "view");
        if (!(view instanceof C91400Zu0) || (c91400Zu0 = (C91400Zu0) view) == null) {
            return;
        }
        this.LLFZ = c91400Zu0;
        C214368bA.LIZ().execute(new IDRunnableS88S0100000_29(this, 5));
    }
}
