package com.ss.android.ugc.aweme.assem;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C221108m2;
import X.C26045AKb;
import X.C35154Dqw;
import X.C42622Go6;
import X.C45039Hlz;
import X.C56662Kg;
import X.C62822Ol8;
import X.C67128QWe;
import X.MEX;
import X.QWU;
import android.app.Activity;
import android.os.Bundle;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.commerce.tools.music.promote.PromoteRepalceMusicServiceImpl;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.edit.IReplaceMusicService;
import com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes8.dex */
public final class TikTokToolsAssem extends BaseMainContainerAssem {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 56));
    public final QWU LJLILLLLZI = new QWU();

    @Override // X.C8W0
    public final void onResume() {
        ActivityC45651qj activityC45651qj;
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(TikTokToolsAssem.class), "onResume"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onResume();
        Activity activity = (Activity) this.LJLIL.getValue();
        if ((activity instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) activity) != null) {
            IReplaceMusicService LIZ = ReplaceMusicServiceImpl.LIZ();
            if (LIZ.getClickPost()) {
                PromoteRepalceMusicServiceImpl.LIZJ().LIZ();
                if (!C42622Go6.LJIIIZ) {
                    if (C35154Dqw.LIZ()) {
                        C67128QWe c67128QWe = C67128QWe.LIZIZ;
                        c67128QWe.LIZJ(20216, 1, this.LJLILLLLZI);
                        c67128QWe.LIZJ(20173, 1, this.LJLILLLLZI);
                    } else if (!EventBus.LIZJ().LJI(this.LJLILLLLZI)) {
                        EventBus.LIZJ().LJIILJJIL(this.LJLILLLLZI);
                    }
                    LIZ.setClickPost(false);
                    AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getABService();
                    if (MEX.LJFF()) {
                        C26045AKb c26045AKb = new C26045AKb(activityC45651qj);
                        c26045AKb.LJIIIIZZ(R.string.bv3);
                        c26045AKb.LJIIJ();
                        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getApplicationService();
                        C45039Hlz.LIZJ(activityC45651qj, null);
                    } else {
                        C26045AKb c26045AKb2 = new C26045AKb(activityC45651qj);
                        c26045AKb2.LJIIIIZZ(R.string.q3c);
                        c26045AKb2.LJIIJ();
                        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getApplicationService().getClass();
                        Bundle bundle = new Bundle();
                        bundle.putString("fromStart", "MainFragment");
                        Hox.kv0(activityC45651qj).Cv0(bundle, "Following");
                    }
                    LIZ.doRequest(LIZ.getCover(), LIZ.getReplaceMusicRequest(), activityC45651qj);
                }
            }
        }
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        if (C35154Dqw.LIZ()) {
            C67128QWe.LIZIZ.LJIIJJI(this.LJLILLLLZI);
        } else if (EventBus.LIZJ().LJI(this.LJLILLLLZI)) {
            EventBus.LIZJ().LJIJ(this.LJLILLLLZI);
        }
        PromoteRepalceMusicServiceImpl.LIZJ().LIZ();
        C42622Go6.LJIILIIL();
    }
}
