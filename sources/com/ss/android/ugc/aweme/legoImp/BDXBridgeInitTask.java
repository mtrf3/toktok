package com.ss.android.ugc.aweme.legoImp;

import X.C0RN;
import X.C19N;
import X.C37905EuD;
import X.C37936Eui;
import X.C37993Evd;
import X.C38266F0c;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.F0Y;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.hybridkit.experiment.SparkLynxBridgeThreadDispatcherSettings;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BDXBridgeInitTask implements EE1 {
    public final EFK LJLIL;

    @Override // X.EEY
    public final String key() {
        return "BDXBridgeInitTask";
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
        return this.LJLIL;
    }

    public BDXBridgeInitTask(EFK workType) {
        o.LJIIIZ(workType, "workType");
        this.LJLIL = workType;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (C38266F0c.LIZ) {
            return;
        }
        C37993Evd.LIZLLL();
        C37993Evd.LIZ();
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        SparkLynxBridgeThreadDispatcherSettings.SparkLynxBridgeThreadDispatcherModel sparkLynxBridgeThreadDispatcherModel = SparkLynxBridgeThreadDispatcherSettings.LIZ;
        SparkLynxBridgeThreadDispatcherSettings.SparkLynxBridgeThreadDispatcherModel sparkLynxBridgeThreadDispatcherModel2 = (SparkLynxBridgeThreadDispatcherSettings.SparkLynxBridgeThreadDispatcherModel) LIZLLL.LJIIIIZZ("spark_lynx_bridge_thread_dispatcher", SparkLynxBridgeThreadDispatcherSettings.SparkLynxBridgeThreadDispatcherModel.class, sparkLynxBridgeThreadDispatcherModel);
        if (sparkLynxBridgeThreadDispatcherModel2 != null) {
            sparkLynxBridgeThreadDispatcherModel = sparkLynxBridgeThreadDispatcherModel2;
        }
        if (sparkLynxBridgeThreadDispatcherModel.enable) {
            C37905EuD.LJIIIZ = new F0Y();
        }
        C37905EuD.LJIIJJI = C19N.LJ("bdxbridge_log_control", false);
        C37993Evd.LIZIZ();
        C37993Evd.LIZJ();
        C37936Eui.LJII.put("BDXBridgeInitTask_finish", "true");
    }
}
