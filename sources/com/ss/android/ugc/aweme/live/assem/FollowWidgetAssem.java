package com.ss.android.ugc.aweme.live.assem;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C212428Vi;
import X.C40342FsQ;
import X.C40343FsR;
import X.C42193GhB;
import X.C55661Lsv;
import X.C56662Kg;
import X.C59748Nce;
import X.C78685UuP;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.hox.Hox;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FollowWidgetAssem extends BaseMainContainerAssem {
    @Override // X.C8W0
    public final void onCreate() {
        Intent intent;
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(FollowWidgetAssem.class), "onCreate"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onCreate();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (intent = LIZ.getIntent()) != null) {
            v3(intent);
        }
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void onNewIntent(Intent intent) {
        String str;
        o.LJIIIZ(intent, "intent");
        v3(intent);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "extra_schema_to_highlight_page");
        if (LLJJIJIIJIL != null && SmartRouter.canOpen(LLJJIJIIJIL)) {
            ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
            if (LJJJLL == null || (str = LJJJLL.LJJJ(getContext(), UriProtector.parse(LLJJIJIIJIL))) == null) {
                str = "";
            }
            SparkContext LIZIZ = C42193GhB.LIZIZ(str);
            LIZIZ.LJJIJIIJI(new C59748Nce(this));
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            if (LIZ != null && C78685UuP.LJJJZ(str)) {
                C40343FsR.LJIILJJIL.getClass();
                C40342FsQ.LIZ(LIZ, LIZIZ).LIZIZ();
            }
        }
    }

    public final void v3(Intent intent) {
        ActivityC45651qj LIZ;
        if (intent != null && o.LJ("follow_widget", C16880lQ.LLJJIJIIJIL(intent, "follow_widget_enter_from_merge")) && (LIZ = C212428Vi.LIZ(this)) != null) {
            Hox.LJLLI.LIZ(LIZ).Cv0(new Bundle(), "Following");
            LiveOuterService.LJJJLL().LJIIJJI();
            C55661Lsv.LIZ.LJIJJLI(LIZ, intent);
        }
    }
}
