package com.ss.android.ugc.aweme.homepage.business;

import X.AV1;
import X.C0RN;
import X.C16880lQ;
import X.C198517qh;
import X.C36922EeM;
import X.C38776FJs;
import X.C84763XOl;
import X.C8HX;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FMX;
import Y.ARunnableS10S0100100_1;
import android.content.Context;
import android.os.Handler;
import com.ss.android.ugc.aweme.common.MobClick;
import java.util.List;

/* loaded from: classes2.dex */
public final class HomeToastTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "HomeToastTask";
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
    public final /* synthetic */ int targetProcess() {
        return C0RN.LIZ();
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
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        C36922EeM.LJ("ToastTask");
        long LIZIZ = C38776FJs.LJIIL().LIZIZ(context, "red_point_count");
        if (LIZIZ > 0) {
            if (!AV1.LJIIJJI()) {
                Context LJIIIIZZ = C84763XOl.LJIIIIZZ();
                if (LJIIIIZZ == null) {
                    LJIIIIZZ = context;
                }
                new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS10S0100100_1(LIZIZ, LJIIIIZZ, 0));
            }
            C198517qh c198517qh = new C198517qh();
            c198517qh.LIZ.put("count", String.valueOf(LIZIZ));
            C8HX.LIZIZ("log_red_badge", "click", c198517qh.LJ());
            MobClick obtain = MobClick.obtain();
            obtain.setEventName("red_badge");
            obtain.setLabelName("click");
            obtain.setValue(String.valueOf(LIZIZ));
            FMX.onEvent(obtain);
            C38776FJs.LJIIL().LJIIIZ(context, "red_point_count", 0L);
        }
    }
}
