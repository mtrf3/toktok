package com.ss.android.ugc.aweme.feed.component;

import X.C0RN;
import X.C10K;
import X.C210908Pm;
import X.C2ZT;
import X.C2ZZ;
import X.C35274Dss;
import X.C36152EGu;
import X.C37301EkT;
import X.C53664L4i;
import X.C54969Lhl;
import X.C57232Ml;
import X.C62822Ol8;
import X.C8QC;
import X.C8QN;
import X.EAR;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FJG;
import X.FRY;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class InitFeedPlatformTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "InitFeedPlatformTask";
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
        if (((Boolean) C35274Dss.LJIIJJI.getValue()).booleanValue()) {
            return EnumC36092EEm.FIRST_WINDOW_FOCUS;
        }
        EnumC36092EEm enumC36092EEm = EnumC36092EEm.DEFAULT;
        o.LJIIIIZZ(enumC36092EEm, "super.scenesType()");
        return enumC36092EEm;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        C62822Ol8 c62822Ol8 = C53664L4i.LIZIZ;
        if (((Boolean) c62822Ol8.getValue()).booleanValue() && ((Boolean) c62822Ol8.getValue()).booleanValue()) {
            C8QN.LIZIZ.getValue();
        }
        if (((Boolean) C53664L4i.LIZJ.getValue()).booleanValue()) {
            C8QN.LIZIZ();
            FRY.LIZ();
            C210908Pm.LIZ();
            C8QC.LIZ();
            C37301EkT.LIZ();
        }
        C54969Lhl.LIZ.storeBoolean("nu_fcp_exp_hit", C36152EGu.LJ());
        FJG.LIZ.getClass();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("fcp_enable_popup_control", false)) {
            C2ZT.LIZ.getClass();
            C2ZT.LIZIZ.getValue();
        }
        if (!C57232Ml.LIZ()) {
            return;
        }
        C10K.LIZIZ(EAR.LJLIL, C2ZZ.LIZ, null);
    }
}
