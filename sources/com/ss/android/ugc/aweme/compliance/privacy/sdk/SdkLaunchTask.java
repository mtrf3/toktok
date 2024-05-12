package com.ss.android.ugc.aweme.compliance.privacy.sdk;

import X.C0RN;
import X.C72041SPd;
import X.C72043SPf;
import X.C72045SPh;
import X.C72046SPi;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.SNL;
import android.content.Context;
import com.ss.android.ugc.aweme.AccountService;
import defpackage.t1;
import java.util.List;

/* loaded from: classes13.dex */
public final class SdkLaunchTask implements EE1 {
    public final C72041SPd LJLIL = SNL.LIZIZ();

    @Override // X.EEY
    public final String key() {
        return "SdkLaunchTask";
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
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        this.LJLIL.getClass();
        C72043SPf.LIZ();
        if (t1.LJI()) {
            this.LJLIL.getClass();
            C72045SPh.LIZ(true);
        }
        AccountService.LJIJ().LJIILJJIL(new C72046SPi(this));
    }
}
