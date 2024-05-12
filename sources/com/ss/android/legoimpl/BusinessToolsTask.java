package com.ss.android.legoimpl;

import X.C0RN;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EU2;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.app.InitAllServiceImpl;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import java.util.List;

/* loaded from: classes7.dex */
public class BusinessToolsTask implements EE1 {
    public final Application LJLIL;

    @Override // X.EEY
    public final String key() {
        return "BusinessToolsTask";
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
    public final boolean meetTrigger() {
        if (!EU2.LIZ() || TextUtils.equals(EF7.LJIILIIL, "business") || TextUtils.equals(EF7.LJIILIIL, "release_outer_test")) {
            return true;
        }
        return false;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    public BusinessToolsTask(AwemeHostApplication awemeHostApplication) {
        this.LJLIL = awemeHostApplication;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (this.LJLIL != null) {
            InitAllServiceImpl.LJIILLIIL().LIZLLL(this.LJLIL);
        }
    }
}
