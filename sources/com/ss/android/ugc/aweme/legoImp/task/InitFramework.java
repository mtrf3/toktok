package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C16880lQ;
import X.C39579Fg7;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.F9J;
import X.FIV;
import X.FIW;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;

/* loaded from: classes7.dex */
public class InitFramework implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "InitFramework";
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
        return 17;
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
        context.getClass();
        C39579Fg7.LJLIL = context;
        FIW.LIZ(EF7.LIZIZ()).getClass();
        try {
            SharedPreferences.Editor edit = F9J.LIZIZ(FIW.LIZIZ, 0, "KEY_NEED_UPLOAD_LAUNCHLOG").edit();
            edit.putInt("json_data", 1);
            edit.commit();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        FIW.LIZ(EF7.LIZIZ()).LIZ = new FIV();
    }
}
