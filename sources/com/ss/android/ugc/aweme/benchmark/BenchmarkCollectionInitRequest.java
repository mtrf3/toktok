package com.ss.android.ugc.aweme.benchmark;

import X.C06320Mq;
import X.C0RN;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import java.util.List;

/* loaded from: classes2.dex */
public final class BenchmarkCollectionInitRequest implements EE1 {
    @Override // X.EEY
    public String key() {
        return "BenchmarkCollectionInitRequest";
    }

    @Override // X.EEY
    public /* bridge */ /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public /* bridge */ /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public /* bridge */ /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public int targetProcess() {
        return 512;
    }

    @Override // X.EEY
    public /* bridge */ /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public /* bridge */ /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public EFK type() {
        return EFK.MAIN;
    }

    @Override // X.EEY
    public void run(Context context) {
        C06320Mq.LIZIZ(context);
    }
}
