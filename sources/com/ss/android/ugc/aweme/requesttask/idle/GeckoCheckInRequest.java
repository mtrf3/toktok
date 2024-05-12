package com.ss.android.ugc.aweme.requesttask.idle;

import X.C0RN;
import X.C16880lQ;
import X.C36175EHr;
import X.C61467OAl;
import X.C84763XOl;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EGC;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.O3U;
import X.RunnableC36174EHq;
import Y.IDxS130S0200000_6;
import android.content.Context;
import android.os.Handler;
import com.bytedance.ies.abmock.SettingsManager;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class GeckoCheckInRequest implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "GeckoCheckInRequest";
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

    public final void LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        try {
            Handler handler = new Handler(C16880lQ.LLJJJJ());
            RunnableC36174EHq runnableC36174EHq = RunnableC36174EHq.LJLIL;
            SettingsManager.LIZLLL().getClass();
            handler.postDelayed(runnableC36174EHq, SettingsManager.LJFF("gecko_normal_request_time", 60000L));
            try {
                C61467OAl.LIZJ(new File(C16880lQ.LLIIJLIL(EF7.LIZIZ()), "offline"));
            } catch (Throwable unused) {
            }
        } catch (Exception e) {
            C36175EHr.LIZ(e);
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        if (O3U.LJ) {
            return;
        }
        if (EGC.LIZ()) {
            C84763XOl.LJI().LIZ(new IDxS130S0200000_6(this, context, 0));
        } else {
            LIZLLL(context);
        }
    }
}
