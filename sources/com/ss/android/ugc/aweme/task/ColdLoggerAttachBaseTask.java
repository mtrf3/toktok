package com.ss.android.ugc.aweme.task;

import X.C0RN;
import X.C34710Djm;
import X.C38354F3m;
import X.C56662Kg;
import X.C56672Kh;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FAJ;
import X.FAK;
import X.FAQ;
import X.FAR;
import X.FAU;
import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import java.util.List;

/* loaded from: classes7.dex */
public final class ColdLoggerAttachBaseTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "ColdLoggerAttachBaseTask";
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
        return EFK.MAIN;
    }

    @Override // X.EEY
    public final void run(Context context) {
        Application application;
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        long currentTimeMillis = System.currentTimeMillis();
        FAK LIZ = C56672Kh.LIZ();
        boolean booleanValue = ((Boolean) C34710Djm.LJJJJIZL.getValue()).booleanValue();
        boolean z = !C38354F3m.LIZJ(EF7.LJIILIIL, "qtp");
        LIZ.LJIJ = booleanValue;
        LIZ.LJIJI = z;
        LIZ.LJIJJ = z;
        LIZ.LJIJJLI = z;
        LIZ.LJIL = z;
        LIZ.LJJ = z;
        FAK LIZ2 = C56672Kh.LIZ();
        long longValue = ((Number) C34710Djm.LJJJJJL.getValue()).longValue();
        LIZ2.getClass();
        if (longValue > 0 && longValue <= 3600) {
            LIZ2.LJJII = longValue;
        }
        FAJ.LJFF("app_start_v2_to_v1", true);
        FAJ.LIZ("app_start_to_main_focus_v2", true);
        FAJ.LIZ("feed_total_v2", true);
        C56662Kg.LIZ().LIZJ("app_start_to_first_frame_render", false);
        C56662Kg.LIZ().LIZJ("feed_boot_to_feed_request", true);
        C56662Kg.LIZ().LIZJ("feed_cover_total", false);
        C56662Kg.LIZ().LIZJ("from_start_to_video_play", false);
        C56662Kg.LIZ().LIZJ("cold_boot_start_to_feed_ui", false);
        C56662Kg.LIZ().LIZJ("feed_boot_to_network", false);
        C56662Kg.LIZ().LIZJ("feed_boot_to_init_ttnet", false);
        C56662Kg.LIZ().LIZJ("feed_boot_to_init_ttnet_end", false);
        C56662Kg.LIZ().LIZJ("app_start_to_preload_first_request", false);
        C56662Kg.LIZ().LIZJ("app_start_to_get_did", false);
        C56662Kg.LIZ().LIZJ("cold_boot_start_to_prerender_end_nuj_scene", false);
        C56662Kg.LIZ().LIZJ("cold_boot_new_user_start_to_login", false);
        C56662Kg.LIZ().LIZJ("cold_boot_start_to_preload_main", false);
        C56662Kg.LIZ().LIZJ("cold_boot_start_to_feed_total_start", false);
        C56662Kg.LIZ().LJIIJ = currentTimeMillis;
        C56662Kg.LIZ().LJIIJJI = SystemClock.elapsedRealtime();
        C56662Kg.LIZ().LIZLLL(currentTimeMillis, "cold_boot_begin_time");
        C56662Kg.LIZ().LIZLLL(currentThreadTimeMillis, "app_thread_to_start");
        try {
            FAR.LIZ = SystemClock.uptimeMillis();
            FAR.LIZIZ = true;
        } catch (Throwable unused) {
        }
        if ((context instanceof Application) && (application = (Application) context) != null) {
            FAU fau = new FAU();
            FAQ faq = new FAQ();
            application.registerActivityLifecycleCallbacks(fau);
            fau.LJLIL = faq;
        }
    }
}
