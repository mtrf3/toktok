package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C221108m2;
import X.C62822Ol8;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.P8H;
import X.P8M;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.AqS74S0000000_11;

/* loaded from: classes12.dex */
public final class InitStorageManagerTask implements EE1 {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS74S0000000_11(1));

    @Override // X.EEY
    public final String key() {
        return "InitStorageManagerTask";
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
        return EFK.MAIN;
    }

    @Override // X.EEY
    public final void run(Context context) {
        P8H.LIZ = new P8M(this);
    }
}
