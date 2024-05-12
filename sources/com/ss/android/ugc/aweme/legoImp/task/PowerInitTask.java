package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C16880lQ;
import X.C227568wS;
import X.C38995FSd;
import X.C46392IIq;
import X.C53073KsH;
import X.C53074KsI;
import X.C72283SYl;
import X.C72285SYn;
import X.C72286SYo;
import X.C72287SYp;
import X.C72289SYr;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.RunnableC72294SYw;
import X.SIV;
import X.SYZ;
import X.SZE;
import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PowerInitTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "PowerInitTask";
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
        boolean z;
        boolean z2;
        boolean z3;
        o.LJIIIZ(context, "context");
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        Context LLLLL = C16880lQ.LLLLL(context);
        o.LJII(LLLLL, "null cannot be cast to non-null type android.app.Application");
        C227568wS.LIZIZ = (Application) LLLLL;
        C227568wS.LIZLLL = true;
        C38995FSd.LIZIZ().execute(RunnableC72294SYw.LJLIL);
        C72283SYl.LIZ = new C72287SYp(C72285SYn.LJLIL);
        C72283SYl.LIZIZ = false;
        C72283SYl.LIZJ = C46392IIq.LIZ;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("fixedviewcell_addview", true);
        } catch (Throwable unused) {
            z = true;
        }
        SIV.LIZ = z;
        try {
            SettingsManager.LIZLLL().getClass();
            z2 = SettingsManager.LIZ("dispatchUpdatesTo_config", true);
        } catch (Throwable unused2) {
            z2 = C53074KsI.LIZ;
        }
        C72289SYr.LIZ = z2;
        try {
            SettingsManager.LIZLLL().getClass();
            z3 = SettingsManager.LIZ("BindFooterSettings", true);
        } catch (Throwable unused3) {
            z3 = C53073KsH.LIZ;
        }
        SYZ.LIZ = z3;
        SZE.LIZLLL("powerlist_init_task", 0.01f, new C72286SYo(elapsedRealtimeNanos));
    }
}
