package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C16880lQ;
import X.C191457fJ;
import X.C51556KLg;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.F67;
import X.InterfaceC211828Ta;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiDynamicMapSettings;
import java.util.List;

/* loaded from: classes4.dex */
public final class PoiInitTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "PoiInitTask";
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
        C51556KLg.LIZ.getClass();
        if (C51556KLg.LIZ().enable()) {
            try {
                C51556KLg.LIZ().LJII();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        PoiDynamicMapSettings.LIZ.getClass();
        if (SettingsManager.LIZLLL().LJIIIIZZ("poi_dynamic_map_config", PoiDynamicMapSettings.Config.class, null) == null) {
            SettingsManager.LIZLLL().LJIIIZ(new F67() { // from class: X.8TZ
                @Override // X.F67
                public final void onChanged() {
                    C51556KLg.LIZ.getClass();
                    C191457fJ.LIZ(C51556KLg.LIZ(), "POI_INIT_TASK", false, 6);
                }
            });
        } else {
            C51556KLg.LIZ.getClass();
            C191457fJ.LIZ(C51556KLg.LIZ(), "POI_INIT_TASK", false, 6);
        }
        C51556KLg.LIZ.getClass();
        C51556KLg.LIZ().LJJII();
        InterfaceC211828Ta LJIILIIL = C51556KLg.LIZ().LJIILIIL();
        if (LJIILIIL != null) {
            LJIILIIL.start();
        }
    }
}
