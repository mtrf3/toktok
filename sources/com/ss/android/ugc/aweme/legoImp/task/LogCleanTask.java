package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C64394PPa;
import X.C66059PwF;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC64395PPb;
import X.PPX;
import X.U49;
import X.X1D;
import android.content.Context;
import com.bytedance.helios.api.consumer.ApmEvent;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class LogCleanTask implements EE1 {
    public CleanModel LJLIL;

    @Override // X.EEY
    public final String key() {
        return "LogCleanTask";
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
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        CleanModel cleanModel = PPX.LIZ;
        CleanModel cleanModel2 = (CleanModel) LIZLLL.LJIIIIZZ("slardar_clean_settings", CleanModel.class, cleanModel);
        if (cleanModel2 != null) {
            cleanModel = cleanModel2;
        }
        this.LJLIL = cleanModel;
        if (cleanModel != null) {
            ApmEvent apmEvent = new ApmEvent("slardar_clean");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("apm:");
            LIZ.append(cleanModel.cleanApm);
            LIZ.append(", alog: ");
            LIZ.append(cleanModel.cleanALog);
            LIZ.append(", npth: ");
            LIZ.append(cleanModel.cleanNpth);
            apmEvent.LIZ(X1D.LIZIZ(LIZ), "clean_config");
            C66059PwF.LIZIZ(apmEvent);
            C64394PPa c64394PPa = new C64394PPa(this, context);
            CopyOnWriteArrayList<InterfaceC64395PPb> copyOnWriteArrayList = U49.LIZIZ;
            if (!copyOnWriteArrayList.contains(c64394PPa)) {
                copyOnWriteArrayList.add(c64394PPa);
                if (!o.LJ(U49.LIZLLL, "")) {
                    c64394PPa.LIZ(U49.LIZJ, U49.LIZLLL);
                    return;
                }
                return;
            }
            return;
        }
        o.LJIJI("config");
        throw null;
    }

    public static void LIZLLL(long j, String str) {
        ApmEvent apmEvent = new ApmEvent("slardar_clean");
        apmEvent.LIZJ(Long.valueOf(j), str);
        C66059PwF.LIZIZ(apmEvent);
    }
}
