package com.ss.android.ugc.aweme.compliance.business.gatekeeper;

import X.C0RN;
import X.C39342FcI;
import X.C39783FjP;
import X.C39784FjQ;
import X.C39786FjS;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.pns.gatekeeper.GatekeeperManager;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.GatekeeperService;
import defpackage.e1;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class GatekeeperComplianceInitLegoTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "GatekeeperComplianceInitLegoTask";
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
        return EFK.MAIN;
    }

    @Override // X.EEY
    public final void run(Context context) {
        GatekeeperService run$lambda$0 = GatekeeperManager.LJ();
        if (e1.LIZ(31744, "enable_gatekeeper_for_age_logic_android", true, false)) {
            run$lambda$0.LIZ(new C39784FjQ());
            run$lambda$0.LIZ(new C39783FjP());
            run$lambda$0.LIZ(new C39786FjS());
        }
        if (e1.LIZ(31744, "enable_gatekeeper_for_universal_popup_android", true, false)) {
            run$lambda$0.LIZ(new C39342FcI());
        }
        o.LJIIIIZZ(run$lambda$0, "run$lambda$0");
        run$lambda$0.LIZIZ(new Bundle(), "AppStart");
    }
}
