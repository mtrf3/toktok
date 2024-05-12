package com.bytedance.tiktok.homepage.mainactivity;

import X.AbstractC73391SrD;
import X.C00F;
import X.C012403c;
import X.C16880lQ;
import X.C1DG;
import X.C221108m2;
import X.C33721DLh;
import X.C33724DLk;
import X.C38995FSd;
import X.C40007Fn1;
import X.C47497IkX;
import X.C47636Imm;
import X.C47644Imu;
import X.C56662Kg;
import X.C62822Ol8;
import X.C78596Usy;
import X.C84763XOl;
import X.DPB;
import X.IV7;
import X.IV8;
import X.IWF;
import X.RunnableC47642Ims;
import android.content.Context;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.ss.ttvideoengine.TTVideoEngine;
import defpackage.e1;
import kotlin.jvm.internal.AqS158S0100000_8;

/* loaded from: classes9.dex */
public final class LegacyPlayerActivityAssem extends BaseMainContainerAssem {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 26));

    @Override // X.C8W0
    public final void onCreate() {
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(LegacyPlayerActivityAssem.class), "onCreate"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onCreate();
        if (!IV8.LIZIZ) {
            IV8.LIZIZ = true;
            if (C00F.LIZ(31744, 0, "player_background_release_codec_res", true) == 1) {
                IV8.LIZJ = C012403c.LIZIZ(31744, 30000L, "player_background_release_codec_res_countdown_duration");
                IV8.LIZ.LIZ(C84763XOl.LJI().LJJJJZI(IV7.LJLIL));
            }
        }
        C40007Fn1.LIZIZ.LIZIZ();
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // X.C8W0
    public final void onResume() {
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(LegacyPlayerActivityAssem.class), "onResume"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onResume();
        C40007Fn1.LIZIZ.LIZ();
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void T5() {
        C47636Imm.LJIIJ((Context) this.LJLIL.getValue());
        C1DG.LIZ().getConfig().getPlayerGlobalConfig().setForceHttps(false);
    }

    @Override // X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        Context context = (Context) this.LJLIL.getValue();
        if (C47636Imm.LIZLLL) {
            try {
                C16880lQ.LJJLIIIJL(context, C47636Imm.LJ);
                C47636Imm.LJ = null;
                C47636Imm.LIZLLL = false;
            } catch (Exception unused) {
            }
        }
        IV8.LIZ.LIZLLL();
        AbstractC73391SrD<Long> abstractC73391SrD = IV8.LIZLLL;
        if (abstractC73391SrD != null) {
            abstractC73391SrD.dispose();
            IV8.LIZLLL = null;
        }
        if (!((IPipFeedService) IV8.LJ.getValue()).LJIJJLI()) {
            IWF.LJJLIIIIJ().release();
        }
        synchronized (C47644Imu.LIZ) {
        }
        TTVideoEngine.LJJLIIIJJIZ();
        IV8.LIZIZ = false;
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        if (e1.LIZ(31744, "is_record_last_network_speed_enabled", true, true)) {
            SharePrefCache.inst().getLastUsableNetworkSpeed().LIZLLL(Integer.valueOf((int) C47497IkX.LJ().getSpeed()));
        }
    }

    @Override // X.C8W0
    public final void onStop() {
        super.onStop();
        LocalVideoPlayerManager.LIZLLL().LJFF();
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void K5(boolean z, boolean z2) {
        if (z) {
            if (C78596Usy.LJJIJL(C33724DLk.LJLIL, DPB.LIZJ()) && !C33721DLh.LIZ) {
                C33721DLh.LIZ = true;
                C38995FSd.LJFF().execute(RunnableC47642Ims.LJLIL);
            }
        }
    }
}
