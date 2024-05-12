package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C10K;
import X.C35154Dqw;
import X.C36922EeM;
import X.C38995FSd;
import X.C67124QWa;
import X.C67128QWe;
import X.C67143QWt;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FKB;
import X.FX1;
import X.M5B;
import X.QOW;
import X.QPR;
import X.QWY;
import X.R1V;
import Y.AgS128S0100000_11;
import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ab.WebSocketInitExperiment;
import com.ss.android.ugc.aweme.notice.api.ab.WsNetAvailableDelayConnectExp;
import com.ss.android.ugc.aweme.websocket.api.ab.WsPingExp;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes12.dex */
public class WebSocketTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "WebSocketTask";
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

    public final void LIZLLL() {
        C36922EeM.LJ("WebSocketTask");
        if (C35154Dqw.LIZ()) {
            C67128QWe.LIZIZ.LIZ.LJFF((Application) EF7.LIZIZ());
        } else {
            QWY LIZ = QWY.LJIIIZ.LIZ();
            Application application = (Application) EF7.LIZIZ();
            LIZ.LJ = true;
            R1V.LIZ.LIZLLL();
            QOW.LIZIZ(application, LIZ.LJFF);
            synchronized (LIZ) {
                EventBus.LIZJ().LJIILJJIL(LIZ);
            }
            if (((Boolean) WsNetAvailableDelayConnectExp.LIZJ.getValue()).booleanValue() || ((Boolean) WsPingExp.LIZJ.getValue()).booleanValue()) {
                EventBus.LIZJ().LJIILJJIL(C67124QWa.LIZ);
            }
            C38995FSd.LJ().scheduleAtFixedRate(QPR.LJLIL, 300 - ((SystemClock.uptimeMillis() - FKB.LJ) / 1000), 300L, TimeUnit.SECONDS);
        }
        FX1.LIZIZ.LIZ.LJIIIIZZ("websocket_task", true);
        M5B m5b = M5B.LJLIL;
        if (M5B.LJLJJI) {
            return;
        }
        if (C35154Dqw.LIZ()) {
            C67128QWe c67128QWe = C67128QWe.LIZIZ;
            c67128QWe.LJIIIIZZ(m5b);
            c67128QWe.LIZJ(M5B.LIZIZ().LJLIL, M5B.LIZIZ().LJLILLLLZI, m5b);
            c67128QWe.LIZJ(M5B.LIZJ().LJLIL, M5B.LIZJ().LJLILLLLZI, m5b);
        } else {
            C67143QWt c67143QWt = QWY.LJIIIZ;
            c67143QWt.LIZ().LIZJ(m5b);
            c67143QWt.LIZ().LIZLLL(M5B.LIZJ(), m5b);
            c67143QWt.LIZ().LIZLLL(M5B.LIZIZ(), m5b);
        }
        M5B.LJLJJI = true;
    }

    @Override // X.EE1
    public final EFK type() {
        int intValue = ((Number) WebSocketInitExperiment.LIZLLL.getValue()).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                return EFK.BOOT_FINISH;
            }
            return EFK.BACKGROUND;
        }
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EEY
    public final void run(Context context) {
        long longValue = ((Number) WebSocketInitExperiment.LJIIIZ.getValue()).longValue() * 1000;
        if (((Boolean) WebSocketInitExperiment.LJIIIIZZ.getValue()).booleanValue() && longValue > 0) {
            C10K.LJII(longValue).LIZLLL(new AgS128S0100000_11(this, 0));
        } else {
            LIZLLL();
        }
    }
}
