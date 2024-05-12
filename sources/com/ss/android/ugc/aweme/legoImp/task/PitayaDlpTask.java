package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C37652Eq8;
import X.C38493F8v;
import X.C66906QNq;
import X.C78841Uwv;
import X.C78842Uww;
import X.E2E;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;

/* loaded from: classes7.dex */
public final class PitayaDlpTask implements EE1 {
    public double LJLIL;
    public C38493F8v LJLJI;
    public final C66906QNq LJLILLLLZI = C78841Uwv.LIZ(System.currentTimeMillis());
    public final C37652Eq8 LJLJJI = new C37652Eq8(this);

    @Override // X.EEY
    public final String key() {
        return "PitayaDlpTask";
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
        DlpSettingsModel dlpSettingsModel = E2E.LIZ;
        DlpSettingsModel dlpSettingsModel2 = (DlpSettingsModel) LIZLLL.LJIIIIZZ("dlp_settings", DlpSettingsModel.class, dlpSettingsModel);
        if (dlpSettingsModel2 != null) {
            dlpSettingsModel = dlpSettingsModel2;
        }
        if (dlpSettingsModel.enabled) {
            this.LJLIL = C78842Uww.LJIIJ(dlpSettingsModel.sampleRate, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 1.0d);
            this.LJLJI = new C38493F8v(this, dlpSettingsModel.breachedThreshold, dlpSettingsModel.packSize);
        }
    }
}
