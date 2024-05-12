package com.ss.android.ugc.aweme.legoImp.task.ug;

import X.C0RN;
import X.C221108m2;
import X.C62822Ol8;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FGA;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountService;
import java.util.List;

/* loaded from: classes7.dex */
public final class PreviousLoginPlatformSaveTask implements EE1 {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(FGA.LJLIL);

    @Override // X.EEY
    public final String key() {
        return "PreviousLoginPlatformSaveTask";
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
        if (((Keva) this.LJLIL.getValue()).getBoolean("did_save", false)) {
            return;
        }
        AccountService.LJIJ().LJI().tryUpdateStoredLoginPlatform();
        ((Keva) this.LJLIL.getValue()).storeBoolean("did_save", true);
    }
}
