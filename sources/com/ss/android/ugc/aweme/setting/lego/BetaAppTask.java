package com.ss.android.ugc.aweme.setting.lego;

import X.C0RN;
import X.C32151Nz;
import X.C38410F5q;
import X.C40561Fvx;
import X.C40566Fw2;
import X.C40567Fw3;
import X.C40606Fwg;
import X.C40607Fwh;
import X.C40608Fwi;
import X.E1Q;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.google.android.play.core.appupdate.b;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BetaAppTask implements EE1 {
    public final b LJLIL;

    @Override // X.EEY
    public final String key() {
        return "BetaAppTask";
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

    public BetaAppTask() {
        b LJIILIIL = C32151Nz.LJIILIIL(EF7.LIZIZ());
        o.LJIIIIZZ(LJIILIIL, "create(AppContextManager.getApplicationContext())");
        this.LJLIL = LJIILIIL;
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
        if (!BetaAppExperiment.LIZJ()) {
            return;
        }
        IAccountService LJIJ = AccountService.LJIJ();
        if (!LJIJ.LJFF().isLogin()) {
            LJIJ.LJIILJJIL(new C40608Fwi(this));
        }
        C40561Fvx LIZIZ = this.LJLIL.LIZIZ();
        C40606Fwg c40606Fwg = new C40606Fwg(this);
        LIZIZ.getClass();
        E1Q e1q = C38410F5q.LIZ;
        LIZIZ.LIZJ(e1q, c40606Fwg);
        C40607Fwh c40607Fwh = new C40607Fwh(this);
        C40566Fw2<ResultT> c40566Fw2 = LIZIZ.LIZIZ;
        C40567Fw3 c40567Fw3 = new C40567Fw3(e1q, c40607Fwh);
        synchronized (c40566Fw2.LIZ) {
            if (c40566Fw2.LIZIZ == null) {
                c40566Fw2.LIZIZ = new ArrayDeque();
            }
            ((ArrayDeque) c40566Fw2.LIZIZ).add(c40567Fw3);
        }
        LIZIZ.LIZLLL();
        Keva keva = BetaAppExperiment.LJFF;
        String str = BetaAppExperiment.LIZ;
        if (!keva.contains(str) && BetaAppExperiment.LIZ()) {
            keva.storeLong(str, System.currentTimeMillis());
        }
    }
}
