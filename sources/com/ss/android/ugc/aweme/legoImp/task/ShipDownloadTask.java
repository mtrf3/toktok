package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C37131Ehj;
import X.C37132Ehk;
import X.C38429F6j;
import X.C38433F6n;
import X.C78687UuR;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.F5Q;
import X.F5R;
import X.FutureC38431F6l;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ShipDownloadTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "ShipDownloadTask";
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
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        C38429F6j c38429F6j = C38429F6j.LIZLLL;
        if (AabPluginServiceImpl.LIZLLL().checkPluginInstalled("com.bytedance.tiktok.ship")) {
            C38429F6j.LIZ.LJLILLLLZI.set(4);
            return;
        }
        synchronized (c38429F6j) {
            FutureC38431F6l futureC38431F6l = C38429F6j.LIZ;
            if (futureC38431F6l.LJLILLLLZI.get() != 4 && futureC38431F6l.LJLILLLLZI.get() != 2) {
                futureC38431F6l.LJLIL.acquire();
                futureC38431F6l.LJLILLLLZI.set(2);
                C38429F6j.LIZJ.getClass();
                C38433F6n.LIZIZ = SystemClock.elapsedRealtime();
                IPluginService LIZLLL = AabPluginServiceImpl.LIZLLL();
                o.LJIIIIZZ(LIZLLL, "ServiceManager.get().get…luginService::class.java)");
                C37132Ehk c37132Ehk = new C37132Ehk();
                c37132Ehk.LIZ = "com.bytedance.tiktok.ship";
                c37132Ehk.LIZIZ = true;
                F5Q f5q = new F5Q();
                f5q.LIZ = false;
                f5q.LIZIZ = false;
                f5q.LJFF = TimeUnit.MINUTES.toMillis(0);
                f5q.LIZJ = false;
                f5q.LIZLLL = false;
                f5q.LJ = true;
                c37132Ehk.LJ = new F5R(f5q);
                c37132Ehk.LIZLLL = new C78687UuR();
                LIZLLL.LIZ(new C37131Ehj(c37132Ehk));
            }
        }
    }
}
